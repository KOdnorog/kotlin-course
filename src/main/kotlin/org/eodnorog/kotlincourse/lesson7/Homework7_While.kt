package org.eodnorog.kotlincourse.lesson7

fun main() {
    fiveWhile()
    tenEvenWhile()
    reverseFiveWhile()
    repeatCount()

}

//Задания для Цикла while
//Цикл while:

//- Создайте цикл while, который выводит квадраты чисел от 1 до 5.
fun fiveWhile() {
    var count = 1
    while (count++ < 5) {
        println(count * count)
    }
}

//- Напишите цикл while, который уменьшает число от 10 до 5. После этого вывести результат в консоль
fun tenEvenWhile() {
    var count = 10
    while (count-- > 5) {
        println(count)
    }
}

//Цикл do...while:
//- Используйте цикл do...while, чтобы вывести числа от 5 до 1.
fun reverseFiveWhile() {
    var count = 5
    do {
        println(count--)
    } while (count > 1)
}

//- Создайте цикл do...while, который повторяется, пока счетчик меньше 10, начиная с 5.
fun repeatCount() {
    var count = 5
    do {
        println(count++)
    } while (count < 10)
}
