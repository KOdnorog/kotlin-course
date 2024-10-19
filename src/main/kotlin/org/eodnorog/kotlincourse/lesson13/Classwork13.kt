package org.eodnorog.kotlincourse.lesson13

fun main() {

    val list = listOf(8, 56, 23, 42, 12, 18, 11)
    val filtered1 = myCustomfilter(list)
    println(filtered1)

    val filtered2 = list.filter { it in 7..17 }
    println(filtered2)

    val filtered3 = list.filter {
        val result: Boolean = it in 7..17
        result
    }
    println(filtered3)

    val numbers = listOf(-1, 2, -3, 4, -5)
    val positiveNumbers = numbers.filter { it > 0 }
    println(positiveNumbers)

    val notPositiveNumbers = numbers.filterNot { it > 0 }
    println(notPositiveNumbers)

    val nullableList: List<Int?> = listOf(1, null, 2, null, 3)
    val nonNullList: List<Int> = nullableList.filterNotNull()
    println(nonNullList)

    val firstPositive: Int? = numbers.firstOrNull { it > 0 }
    println(firstPositive)

    val elementOrElse = numbers.getOrElse(2) { -1 }
    println(elementOrElse)

    val incrementedNumbers: List<String> = numbers.map { "$it%" }
    println(incrementedNumbers)

    val numberSquareMap: Map<Int, Int> = numbers.associate { it to it * it }
    println(numberSquareMap)

    val mutableList = listOf(
        listOf(1, 2, 3),
        listOf(4, 5, 6)
    )

    println(mutableList)

    val flattenList = mutableList.flatten() //склеивает списки
    println(flattenList)

    val flattenListAfterMapping = mutableList.flatMap { list: List<Int> ->
        list.map { it * 2 }
    }
    println(flattenListAfterMapping)

    val numbersString = numbers.joinToString(separator = ", ") { "$it * $it" }
    println(numbersString)

    val sorterNumbers = numbers.sorted() //сортировка от меньшего к большему
    println(sorterNumbers)

    val sorterDescendingNumbers = numbers.sortedDescending()
    println(sorterDescendingNumbers)

    numbers.forEach { //построчный ввывод
        println(it)
    }

    val sumOfNumbers = numbers.sum()
    println(sumOfNumbers)

    val averageOfNumbers: Double = numbers.average() //среднее значение
    println(averageOfNumbers)

    val maxNumber = numbers.maxOrNull()
    println(maxNumber)

    val minNumber = numbers.minOrNull()
    println(minNumber)

    val groupedBySign =
        numbers.groupBy { if (it > 0) "Positive" else "Negative" } //отсортирует значение списка по задачнным ключам, то что в if
    println(groupedBySign)

    val distictNumber = listOf(1, 2, 2, 3, 3, 3, 4).distinct()
    println(distictNumber)

    println(numbers.take(7))

    println(numbers.takeLast(3))

    println(numbers.size)
}

fun myCustomfilter(collection: List<Int>): List<Int> {
    val result = mutableListOf<Int>()
    for (i in collection) {
        if (i in 7..17) result.add(i)
    }
    return result
}
