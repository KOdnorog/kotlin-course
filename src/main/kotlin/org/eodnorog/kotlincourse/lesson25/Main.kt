package org.eodnorog.kotlincourse.lesson25

fun main() {

    val increment = fun(a: Int): Int {
        return a + 1
    }

    val increment1: (Int) -> Int = { a ->
        a + 1
    }

    println(increment(1)) //ссылка на функцию

    val findIndex = fun(text: String, word: String, ignoreCase: Boolean): Int {
        return text.indexOf(word, 0, ignoreCase)
    }
    val findIndex1: (String, String, Boolean) -> Int = { text, word, ignoreCase ->
        text.indexOf(word, 0, ignoreCase)
    }

    val findIndex3 = { text: String, word: String, ignoreCase: Boolean ->
        text.indexOf(word, 0, ignoreCase)
    }

    println(findIndex("I love Kotlin", "Love", false))
}

// Обычное объявление функции
fun increment(a: Int): Int {
    return a + 1
}
