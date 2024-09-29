package org.eodnorog.kotlincourse.lesson7

fun main() {
    //five()
    //tenEven()
    //reverseFive()
    //reverseTenStep2()
    //stepTwo()
    //thirdFigure()
    //untilNine()
    //untilFifteen()
}

//Задания для Цикла for
//Прямой Диапазон:
//- Напишите цикл for, который выводит числа от 1 до 5.
fun five() {
    for (i in 1..5) {
        println(i)
    }
}

//- Напишите цикл for, который выводит четные числа от 1 до 10.
fun tenEven() {
    for (i in 1..10) {
        if (i % 2 == 0)
        println(i)
    }
}

//Обратный Диапазон:
//- Создайте цикл for, который выводит числа от 5 до 1.
fun reverseFive(){
    for (i in 5 downTo 1) {
        println(i)
    }
}

//- Создайте цикл for, который выводит числа от 10 до 1, уменьшая их на 2.
fun reverseTenStep2() {
    for (i in 10 downTo 1 step 2) {
        println(i)
    }
}

//С Шагом (step):
//- Используйте цикл for с шагом 2 для вывода чисел от 1 до 9.
fun stepTwo() {
    for (i in 1..9 step 2) {
        println(i)
    }
}

//- Напишите цикл for, который выводит каждое третье число в диапазоне от 1 до 20.
fun thirdFigure() {
    for (i in 1..20) {
        if (i % 3 == 0)
    println(i)
    }
}

//Использование До (until):
//- Используйте цикл for и until, чтобы вывести числа из диапазона 1-9 (9 не включается).
fun untilNine() {
    for (i in 1 until 9)
        println(i)
}

//- Напишите цикл for с until, чтобы вывести числа от 3 до 15, не включая 15.
fun untilFifteen() {
    for (i in 3 until 15)
        println(i)
}
