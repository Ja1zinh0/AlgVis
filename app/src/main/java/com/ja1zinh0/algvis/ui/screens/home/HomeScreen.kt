@file:Suppress("UNUSED_EXPRESSION")

package com.ja1zinh0.algvis.ui.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.runtime.Composable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.compose.md_theme_dark_onSecondary
import com.example.compose.md_theme_dark_secondary
import com.example.compose.md_theme_dark_secondaryContainer
import com.ja1zinh0.algvis.R


@Composable
fun HomeScreen(
) {
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
                text = "Hello",
                style = TextStyle(color = Color.White, fontSize = 40.sp),
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Light,
            )
            Text(
                text = "Welcome to Algvis, where you can visualize and learn sorting algorithms",
                style = TextStyle(
                    color = Color.White,
                    textAlign = TextAlign.Center,
                    fontSize = 20.sp,
                ),
                fontStyle = FontStyle.Italic,
                fontWeight = FontWeight.Light,
                modifier = Modifier.fillMaxWidth(0.8f)
            )

            Row {
                Column(modifier = Modifier.padding(top = 40.dp)) {
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
                            text = "Login",
                            style = TextStyle(
                                fontSize = 24.sp,
                                textAlign = TextAlign.Center,
                                color = Color.White
                            ),
                            fontStyle = FontStyle.Italic,
                            fontWeight = FontWeight.Light,
                        )
                    }
                    Text(
                        text = "Forgot password?",
                        modifier = Modifier
                            .padding(start = 105.dp)
                            .clickable { },
                        style = TextStyle(color = Color.White, fontSize = 12.sp),
                        fontStyle = FontStyle.Italic,
                        fontWeight = FontWeight.Light,
                    )
                }
            }

            Row(modifier = Modifier.padding(top = 15.dp)) {
                OutlinedButton(
                    onClick = {},
                    modifier = Modifier
                        .size(220.dp, 50.dp)
                        .border(
                            width = 3.dp,
                            color = md_theme_dark_onSecondary,
                            shape = RoundedCornerShape(50.dp)
                        ),
                    colors = ButtonDefaults.buttonColors(containerColor = md_theme_dark_secondary),
                ) {
                    Text(
                        text = "Sign Up",
                        style = TextStyle(
                            fontSize = 24.sp,
                            textAlign = TextAlign.Center,
                            color = md_theme_dark_onSecondary
                        ),
                        fontStyle = FontStyle.Italic,

                    )
                }
            }
            Column(modifier = Modifier.padding(top = 55.dp)) {
                Text(
                    text = "Sign up using",
                    style = TextStyle(color = Color.White, fontSize = 14.sp),
                    fontStyle = FontStyle.Italic,
                    fontWeight = FontWeight.Light,
                )
                Row(modifier = Modifier.padding(top = 10.dp)) {
                    CustomIconButton(
                        icon = painterResource(id = R.drawable.facebook), // Provide your image resource
                        onClick = { },
                        color = Color.White,
                    )
                    Box(Modifier.padding(start = 3.dp))
                    CustomIconButton(
                        icon = painterResource(id = R.drawable.google), // Provide your image resource
                        onClick = { },
                        color = Color.White,
                    )
                }
            }

        }
    }
}

@Composable
fun CustomIconButton(
    icon: Painter,
    onClick: () -> Unit,
    color: Color
) {
    Image(
        painter = icon,
        contentDescription = null,
        modifier = Modifier.clickable { onClick },
        colorFilter = ColorFilter.tint(color),
    )
}

