package dev.sagar.eventconcertapp.presentation.events

import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.itemsIndexed
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.geometry.isUnspecified
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.layout.onGloballyPositioned
import androidx.compose.ui.layout.positionInRoot
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import dev.sagar.eventconcertapp.R
import dev.sagar.eventconcertapp.data.local.listOfMyEvents
import dev.sagar.eventconcertapp.ui.theme.Black200
import dev.sagar.eventconcertapp.ui.theme.Gray500
import dev.sagar.eventconcertapp.ui.theme.Heading2

@OptIn(ExperimentalFoundationApi::class)
@ExperimentalMaterialApi
@Destination
@Composable
fun MyEventScreen(
    navigator: DestinationsNavigator
) {

    val backgroundPainter = painterResource(id = R.drawable.event_bg)
    val backButtonPainter = painterResource(id = R.drawable.ic_back)
    val menuPainter = painterResource(id = R.drawable.ic_menu)
    val removePainter = painterResource(id = R.drawable.ic_remove)

    val listOfMyEvents = remember {
        listOfMyEvents
    }

    Box(
        modifier = Modifier
            .fillMaxSize()
    ) {
        Image(
            modifier = Modifier
                .fillMaxHeight(),
            painter = backgroundPainter,
            contentDescription = "Event background",
            contentScale = ContentScale.Crop,
            alpha = 0.3f
        )

        LazyColumn(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {

            // Header icon
            item {
                Spacer(modifier = Modifier.height(16.dp))

                Row(
                    modifier = Modifier
                        .fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween
                ) {
                    IconButton(onClick = { navigator.popBackStack() }) {
                        Icon(
                            painter = backButtonPainter,
                            contentDescription = "Back button",
                            tint = Color.White
                        )
                    }

                    IconButton(onClick = { }) {
                        Icon(
                            painter = menuPainter,
                            contentDescription = "Menu button",
                            tint = Color.White
                        )
                    }
                }

                Spacer(modifier = Modifier.height(8.dp))
            }

            // Title
            item {
                Text(text = "Tus eventos", style = Heading2)

                Spacer(modifier = Modifier.height(24.dp))
            }

            itemsIndexed(
                items = listOfMyEvents,
                key = { _, item ->
                    item.hashCode()
                }) { _, item ->

                val state = rememberDismissState(
                    confirmStateChange = {
                        if (it == DismissValue.DismissedToStart) {
                            listOfMyEvents.remove(item)
                        }
                        true
                    }
                )

                var offSetX by remember {
                    mutableStateOf(0.dp)
                }

                var initialOffset = remember {
                    Offset(Float.NaN, Float.NaN)
                }
                SwipeToDismiss(
                    state = state,
                    background = {
                        Box(Modifier.fillMaxSize(), contentAlignment = Alignment.CenterEnd) {
                            Box(
                                modifier = Modifier
                                    .fillMaxHeight()
                                    .width(65.dp)
                                    .padding(bottom = 30.dp)
                                    .offset(
                                        x = offSetX
                                    )
                                    .background(
                                        color = Black200,
                                        shape = RoundedCornerShape(16.dp)
                                    ),
                                contentAlignment = Alignment.Center
                            ) {
                                Icon(
                                    painter = removePainter,
                                    contentDescription = "Remove icon",
                                    tint = Gray500
                                )
                            }
                        }
                    },
                    dismissContent = {
                        Column(
                            modifier = Modifier
                                .animateItemPlacement()
                                .onGloballyPositioned { layoutCoordinates ->
                                    val position = layoutCoordinates.positionInRoot()
                                    if (initialOffset.isUnspecified) {
                                        initialOffset = position
                                    } else {
                                        val offSetDiscard =
                                            (initialOffset.minus(position)).x
                                                .div(-2)
                                                .plus(120f)
                                        offSetX = if (offSetDiscard >= 0) {
                                            offSetDiscard.dp
                                        } else {
                                            0.dp
                                        }

                                    }
                                }) {
                            MyEventCardItem(myEvent = item)

                            Spacer(modifier = Modifier.height(24.dp))
                        }
                    },
                    directions = setOf(DismissDirection.EndToStart),
                )

            }
        }
    }
}