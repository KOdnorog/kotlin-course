package org.eodnorog.kotlincourse.lesson15Home

class Emotion(
    val type: String,
    var intensity:Int
) {
    fun express(){
        val intesive = when(intensity){
            in 0..25 -> "совсем не $type"
            in 26..50 -> "немного $type"
            in 51..75 -> "довольно $type"
            in 76..100 ->"очень сильно $type"
            else -> "не знаю"
        }
        println("Мне сегодня: $type, а по интенсивности: $intesive")
    }
}
