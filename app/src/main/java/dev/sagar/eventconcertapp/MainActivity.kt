package dev.sagar.eventconcertapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.unit.sp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val fontFamily = FontFamily(
            Font(R.font.poppins_regular, FontWeight.Normal),
        )

        setContent {
            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        color = Color(0xFF101010)
                    )
            ) {
                Text(
                    text = buildAnnotatedString {
                                                withStyle(
                                                    style = SpanStyle(
                                                        color = Color.Cyan,
                                                        fontSize = 20.sp,
                                                        textDecoration = TextDecoration.LineThrough
                                                    )
                                                ){
                                                    append("Jetpack")
                                                }
                        append("Compose")
                    },
                    color = Color.White,
                    fontSize = 30.sp,
                    fontFamily = fontFamily,
                    textDecoration = TextDecoration.Underline
                )
            }

        }
    }
}

