package org.eodnorog.kotlincourse.lesson13

fun main() {

    //Задачи на приведение коллекций к значению
    val list = listOf(8, 56, 23, 42, 12, 1, 18, 11)
    val strinG = listOf("Привет", "Это", "мир")
    println(list.size > 5) //Проверить, что размер коллекции больше 5 элементов
    println(list.isEmpty()) //Проверить, что коллекция пустая
    println(list.isNotEmpty())//Проверить, что коллекция не пустая
    println(list.getOrElse(3) { 42 }) //Взять элемент по индексу или создать значение если индекса не существует
    println(strinG.joinToString(separator = " ") { "$it!" })//Собрать коллекцию в строку
    println(list.sum())//Посчитать сумму всех значений
    println(list.average())//Посчитать среднее
    println(list.maxOrNull())//Взять максимальное число
    println(list.minOrNull())//Взять минимальное число
    println(list.firstOrNull())//Взять первое число или null
    println(list.contains(42))//Проверить что коллекция содержит элемент

    //Задачи на обработку коллекций

    //1. Отфильтровать коллекцию по диапазону 18-30
    val listNext = listOf(86, 23, 42, 56, 1, 18, 11)
    val task2One = listNext.filter { it in 18..30 }
    println(task2One)

    //2. Выбрать числа, которые не делятся на 2 и 3 одновременно
    val taskTwo =
        listNext.filterNot { it % 2 == 0 && it % 3 == 0 }
    println(taskTwo)

    //3. Очистить текстовую коллекцию от null элементов
    val listNextNext = listOf(10500, null, 42, 56, 1, null, 12, 9)
    val taskThree = listNextNext.filterNotNull()
    println(taskThree)

    //4. Преобразовать текстовую коллекцию в коллекцию длин слов
    val listText = listOf(
        "а",
        "",
        "месяц",
        "невзгоды",
        "пусть",
        "коллекция",
        "список",
        "сто"
    )
    val taskFour = listText.map { it.length }
    println(taskFour)

    //5. Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    val listMapa = listOf(
        "а",
        "",
        "месяц",
        "невзгоды",
        "а роза упала на лапу азора",
        "коллекция",
        "список",
        "сто"
    )
    val taskFive = listMapa.map { it to it.reversed() }
    println(taskFive)

    //6. Отсортировать список в алфавитном порядке

    //7. Отсортировать список по убыванию

    //8. Распечатать квадраты элементов списка

    //9. Группировать список по первой букве слов

    //10. Очистить список от дублей

    //11. Взять первые 3 элемента списка

    //12. Взять последние 3 элемента списка

}
