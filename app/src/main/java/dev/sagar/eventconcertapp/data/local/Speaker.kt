package dev.sagar.eventconcertapp.data.local

import dev.sagar.eventconcertapp.R

data class Speaker(
    val name: String,
    val date: String,
    val image: Int
)

val listOfSpeakers = listOf<Speaker>(
    Speaker(
        name = "Armin van buuren",
        date = "10 agosto, 2022",
        image = R.drawable.ic_trainer_one
    ),
    Speaker(
        name = "Charlote De Witte",
        date = "09 agosto, 2022",
        image = R.drawable.ic_trainer_two
    ), Speaker(
        name = "Luttrell",
        date = "03 agosto, 2022",
        image = R.drawable.ic_trainer_three
    ), Speaker(
        name = "Eric Prydz",
        date = "29 julio, 2022",
        image = R.drawable.ic_trainer_four
    )
)