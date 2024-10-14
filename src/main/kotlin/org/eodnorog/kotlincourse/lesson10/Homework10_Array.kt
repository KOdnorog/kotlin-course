package org.eodnorog.kotlincourse.lesson10

fun main() {

//------ Работа с массивами Array ------
//Задание 1: Создание и Инициализация Массива
//Создайте массив из 5 целых чисел и инициализируйте его значениями от 1 до 5.
    println(" ")
    val taskHome1Array: Array<Int> = arrayOf(1, 2, 3, 4, 5)
    println("Task # 1: ${taskHome1Array.toList()}")

//Задание 2: Создание Пустого Массива
//Создайте пустой массив строк размером 10 элементов.
    println(" ")
    val taskHome2Array: Array<String> = Array(10) {"o"}
    println("Task # 2: ${taskHome2Array.toList()}")

//Задание 3: Заполнение Массива в Цикле
//Создайте массив из 5 элементов типа Double и заполните его значениями, являющимися удвоенным индексом элемента.
    println(" ")
    println("--- Task - 3 ---")
    println(" ")
    val taskHome3Array: Array<Double> = Array(5) { 0.0 }
    for (i in taskHome3Array.indices) {
        taskHome3Array[i] = (i * 2).toDouble()
        println(taskHome3Array[i])
    }

//Задание 4: Изменение Элементов Массива
//Создайте массив из 5 элементов типа Int. Используйте цикл, чтобы присвоить каждому элементу значение, равное его индексу, умноженному на 3.
    println(" ")
    println("--- Task - 4 ---")
    println(" ")
    val taskHome4Array: Array<Int> = Array(5) { 0 }
    for (i in taskHome4Array.indices) {
        taskHome4Array[i] = (i * 3)
        println(taskHome4Array[i])
    }

//Задание 5: Работа с Nullable Элементами
//Создайте массив из 3 nullable строк. Инициализируйте его одним null значением и двумя строками.
    println(" ")
    println("--- Task - 5 ---")
    println(" ")
    val taskHome5Array: Array<String?> = arrayOf(null,"dhfb","hf")
    println(taskHome5Array.toList())

//Задание 6: Копирование Массива
//Создайте массив целых чисел и скопируйте его в новый массив в цикле.
    println(" ")
    println("--- Task - 6 ---")
    println(" ")
    val taskHome6Array: Array<Int> = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val newArray = Array<Int>(9){0}
    for (i in taskHome6Array.indices) {
        newArray[i] = taskHome6Array[i]
    }
    println(newArray.toList())

//Задание 7: Разница Двух Массивов
//Создайте два массива целых чисел одинаковой длины. Создайте третий массив, вычев значения одного из другого.
    println(" ")
    println("--- Task - 7 ---")
    println(" ")
    val taskHome7ArrayA = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    val taskHome7ArrayB = arrayOf(9, 8, 7, 6, 5, 4, 3, 2, 1)
    val newTaskHome7ArrayC = Array(9) { 0 }
    for (i in newTaskHome7ArrayC.indices) {
        newTaskHome7ArrayC[i] = taskHome7ArrayA[i] - taskHome7ArrayB[i]
    }
    println(newTaskHome7ArrayC.toList())

//Задание 8: Поиск Индекса Элемента
//Создайте массив целых чисел. Найдите индекс элемента со значением 5.
//Если значения 5 нет в массиве, возвращаем -1. Реши задачу через цикл while.
    println(" ")
    println("--- Task - 8 ---")
    println(" ")
    val taskHome8Array = arrayOf(1, 2, 3, 5, 9, 6, 8, 5, 7, 0) //узнать как выводить все индексы "5"
    var count = 0
    var result = -1
    while (count < taskHome8Array.size) {
        if(taskHome8Array[count] == 5){
            result = count
            break
        }
        count++
    }
    println(result)


//Задание 9: Перебор Массива
//Создайте массив целых чисел. Используйте цикл для перебора массива и вывода каждого элемента в консоль.
//Напротив каждого элемента должно быть написано “чётное” или “нечётное”.
    println(" ")
    println("--- Task - 9 ---")
    println(" ")
    val taskHome9Array = arrayOf(1, 2, 3, 4, 9, 6, 8, 8, 7, 0)
    for (i in taskHome9Array) {
        if (i % 2 == 0 && i != 0) {
            println("$i - чётное")
        } else if (i == 0) {
            println("$i - Просто ноль :)")
        } else println("$i - нечётное")
    }

    println(" ")
    println("--- Task - 10 ---")
    println(" ")
    println(taskHome10Array(arrayOf("игра", "вода", "лодка"), "од")) //узнать как выводить все значения
}

//Задание 10: Поиск Значения в Массиве по вхождению
//Создай функцию, которая принимает массив строк и строку для поиска.
//Функция должна находить в массиве элемент, в котором принятая строка является подстрокой (метод contains()).
//Верни найденный элемент из функции в виде строки.

fun taskHome10Array(array: Array<String>, searchString: String): String {
    for (i in array) {
        if (i.contains(searchString)) {
            return i
        }
    }
    return searchString
}
