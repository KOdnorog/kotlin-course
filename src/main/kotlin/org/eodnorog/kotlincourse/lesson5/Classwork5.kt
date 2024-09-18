package com.cathrino.org.eodnorog.kotlincourse.lesson5

fun main() {
    val sum = "5" + "3" //сложение
    val diff = 10 - 5 //вычитание
    val product = 10 * 5 //умножение
    val quotient = 10 / 5 //деление
    val remainder = 10 % 5 //вычесление остатка от деления

    val isEqual = (5 == 17) //оператор сравнения, например булевых
    val isNotEqual = (5 !== 17) //оператор сравнения, != не равно
    val isGreater = (5 > 3)
    val isLesser = (5 < 3)
    val isGreaterOrEqual = (5 >= 5)
    val isLesserOrEqual = (5 <= 3)

    val andResult = true && true //логические операторы (и или не), оба true -> true, в остальных случаях false
    val orResult = true || false //оба false -> false, в остальных случаях true
    val notResult = !(5 > 3) //переворачивает значение

    var number = 5//оператор присваивания (=) то есть number присваивается значение 5
    number += 3 //присваивание с увеличением
    number -= 2 //присваивание с уменьшением

    number++//операторы инкримента и дикримента, имеющиеся изменяемую переменную, с числовым типом, увеличить или уменьшить на единицу
    number--
    number++
   // println(++number) сначала сложение, потом предоставление результата
    // println(number++) сначала предоставление результата, а после сложение

    val example = ((8 + 1) >= 9) || (6 - 2 != 4) && (2 * 3 == 6) //приоритет () далее ! далее && далее ||


    println(number)
}
