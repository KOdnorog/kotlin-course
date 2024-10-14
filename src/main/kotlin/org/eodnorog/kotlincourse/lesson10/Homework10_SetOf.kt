package org.eodnorog.kotlincourse.lesson10

fun main() {
//------ Работа с Множествами Set ------
//Задание 1: Создание Пустого Множества
//Создайте пустое неизменяемое множество целых чисел.
    println(" ")
    val taskHome1Set = setOf<Int>()
    println("Task # 1: $taskHome1Set")

//Задание 2: Создание и Инициализация Множества
//Создайте неизменяемое множество целых чисел, содержащее три различных элемента (например, 1, 2, 3).
    println(" ")
    val taskHome2Set = setOf(11, 22, 33)
    println("Task # 2: $taskHome2Set")

//Задание 3: Создание Изменяемого Множества
//Создайте изменяемое множество строк и инициализируйте его несколькими значениями (например, "Kotlin", "Java", "Scala").
    println(" ")
    val taskHome3Set = setOf("Kotlin", "Java", "Scala")
    println("Task # 3: $taskHome3Set")

//Задание 4: Добавление Элементов в Множество
//Имея изменяемое множество строк, добавьте в него новые элементы (например, "Swift", "Go").
    println(" ")
    val taskHome4Set = mutableSetOf("Kotlin", "Java", "Scala")
    taskHome4Set.add("Swift")
    taskHome4Set.add("Go")
    println("Task # 4: $taskHome4Set")

//Задание 5: Удаление Элементов из Множества
//Имея изменяемое множество целых чисел, удалите из него определенный элемент (например, 2).
    println(" ")
    val taskHome5Set = mutableSetOf(11, 22, 33, 565)
    taskHome5Set.remove(33)
    println("Task # 5: $taskHome5Set")

//Задание 6: Перебор Множества в Цикле
//Создайте множество целых чисел и используйте цикл для вывода каждого элемента на экран.
    println(" ")
    println("--- Task - 6 ---")
    println(" ")
    val taskHome6Set = mutableSetOf(1991, 1992, 1993, 1994, 1995, 1996, 1997)
    for (i in taskHome6Set) {
        println(i)
    }
    println("")
    println("--- **** - ** ---")

//Задание 7: Проверка Наличия Элемента в Множестве
//Создай функцию, которая принимает множество строк (set) и строку и проверяет, есть ли в множестве указанная строка.
//Нужно вернуть булево значение true если строка есть. Реши задачу через цикл.
    println(" ")
    println("Task # 7: ${taskHome7Set(setOf("4", "7", "6", "6", "9", "35", "23", "8"), "4")}")
    println(" ")

//Задание 8: Объединение Двух Множеств
//Создайте два множества строк и объедините их в одно новое множество, содержащее все уникальные элементы обоих множеств. Реши задачу с помощью циклов.
    val taskHome8SetA = setOf("Kotest", "iOS", "True", "Android", "False")
    val taskHome8SetB = setOf("Yapp", "True", "False", "Hippo")
    val taskHome8SetC = mutableSetOf<String>()
    for (i in taskHome8SetA) {
        taskHome8SetC.add(i)
    }
    for (i in taskHome8SetB) {
        taskHome8SetC.add(i)
    }
    println("Task # 8: $taskHome8SetC")
    println(" ")


//Задание 9: Нахождение Пересечения Множеств
//Создайте два множества целых чисел и найдите их пересечение (общие элементы). Реши задачу через вложенные циклы.
    val taskHome9SetA = setOf(3, 4, 13, 17, 27, 14)
    val taskHome9SetB = setOf(2, 4, 22, 3, 12, 44, 17)
    val taskHome9SetC = mutableSetOf<Int>()
    for (i in taskHome9SetA) {
        for (a in taskHome9SetB)
            if (i == a) {
                taskHome9SetC.add(i)
            }
    }
    println("Task # 9: $taskHome9SetC")
    println(" ")

//Задание 10: Нахождение Разности Множеств
//Создайте два множества строк и найдите разность первого множества относительно второго (элементы, присутствующие в первом множестве, но отсутствующие во втором).
//Реши задачу через вложенные циклы и переменные флаги.
    val taskHome10SetA = setOf("Joey", "doesn't", "share", "food", "roblox")
    val taskHome10SetB = setOf("I", "99", "doesn't", "food", "am")
    val taskHome10SetC = mutableSetOf<String>()
    for (i in taskHome10SetA) {
        var boolean: Boolean = false
        for (a in taskHome10SetB)
            if (i != a) {
                taskHome10SetC.add(i)
                taskHome10SetC.remove(a)
            }
    }
    println("Task # 10: $taskHome10SetC")
    println(" ")


//Задание 11: Конвертация Множества в Список
//Создайте множество строк и конвертируйте его в список с использованием цикла.
    val taskHome11Set = mutableSetOf(1991, 1992, 1993, 1994, 1995, 1996, 1997)
    val newTaskHome11Set = mutableListOf<Int>()
    for (i in taskHome11Set) {
        newTaskHome11Set.add(i)
    }
    println("Task # 11: $newTaskHome11Set")
    println(" ")
}

fun taskHome7Set(set: Set<String>, searchString: String): Boolean {
    for (i in set) {
        if (i.contains(searchString)) {
            return true
        }
    }
    return false
}
