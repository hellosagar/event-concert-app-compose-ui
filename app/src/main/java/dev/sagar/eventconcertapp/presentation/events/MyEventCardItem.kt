package dev.sagar.eventconcertapp.presentation.events

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.sagar.eventconcertapp.data.local.MyEvent
import dev.sagar.eventconcertapp.presentation.components.LocationIconWithText
import dev.sagar.eventconcertapp.ui.theme.Black500
import dev.sagar.eventconcertapp.ui.theme.Purple200
import dev.sagar.eventconcertapp.ui.theme.Purple500

@Composable
fun MyEventCardItem(myEvent: MyEvent) {

    Column {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(150.dp),
            shape = RoundedCornerShape(8.dp),
            elevation = 0.dp
        ) {
            Box(modifier = Modifier.fillMaxSize()) {

                Box(modifier = Modifier.fillMaxSize()) {
                    Image(
                        modifier = Modifier.fillMaxSize(),
                        painter = painterResource(id = myEvent.drawable),
                        contentDescription = "Cover photo",
                        contentScale = ContentScale.Crop,
                    )

                    Box(
                        modifier = Modifier
                            .fillMaxSize()
                            .background(
                                brush = Brush.verticalGradient(
                                    colors = listOf(
                                        Color.Transparent,
                                        Black500
                                    )
                                ), alpha = 0.7f
                            )
                    )
                }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp, top = 14.dp),
                    contentAlignment = Alignment.TopStart
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = myEvent.date,
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Bold,
                            color = Color.White
                        )
                        Text(
                            text = myEvent.month,
                            fontSize = 12.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp, bottom = 12.dp),
                    contentAlignment = Alignment.BottomStart
                ) {
                    Column {
                        Text(
                            text = myEvent.title,
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Medium,
                            color = Color.White
                        )

                        LocationIconWithText(iconColor = Purple200, textColor = Purple200)
                    }
                }

            }
        }

        Box(
            modifier = Modifier
                .padding(horizontal = 16.dp)
                .height(7.dp)
                .fillMaxWidth()
                .clip(
                    shape = RoundedCornerShape(
                        topStart = 0f,
                        topEnd = 0f,
                        bottomEnd = 80f,
                        bottomStart = 80f
                    )
                )
                .background(Purple500)
        )

    }


}