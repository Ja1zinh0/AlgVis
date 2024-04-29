package com.ja1zinh0.algvis.ui.screens.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.md_theme_dark_secondaryContainer
import com.ja1zinh0.algvis.R

@Composable
fun LoginScreen() {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(color = md_theme_dark_secondaryContainer)
    ) {
        Column(
            modifier = Modifier.fillMaxSize(), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(id = R.drawable.barchart),
                contentDescription = null,
                colorFilter = ColorFilter.tint(Color(0xFFCEEEFC)),
                modifier = Modifier.padding(top = 40.dp, bottom = 30.dp)
            )
            Text(
                text = "Login",
                style = TextStyle(color = Color.White, fontSize = 40.sp),
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Light,
            )
            CustomTextField(label = "Email", onValueChange = {})
        }
    }
}

@Composable
fun CustomTextField(
    onValueChange: (String) -> Unit,
    label: String,
) {
    var value by remember { mutableStateOf(TextFieldValue()) }

    OutlinedTextField(
        value = value,
        onValueChange = {
            value = it
            onValueChange(it.text)
        },
        label = { Text(text = label) },
        maxLines = 1,
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Email),
    )
}