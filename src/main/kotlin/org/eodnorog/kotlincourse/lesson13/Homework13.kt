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
    val listNext = listOf(86, 23, 42, 56, 1, 18, 11)
    val task2One = listNext.filter { it in 18..30 }  //Отфильтровать коллекцию по диапазону 18-30
    println(task2One)

    val taskTwo =
        listNext.filterNot { it % 2 == 0 && it % 3 == 0 } //Выбрать числа, которые не делятся на 2 и 3 одновременно
    println(taskTwo)

    val listNextNext = listOf(10500, null, 42, 56, 1, null, 12, 9)
    val taskThree = listNextNext.filterNotNull() //Очистить текстовую коллекцию от null элементов
    println(taskThree)

    //Преобразовать текстовую коллекцию в коллекцию длин слов
    //Преобразовать текстовую коллекцию в мапу, где ключи - слова, а значения - перевёрнутые слова
    //Отсортировать список в алфавитном порядке
    //Отсортировать список по убыванию
    //Распечатать квадраты элементов списка
    //Группировать список по первой букве слов
    //Очистить список от дублей
    //Взять первые 3 элемента списка
    //Взять последние 3 элемента списка
}
