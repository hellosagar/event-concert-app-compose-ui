package dev.sagar.eventconcertapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.ramcosta.composedestinations.DestinationsNavHost
import dev.sagar.eventconcertapp.presentation.NavGraphs
import dev.sagar.eventconcertapp.ui.theme.Black500
import dev.sagar.eventconcertapp.ui.theme.EventConcertAppTheme

class MainActivity : ComponentActivity() {

    @OptIn(ExperimentalFoundationApi::class, ExperimentalMaterialApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {

            EventConcertAppTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Black500
                ) {
                    DestinationsNavHost(navGraph = NavGraphs.root)
                }
            }
        }
    }
}





