package com.ja1zinh0.algvis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.compose.AlgvisTheme
import com.example.compose.md_theme_dark_secondaryContainer
import com.ja1zinh0.algvis.ui.screens.home.HomeScreen
import com.ja1zinh0.algvis.ui.screens.login.LoginScreen
import com.ja1zinh0.algvis.ui.screens.signUp.signUpScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlgvisTheme {
                Surface(
                    modifier = Modifier
                        .fillMaxSize()
                        .background(color = md_theme_dark_secondaryContainer)
                ) {
                    val navController = rememberNavController()
                    NavHost(navController = navController, startDestination = "main/{user}") {
                        composable("main/{user}") {
                            HomeScreen(
                                onLoginClick = { navController.navigate("login") },
                                onSignUpClick = {navController.navigate("signUp")}
                            )
                        }
                        composable("login") {
                            LoginScreen()
                        }
                        composable("signUp") {
                            signUpScreen()
                        }
                    }
                }
            }
        }
    }
}
