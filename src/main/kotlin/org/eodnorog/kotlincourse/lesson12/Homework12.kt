package org.eodnorog.kotlincourse.lesson12

fun main() {
//    noArguments()
//    twoNumbers(5, 2)
//    stringNothing("Nothing")
//    println(srNumbers(listOf(1, 2, 3)))
//    println(numbNullLing("Kelly"))
//    noArgFNumbers()
    println(multiplyByTwo(5))

}

//----- Напиши валидную сигнатура метода -----
//Напишите сигнатуру функции, которая не принимает аргументов и не возвращает значения.
fun noArguments() {}

//Напишите сигнатуру функции, которая принимает два целых числа и возвращает их сумму.
fun twoNumbers(a: Int, b: Int): Int {
    return a + b
}

//Напишите сигнатуру функции, которая принимает строку и ничего не возвращает.
fun stringNothing(a: String) {}

//Напишите сигнатуру функции, которая принимает список целых чисел и возвращает среднее значение типа Double.
fun srNumbers(a: List<Int>): Double {
    var count = 0
    for (b in a) {
        count += b
    }
    count = (count / a.size)
    return (count).toDouble()
}

//Напишите сигнатуру функции, которая принимает nullable строку и возвращает её длину в виде nullable целого числа.
fun numbNullLing(string: String?): Int? {
    return string?.length
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает nullable вещественное число.
fun noArgFNumbers(): Float? {
    return null
}

//Напишите сигнатуру функции, которая принимает nullable список целых чисел и не возвращает значения.
fun numInt(l: List<Int>?) {}

//Напишите сигнатуру функции, которая принимает целое число и возвращает nullable строку.
fun nullStringAndIntArg(a: Int): String? {
    return null
}

//Напишите сигнатуру функции, которая не принимает аргументов и возвращает список nullable строк.
fun nullStringAndNoArg(): List<String>? {
    return null
}

//Напишите сигнатуру функции, которая принимает nullable строку и nullable целое число и возвращает nullable булево значение.
fun nullString(a: String?, b: Int?): Boolean? {
    return null
}

//----- Напиши рабочий код для следующих задач: -----
//Задача 1:
//Напишите функцию multiplyByTwo, которая принимает целое число и возвращает его, умноженное на 2.
fun multiplyByTwo(a: Int) = a * 2

//Задача 2:
//Создайте функцию isEven, которая принимает целое число и возвращает true, если число чётное, и false в противном случае.
fun isEven(a: Int): Boolean {
    if (a % 2 == 0) {
        return true
    } else return false
}

//Задача 3:
//Напишите функцию printNumbersUntil, которая принимает целое число n и выводит на экран числа от 1 до n.
//Если число n меньше 1, функция должна прекратить выполнение с помощью return без вывода сообщений.
fun printNumbersUntil(n: Int) {
    if (n < 1) return
    for (i in 1..n) {
        println(i)
    }
}

//Задача 4:
//Создайте функцию findFirstNegative, которая принимает список целых чисел и возвращает первое отрицательное число в списке.
//Если отрицательных чисел нет, функция должна вернуть null.
fun findFirstNegative(a: List<Int>): Int? {
    for (i in a) {
        if (i < 0) {
            return i
        }
    }
    return null
}

//Задача 5:
//Напишите функцию processList, которая принимает список строк. Функция должна проходить по списку и выводить каждую строку.
//Если встречается null значение, функция должна прекратить выполнение с помощью return без возврата значения.
fun processList(a: List<String?>) {
    for (i in a) {
        if (i == null) {
            return
        } else {
            println(i)
        }
    }
}
