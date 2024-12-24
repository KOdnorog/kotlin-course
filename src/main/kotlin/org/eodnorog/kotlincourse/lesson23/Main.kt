package org.eodnorog.kotlincourse.lesson23

//Урок №23. Проверка и приведение типов

fun main() {
    val result = "String".removeSpaces()
    println(result)
}

//в языках без раширения класса
fun String.removeSpaces(): String {
    return replace(" ", "")
}
