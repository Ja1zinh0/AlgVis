package com.ja1zinh0.algvis

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.compose.AlgvisTheme
import com.ja1zinh0.algvis.ui.screens.login.LoginScreen

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AlgvisTheme {
                LoginScreen()
            }
        }
    }
}
