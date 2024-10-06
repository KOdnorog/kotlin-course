package org.eodnorog.kotlincourse.lesson10

fun main() {
//------ Работа со списками List ------
//Задание 1: Создание Пустого Списка
//Создайте пустой неизменяемый список целых чисел.
    println(" ")
    val taskHome1List = listOf<Int>()
    println("Task # 1: $taskHome1List")

//Задание 2: Создание и Инициализация Списка
//Создайте неизменяемый список строк, содержащий три элемента (например, "Hello", "World", "Kotlin").
    println(" ")
    val taskHome2List = listOf("Hello", "World", "Kotlin")
    println("Task # 2: $taskHome2List")

//Задание 3: Создание Изменяемого Списка
//Создайте изменяемый список целых чисел и инициализируйте его значениями от 1 до 5.
    println(" ")
    val taskHome3List = listOf(1, 2, 3, 4, 5)
    println("Task # 3: $taskHome3List")

//Задание 4: Добавление Элементов в Список
//Имея изменяемый список целых чисел, добавьте в него новые элементы (например, 6, 7, 8).
    println(" ")
    val taskHome4List = mutableListOf(1, 2, 3)
    taskHome4List.add(44)
    taskHome4List.add(52)
    taskHome4List.add(69)
    println("Task # 4: $taskHome4List")

//Задание 5: Удаление Элементов из Списка
//Имея изменяемый список строк, удалите из него определенный элемент (например, "World").
    println(" ")
    val taskHome5List = mutableListOf("Hello", "World", "Kotlin")
    taskHome5List.remove("World")
    println("Task # 5: $taskHome5List")

//Задание 6: Перебор Списка в Цикле
//Создайте список целых чисел и используйте цикл для вывода каждого элемента на экран.
    println(" ")
    println("--- Task - 6 ---")
    println(" ")
    val taskHome6List = listOf(55, 77, 99)
    for (i in taskHome6List) {
        println(i)
    }

//Задание 7: Получение Элементов Списка по Индексу
//Создайте список строк и получите из него второй элемент, используя его индекс.
    println(" ")
    val taskHome7List = mutableListOf("too", "me", "you", "151", "we", "171")
    println("Task # 7: ${taskHome7List[2]}")

//Задание 8: Перезапись Элементов Списка по Индексу
//Имея изменяемый список чисел, измените значение элемента на определенной позиции (например, замените элемент на позиции 2 на новое значение).
    println(" ")
    val taskHome8List = mutableListOf(111, 121, 131, 141, 151, 161)
    taskHome8List[2] = 777
    println("Task # 8: $taskHome8List")

//Задание 9: Объединение Двух Списков
//Создайте два списка строк и объедините их в один новый список, содержащий элементы обоих списков. Реши задачу с помощью циклов.
    println(" ")
    val taskHome9AListK = listOf("Hiya", "Barbie", "Hi", "Ken")
    val taskHome9AListB = listOf("Hello", "Joy", "Ken")
    println("Task # 9 A: ${taskHome9AListK + taskHome9AListB}")

    println(" ")
    val taskHome9BListK = listOf("A", "B", "C", "D")
    val taskHome9BListB = listOf("C", "/", "D")
    val taskHome9BListC = mutableListOf<String>()
    for (i in taskHome9BListK) {
        taskHome9BListC.add(i)
    }
    for (i in taskHome9BListB) {
        taskHome9BListC.add(i)
    }
    println("Task # 9 B: $taskHome9BListC")

//Задание 10: Нахождение Минимального/Максимального Элемента
//Создайте список целых чисел и найдите в нем минимальный и максимальный элементы используя цикл.
    println(" ")
    println("--- Task - 10 ---")
    println(" ")
    val taskHome10List = mutableListOf(71,72,54,57)
    var maxElement: Int
    var minElement: Int
    for(i in taskHome10List){
        if (taskHome10List[1] < taskHome10List[2]) {
            taskHome10List.add(taskHome10List[2])
        }
    }

//Задание 11: Фильтрация Списка
//Имея список целых чисел, создайте новый список, содержащий только четные числа из исходного списка используя цикл.
    println(" ")
    println("--- Task - 11 ---")
    println(" ")
//    val taskHome11List

}
