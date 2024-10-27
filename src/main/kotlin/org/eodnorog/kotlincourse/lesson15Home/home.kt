package org.eodnorog.kotlincourse.lesson15Home

fun main() {
    val meet = Party("Sutyin, Firty str., 17 - 53", 13)
    meet.details()

    val emo = Emotion("грустно", 32)
    emo.express()

    val moon = Moon(true, "waning crescent")
    moon.showPhase()

    val concert = Concert("ИзПодНоги100500", "Литейный завод", 100500.55, 42, 42)
    concert.infoAboutConcert()
    concert.buyTickets()
}
