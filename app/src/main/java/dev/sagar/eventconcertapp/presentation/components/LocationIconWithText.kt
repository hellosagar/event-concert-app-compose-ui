package dev.sagar.eventconcertapp.presentation.components

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.sagar.eventconcertapp.R

@Composable
fun LocationIconWithText(
    iconSize: Dp = 12.dp,
    iconColor: Color = Color.White,
    textSize: TextUnit = 12.sp,
    textColor: Color = Color.White
){
    Row(
        verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            modifier = Modifier
                .size(iconSize),
            painter = painterResource(id = R.drawable.ic_location),
            contentDescription = "Location",
            tint = iconColor
        )

        Spacer(modifier = Modifier.width(4.dp))

        Text(
            text = "Los Angeles, California",
            color = textColor,
            fontSize = textSize
        )
    }
}