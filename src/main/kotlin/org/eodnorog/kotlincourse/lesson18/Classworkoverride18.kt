package org.eodnorog.kotlincourse.lesson18

class Calc() {
    fun sum(number1: Int, number2: Int): Int {
        return number1 + number2
    }

    fun sum(number1: Double, number2: Double): Double {
        return number1 + number2
    }

    fun sum(number1: String, number2: String): String {
        return number1 + number2
    }

    fun sum(number1: List<Int>, number2: List<Int>): List<Int> {
        return number1 + number2
    }

    fun sum(a: String, b: Boolean): String {
        return a + b.toString()
    }
}

fun main(){
    val cal = Calc()
    println(cal.sum(1,2))
    println(cal.sum(3.1,3.6))
    println(cal.sum("1","2"))
    println(cal.sum(listOf(1,2), listOf(3,4)))
    println(cal.sum("1", false))
}
