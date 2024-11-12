package org.eodnorog.kotlincourse.lesson21

class BoxAny(private val item: Any) {

    fun getItem(): Any {
        return item
    }
}

class Box<TYPE>(private val item: TYPE) {
    fun getItem(): TYPE {
        return item
    }
}

fun main() {
    val appleBoxAny = BoxAny("Apple")
    val intBoxAny = BoxAny(42)

    println("В коробке: ${appleBoxAny.getItem()}") // В коробке: Apple
    println("В коробке: ${intBoxAny.getItem()}")   // В коробке: 42

    appleBoxAny.getItem()


    fun <T> printItem(item: T) {
        println("Элемент: $item")
    }

    printItem("Hello")    // Элемент: Hello
    printItem(123)         // Элемент: 123
    printItem(3.14)        // Элемент: 3.14
}

fun <T : Number> sum(a: T, b: T): Double {
    return a.toDouble() + b.toDouble()
}

fun main2() {
    println(sum(5, 10))        // 15.0
    println(sum(3.5, 2.5))     // 6.0
}

class GenericIterator<T : Number, R : Iterable<T>>(
    private val argument: T,
    private val elements: R
) {

    fun printElements() {
        for (e in elements) {
            println(
                e.toString()
                    .repeat(argument.toInt())
            )
        }
    }
}

