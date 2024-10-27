package org.eodnorog.kotlincourse.lesson15Home

class Moon(
    val isVisible: Boolean,
    var phase: String
) {
    fun showPhase() {
        if (isVisible == true) {
            val isVisibleTrue = when (phase) {
                in "new moon" -> 3
                in "waxing crescent" -> 4..9
                in "first quarter" -> 10..11
                in "waxing gibbous" -> 12..16
                in "full" -> 17..18
                in "waning gibbous" -> 19..24
                in "third quarter" -> 25..26
                in "waning crescent" -> 27..31
                else -> "i don not know this phase of the moon"
            }
            println("If the moon is visible ($isVisible) in October 2024, the phase would be a $phase around October $isVisibleTrue")
        } else println("October 2024: is not Visible, sorry...")
    }
}
