package dev.sagar.eventconcertapp.data.local

import androidx.compose.runtime.mutableStateListOf
import dev.sagar.eventconcertapp.R

data class MyEvent(
    val id: Int,
    val title: String,
    val date: String,
    val month: String,
    val location: String,
    val drawable: Int
)

val listOfMyEvents = mutableStateListOf(
    MyEvent(
        id = 1,
        title = "Solomun",
        date = "19",
        month = "SEP",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_one
    ),
    MyEvent(
        id = 2,
        title = "Amelie Lens",
        date = "21",
        month = "SEP",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_two
    ),
    MyEvent(
        id = 3,
        title = "Hot Since 82",
        date = "02",
        month = "OCT",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_three
    ),
    MyEvent(
        id = 4,
        title = "Hot Since 82",
        date = "27-29",
        month = "OCT",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_four
    ), MyEvent(
        id = 5,
        title = "Solomun",
        date = "19",
        month = "SEP",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_one
    ),
    MyEvent(
        id = 6,
        title = "Amelie Lens",
        date = "21",
        month = "SEP",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_two
    ),
    MyEvent(
        id = 7,
        title = "Hot Since 82",
        date = "02",
        month = "OCT",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_three
    ),
    MyEvent(
        id = 8,
        title = "Hot Since 82",
        date = "27-29",
        month = "OCT",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_four
    ),
    MyEvent(
        id = 9,
        title = "Solomun",
        date = "19",
        month = "SEP",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_one
    ),
    MyEvent(
        id = 10,
        title = "Amelie Lens",
        date = "21",
        month = "SEP",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_two
    ),
    MyEvent(
        id = 11,
        title = "Hot Since 82",
        date = "02",
        month = "OCT",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_three
    ),
    MyEvent(
        id = 12,
        title = "Hot Since 82",
        date = "27-29",
        month = "OCT",
        location = "Los Angeles, USA",
        drawable = R.drawable.event_cover_four
    )
)
