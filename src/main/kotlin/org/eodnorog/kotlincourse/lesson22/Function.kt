package org.eodnorog.kotlincourse.lesson22

fun main() {
    val result = "String".removeSpaces()
    println(result)

    val s = listOf(1, null)
    s.isElementsNullOrEmpty()
}

//в языках без раширения класса
fun String.removeSpaces(): String {
    return replace(" ", "")
}

//файл collection.kt можно найти другие дополнительные функции
fun <T> List<T?>.isElementsNullOrEmpty(): Boolean {
    return this.all { it == null } || this.isEmpty()
}

