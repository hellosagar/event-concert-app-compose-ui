package dev.sagar.eventconcertapp.ui.theme

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CustomButton(
    text: String,
    modifier: Modifier = Modifier,
    contentColor: Color = Color.White,
    backgroundColor: Color = Purple500,
    weight: FontWeight = FontWeight.Medium,
    onClick: () -> Unit
) {
    Button(
        modifier = modifier.height(42.dp),
        shape = RoundedCornerShape(percent = 30),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundColor,
            contentColor = contentColor
        ),
        onClick = {
            onClick.invoke()
        }) {
        Text(text = text, fontWeight = weight)
    }
}

val Heading1 = TextStyle(
    fontSize = 28.sp,
    color = Color.White,
    fontWeight = FontWeight.Bold
)

val Heading2 = TextStyle(
    fontSize = 18.sp,
    color = Color.White,
    fontWeight = FontWeight.Medium
)

val Heading3 = TextStyle(
    fontSize = 16.sp,
    color = Color.White,
    fontWeight = FontWeight.Medium
)