package dev.sagar.eventconcertapp.data.local

import dev.sagar.eventconcertapp.R

data class Event(
    val title:String,
    val date: String,
    val drawable: Int
)

val listOfEvents = listOf(
    Event(
        title = "Amelie Lens",
        date = "21 septiembre, 2022",
        drawable = R.drawable.ic_event_one
    ),
    Event(
        title = "Exit Festival",
        date = "27-29 octubre, 2022",
        drawable = R.drawable.ic_event_two
    ), Event(
        title = "Carl Cox",
        date = "02 noviembre, 2022",
        drawable = R.drawable.ic_event_three
    ), Event(
        title = "Amelie Lens",
        date = "21 septiembre, 2022",
        drawable = R.drawable.ic_event_one
    ),
    Event(
        title = "Exit Festival",
        date = "27-29 octubre, 2022",
        drawable = R.drawable.ic_event_two
    ), Event(
        title = "Carl Cox",
        date = "02 noviembre, 2022",
        drawable = R.drawable.ic_event_three
    ), Event(
        title = "Amelie Lens",
        date = "21 septiembre, 2022",
        drawable = R.drawable.ic_event_one
    ),
    Event(
        title = "Exit Festival",
        date = "27-29 octubre, 2022",
        drawable = R.drawable.ic_event_two
    ), Event(
        title = "Carl Cox",
        date = "02 noviembre, 2022",
        drawable = R.drawable.ic_event_three
    )
)