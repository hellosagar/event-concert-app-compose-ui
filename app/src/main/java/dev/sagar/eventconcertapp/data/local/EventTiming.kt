package dev.sagar.eventconcertapp.data.local

data class EventTiming(
    val date: String,
    val month: String,
    val title: String,
    val time: String,
    val venue: String
)

val listOfEventTiming = listOf<EventTiming>(
    EventTiming(
        date = "15",
        month = "SEP",
        title = "Pre-Party",
        time = "Sábado 6:00 pm",
        venue = "Dolby Theatre"
    ),
    EventTiming(
        date = "16",
        month = "SEP",
        title = "#ABGT500",
        time = "Domingo 12:00 pm",
        venue = "Dolby Theatre"
    ),

)
