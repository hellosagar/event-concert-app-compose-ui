package dev.sagar.eventconcertapp.presentation.detail

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.rememberCameraPositionState
import com.ramcosta.composedestinations.annotation.Destination
import com.ramcosta.composedestinations.navigation.DestinationsNavigator
import dev.sagar.eventconcertapp.R
import dev.sagar.eventconcertapp.data.local.listOfEventTiming
import dev.sagar.eventconcertapp.presentation.components.LocationIconWithText
import dev.sagar.eventconcertapp.presentation.components.PictureWithGradient
import dev.sagar.eventconcertapp.ui.theme.Heading1

@Destination
@Composable
fun DetailScreen(
    navigator: DestinationsNavigator
) {

    val headerPainter = painterResource(id = R.drawable.ic_cover)
    val backButtonPainter = painterResource(id = R.drawable.ic_back)
    val shareButtonPainter = painterResource(id = R.drawable.ic_share)
    painterResource(id = R.drawable.ic_location)
    val configuration = LocalConfiguration.current


    val singapore = LatLng(1.35, 103.87)
    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(singapore, 10f)
    }

    LazyColumn {
        item {
            Box(
                modifier = Modifier
                    .height(configuration.screenHeightDp.dp / 2)
                    .padding(bottom = 16.dp)
                    .background(Color.Green)
            ) {

                PictureWithGradient(painter = headerPainter)

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp, top = 16.dp),
                    contentAlignment = Alignment.TopStart,
                ) {
                    IconButton(onClick = { navigator.popBackStack() }) {
                        Icon(
                            painter = backButtonPainter,
                            contentDescription = "Back button",
                            tint = Color.White
                        )
                    }
                }

                Box(
                    contentAlignment = Alignment.TopEnd,
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(top = 16.dp, end = 16.dp)
                ) {
                    IconButton(onClick = {
                        // Do nothing
                    }) {
                        Icon(
                            painter = shareButtonPainter,
                            contentDescription = "Share button",
                            tint = Color.White
                        )
                    }
                }

                Box(
                    modifier = Modifier
                        .fillMaxSize()
                        .padding(start = 16.dp),
                    contentAlignment = Alignment.BottomStart,
                ) {
                    Column(
                        horizontalAlignment = Alignment.Start
                    ) {
                        Text(
                            modifier = Modifier.padding(),
                            text = "Above & Beyond\n" +
                                    "#ABGT500",
                            style = Heading1,
                            lineHeight = 36.sp
                        )

                        Spacer(modifier = Modifier.height(8.dp))


                        LocationIconWithText(iconSize = 20.dp, textSize = 16.sp)
                    }
                }
            }
        }


        item {
            // Line up
            Text(
                modifier = Modifier.padding(start = 16.dp, bottom = 4.dp),
                text = "LINE UP",
                color = Color.White
            )

            Text(
                modifier = Modifier.padding(start = 16.dp, bottom = 24.dp),
                text = "Genix - Ben Bohmer - Ilan Bluestone\n" +
                        "Mat Zo - Pretty Pink - Trance Wax",
                color = Color.White
            )
        }

        // Event timing

        item {
            listOfEventTiming.forEach {
                EventTiming(it)
                Spacer(modifier = Modifier.height(10.dp))
            }
        }


        item {

            Card(
                Modifier
                    .height(150.dp)
                    .fillMaxWidth()
                    .padding(top = 8.dp, start = 16.dp, end = 16.dp, bottom = 24.dp),
                shape = RoundedCornerShape(12.dp)
            ) {
                GoogleMap(
                    modifier = Modifier.fillMaxSize(),
                    cameraPositionState = cameraPositionState,
                )
            }
        }

    }

}