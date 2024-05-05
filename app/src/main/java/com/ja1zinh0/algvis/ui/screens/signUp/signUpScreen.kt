package com.ja1zinh0.algvis.ui.screens.signUp

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.md_theme_dark_onSecondary
import com.example.compose.md_theme_dark_secondaryContainer
import com.ja1zinh0.algvis.R
import com.ja1zinh0.algvis.ui.screens.login.CustomTextField

@Composable
fun signUpScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = md_theme_dark_secondaryContainer)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.barchart),
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color(0xFFCEEEFC)),
                modifier = Modifier.padding(top = 40.dp, bottom = 30.dp)
            )
            Text(
                text = "Sign Up",
                style = TextStyle(color = Color.White, fontSize = 40.sp),
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Light,
                modifier = Modifier.padding(bottom = 10.dp, top = 30.dp)
            )
            CustomTextField(label = "Name", onValueChange = {})
            Box(modifier = Modifier.height(15.dp)) {}
            CustomTextField(label = "Email", onValueChange = {})
            Box(modifier = Modifier.height(15.dp)) {}
            CustomTextField(label = "Password", onValueChange = {})
            Box(modifier = Modifier.padding(bottom = 55.dp))
            OutlinedButton(
                onClick = {},
                modifier = Modifier
                    .size(220.dp, 50.dp)
                    .border(
                        width = 1.dp,
                        color = Color.White,
                        shape = RoundedCornerShape(50.dp)
                    ),
                colors = ButtonDefaults.buttonColors(containerColor = md_theme_dark_onSecondary)
            ) {
                Text(
                    text = "Sign Up",
                    style = TextStyle(
                        fontSize = 24.sp,
                        textAlign = TextAlign.Center,
                        color = Color.White
                    ),
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Light,
                )
            }
        }
    }
}