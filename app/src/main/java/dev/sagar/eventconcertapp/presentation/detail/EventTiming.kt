package dev.sagar.eventconcertapp.presentation.detail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Alignment.Companion.CenterVertically
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.sagar.eventconcertapp.R
import dev.sagar.eventconcertapp.data.local.EventTiming
import dev.sagar.eventconcertapp.ui.theme.Black200
import dev.sagar.eventconcertapp.ui.theme.Gray200
import dev.sagar.eventconcertapp.ui.theme.Heading2
import dev.sagar.eventconcertapp.ui.theme.Purple500

@Composable
fun EventTiming(
    eventTiming: EventTiming
) {
    val bookmarkPainter = painterResource(id = R.drawable.ic_bookmark)

    Card(
        modifier = Modifier
            .height(86.dp)
            .padding(start = 16.dp, end = 16.dp),
        backgroundColor = Black200,
        shape = RoundedCornerShape(16.dp),
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            horizontalArrangement = Arrangement.SpaceBetween
        ) {
            Row(
                verticalAlignment = CenterVertically,
                modifier = Modifier
                    .fillMaxHeight()
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxHeight()
                        .background(color = Gray200, shape = RoundedCornerShape(12.dp))
                        .padding(start = 16.dp, end = 16.dp),
                    verticalArrangement = Arrangement.Center,
                    horizontalAlignment = Alignment.CenterHorizontally
                ) {
                    Text(text = eventTiming.date, fontSize = 24.sp, fontWeight = FontWeight.Bold)
                    Text(text = eventTiming.month, fontSize = 16.sp, fontWeight = FontWeight.Medium)
                }

                Spacer(modifier = Modifier.width(16.dp))

                Column(horizontalAlignment = Alignment.Start) {
                    Text(
                        modifier = Modifier.padding(bottom = 2.dp),
                        text = eventTiming.title,
                        style = Heading2
                    )
                    Text(
                        modifier = Modifier.padding(bottom = 2.dp),
                        text = eventTiming.time,
                        fontSize = 13.sp,
                        color = Color.White
                    )

                    Text(
                        modifier = Modifier.padding(bottom = 2.dp),
                        text = eventTiming.venue,
                        fontSize = 13.sp,
                        color = Color.White
                    )
                }
            }

            Row(
                verticalAlignment = CenterVertically,
                horizontalArrangement = Arrangement.End,
                modifier = Modifier
                    .fillMaxHeight()
            ) {

                Box(
                    modifier = Modifier
                        .background(
                            color = Purple500,
                            shape = RoundedCornerShape(13.dp)
                        )
                        .padding(start = 18.dp, end = 18.dp, top = 13.dp, bottom = 13.dp)
                        .width(20.dp)
                        .height(26.dp),
                    contentAlignment = Center
                ) {
                    Text(
                        text = "Ir",
                        color = Color.White, fontSize = 16.sp
                    )

                }
                Spacer(modifier = Modifier.width(8.dp))

                Box(
                    modifier = Modifier
                        .background(
                            color = Gray200,
                            shape = RoundedCornerShape(13.dp)
                        )
                        .padding(start = 18.dp, end = 18.dp, top = 13.dp, bottom = 13.dp)
                        .width(20.dp)
                        .height(26.dp),
                    contentAlignment = Center
                ) {
                    Image(
                        modifier = Modifier.fillMaxSize(),
                        painter = bookmarkPainter,
                        contentDescription = "Bookmark button",
                        contentScale = ContentScale.Crop
                    )
                }

            }

        }

    }

}