package dev.sagar.eventconcertapp.presentation.home

import android.widget.Toast
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.annotation.RootNavGraph
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import dev.sagar.eventconcertapp.R
import dev.sagar.eventconcertapp.data.local.listOfEvents
import dev.sagar.eventconcertapp.data.local.listOfSpeakers
import dev.sagar.eventconcertapp.ui.theme.*


@RootNavGraph(start = true)
@Destination()
@Composable
fun HomeScreen(
    navigator: DestinationsNavigator
) {

    val painterCover = painterResource(id = R.drawable.ic_cover)
    val profilePainter = painterResource(id = R.drawable.ic_profile)
    val menuPainter = painterResource(id = R.drawable.ic_menu)
    val context = LocalContext.current

    LazyColumn(
        modifier = Modifier
            .fillMaxHeight()
            .background(color = Black500)
    ) {
        item {
            // Header with image and text
            Box(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(300.dp)
            ) {
                Image(
                    modifier = Modifier
                        .fillMaxSize(),
                    painter = painterCover,
                    contentDescription = "Cover photo",
                    contentScale = ContentScale.Crop,
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
                                )
                            )
                        )
                )

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.TopStart,
                ) {
                    Image(
                        modifier = Modifier
                            .padding(start = 16.dp, top = 16.dp)
                            .width(34.dp)
                            .height(34.dp)
                            .clip(shape = CircleShape),
                        painter = profilePainter,
                        contentDescription = "Profile photo",
                        contentScale = ContentScale.Crop
                    )
                }

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.TopEnd,
                ) {
                    Image(
                        modifier = Modifier
                            .padding(end = 16.dp, top = 16.dp)
                            .width(24.dp)
                            .height(24.dp),
                        painter = menuPainter,
                        contentDescription = "Menu",
                    )
                }

                Box(
                    modifier = Modifier.fillMaxSize(),
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Column(horizontalAlignment = Alignment.CenterHorizontally) {
                        Text(
                            text = "Evento proximo",
                            textAlign = TextAlign.Center,
                            color = Color.White
                        )
                        Text(
                            text = "Above & Beyond\n#ABGT500",
                            textAlign = TextAlign.Center,
                            style = Header1
                        )
                    }
                }
            }


            Spacer(modifier = Modifier.height(16.dp))
        }

        // Dual Buttons
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceEvenly,
            ) {
                CustomButton(text = "Ver fechas", modifier = Modifier.weight(1f)) {
                    Toast.makeText(context, "Hi 1", Toast.LENGTH_SHORT).show()
                }

                Spacer(modifier = Modifier.width(16.dp))

                CustomButton(
                    text = "Boletos",
                    modifier = Modifier.weight(1f),
                    backgroundColor = Black200
                ) {
                    Toast.makeText(context, "Hi 1", Toast.LENGTH_SHORT).show()
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
        }

        // Horizontal event list
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(text = "Eventos en tu ciudad", style = Header3)

                Text(text = "Ver más", color = Purple200, fontSize = 14.sp)
            }

            Spacer(modifier = Modifier.height(12.dp))

            LazyRow(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                horizontalArrangement = Arrangement.spacedBy(10.dp),
                contentPadding = PaddingValues(start = 16.dp, end = 16.dp)
            ) {
                itemsIndexed(listOfEvents) { index, item ->
                    EventCardItem(item)
                }
            }

            Spacer(modifier = Modifier.height(20.dp))
        }

        // Event speakers
        item {
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween
            ) {

                Text(text = "Eventos pasados", style = Header3)

                Text(text = "Ver más", color = Purple200, fontSize = 14.sp)

            }

            Spacer(modifier = Modifier.height(12.dp))
        }

        items(listOfSpeakers.windowed(2, 2, true)) { subList ->
            Row(
                modifier = Modifier
                    .fillMaxWidth()
                    .height(70.dp)
                    .padding(start = 16.dp, end = 16.dp),
                horizontalArrangement = Arrangement.SpaceBetween,
            ) {
                subList.forEach {
                    SpeakerItem(
                        speaker = it,
                        modifier = Modifier
                            .weight(1f)

                    )
                }
            }
        }

        item {
            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}