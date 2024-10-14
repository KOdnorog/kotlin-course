package org.eodnorog.kotlincourse.lesson12

fun main() { //функции

}

//fun имяФуенкции(параметры): ТипВозвращаемогоЗначения {
//    //Тело функции
//    return значение
//}

fun sayHello() {
    println("Hello, Kotlin!")
}

fun greetUser(name: String) {
    println("Hello, $name!")
}

fun sum(a: Int, b: Int): Int {
    return a + b
}

fun printSum(a: Int, b: Int) {
    println("Sum of $a and $b is ${a + b}")
}

fun multiply(a: Int, b: Int): Int = a * b //равно используется, если только одна строчка кода

private fun calculateDiscount(price: Double): Double { //доступно только внутри файла
    return price * 0.1
}

fun finalPrice(price: Double): Double {
    val discount = calculateDiscount(price)
    return price - discount
}

fun max(a: Int, b: Int): Int {
    return if (a > b) a else b
}

fun findValue(numbers: List<Int>, target: Int) {
    for (number in numbers) {
        if (number == target) {
            println("Value found: $number")
            return
        }
    }
    println("Value not found")
}
