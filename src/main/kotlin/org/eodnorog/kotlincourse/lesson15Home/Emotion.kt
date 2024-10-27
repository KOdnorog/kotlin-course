package org.eodnorog.kotlincourse.lesson15Home

class Emotion(
    val type: String,
    val intensity:Int
) {
    fun express(){
        println("If you $type than $intensity")
    }
}
