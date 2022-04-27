package dev.sagar.eventconcertapp.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.IntSize
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import dev.sagar.eventconcertapp.R
import dev.sagar.eventconcertapp.data.local.LocalEvent
import dev.sagar.eventconcertapp.ui.theme.Black500

@Composable
fun EventCardItem(
    localEvent: LocalEvent
) {

    var sizeImage by remember { mutableStateOf(IntSize.Zero) }

    Card(
        modifier = Modifier
            .width(160.dp)
            .background(color = Color.Transparent),
        shape = RoundedCornerShape(percent = 9)
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .onGloballyPositioned {
                    sizeImage = it.size
                }
        ) {
            Image(
                modifier = Modifier.fillMaxSize(),
                painter = painterResource(id = localEvent.drawable),
                contentDescription = "Event Card",
                contentScale = ContentScale.Crop
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .background(
                        brush = Brush.verticalGradient(
                            colors = listOf(
                                Color.Transparent,
                                Color.Black
                            ),
                            startY = sizeImage.height.toFloat() / 2
                        )
                    )
            )

            Box(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(start = 14.dp, bottom = 8.dp),
                contentAlignment = Alignment.BottomStart
            ) {
                Column {
                    Text(
                        text = localEvent.title,
                        color = Color.White,
                        fontWeight = FontWeight.Bold,
                        fontSize = 18.sp
                    )
                    Text(text = localEvent.date, color = Color.White, fontSize = 10.sp)
                }
            }

            Box(modifier = Modifier.fillMaxSize(), contentAlignment = Alignment.TopEnd) {
                Box(
                    modifier = Modifier
                        .wrapContentSize()
                        .padding(end = 8.dp, top = 8.dp)
                        .background(color = Black500, shape = RoundedCornerShape(8.dp))
                        .padding(8.dp),
                    contentAlignment = Alignment.Center,
                ) {
                    Image(
                        modifier = Modifier
                            .width(16.dp)
                            .height(16.dp),
                        painter = painterResource(id = R.drawable.ic_heart),
                        contentDescription = "Like"
                    )

                }
            }
        }

    }


}


