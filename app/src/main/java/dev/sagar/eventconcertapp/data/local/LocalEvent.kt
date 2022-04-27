package dev.sagar.eventconcertapp.data.local

import dev.sagar.eventconcertapp.R

data class LocalEvent(
    val title:String,
    val date: String,
    val drawable: Int
)

val listOfEvents = listOf(
    LocalEvent(
        title = "Amelie Lens",
        date = "21 septiembre, 2022",
        drawable = R.drawable.ic_event_one
    ),
    LocalEvent(
        title = "Exit Festival",
        date = "27-29 octubre, 2022",
        drawable = R.drawable.ic_event_two
    ), LocalEvent(
        title = "Carl Cox",
        date = "02 noviembre, 2022",
        drawable = R.drawable.ic_event_three
    ), LocalEvent(
        title = "Amelie Lens",
        date = "21 septiembre, 2022",
        drawable = R.drawable.ic_event_one
    ),
    LocalEvent(
        title = "Exit Festival",
        date = "27-29 octubre, 2022",
        drawable = R.drawable.ic_event_two
    ), LocalEvent(
        title = "Carl Cox",
        date = "02 noviembre, 2022",
        drawable = R.drawable.ic_event_three
    ), LocalEvent(
        title = "Amelie Lens",
        date = "21 septiembre, 2022",
        drawable = R.drawable.ic_event_one
    ),
    LocalEvent(
        title = "Exit Festival",
        date = "27-29 octubre, 2022",
        drawable = R.drawable.ic_event_two
    ), LocalEvent(
        title = "Carl Cox",
        date = "02 noviembre, 2022",
        drawable = R.drawable.ic_event_three
    )
)