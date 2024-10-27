package org.eodnorog.kotlincourse.lesson15Home

class Concert(
    val group: String,
    var venue: String,
    var price: Double,
    val seats: Int,
    private var soldTicket: Int
) {
    fun infoAboutConcert() {
        println("Скоро будет концерт у группы \"$group\", билет всего за $price руб., кстати в концертном зале \"$venue\"! Успей купить уже сейчас!")
    }

    fun buyTickets() {
        if (soldTicket < seats) {
            soldTicket++
        } else {
            println("SOLD OUT!!!")
        }
    }
}
