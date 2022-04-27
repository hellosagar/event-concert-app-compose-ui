package dev.sagar.eventconcertapp.presentation.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import dev.sagar.eventconcertapp.ui.theme.Black500

@Composable
fun PictureWithGradient(
    imageModifier: Modifier = Modifier.fillMaxSize(),
    painter: Painter,
    contentScale: ContentScale = ContentScale.Crop,
) {
    Box(modifier = Modifier.fillMaxSize()) {
        Image(
            modifier = imageModifier,
            painter = painter,
            contentDescription = "Cover photo",
            contentScale = contentScale,
        )

        Box(
            modifier = Modifier
                .fillMaxSize()
                .background(
                    brush = Brush.verticalGradient(
                        colors = listOf(
                            Black500,
                            Color.Transparent,
                            Color.Transparent,
                            Color.Transparent,
                            Color.Transparent,
                            Black500,
                            Black500,
                            Black500
                        ), startY = 0f
                    )
                )
        )
    }
}