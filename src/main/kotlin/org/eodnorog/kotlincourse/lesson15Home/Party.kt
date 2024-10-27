package org.eodnorog.kotlincourse.lesson15Home

class Party(
    val location: String,
    var attendees: Int,
) {
    fun details() {
        println("Hello, see you at my party at 5 pm in $location. I think you will meet with $attendees people there.")
    }
}
