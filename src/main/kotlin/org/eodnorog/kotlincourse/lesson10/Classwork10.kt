package org.eodnorog.kotlincourse.lesson10

fun main() {
    val numbers = arrayOf<Int>() //список добавлять можно добавлять

    val doubles: DoubleArray = doubleArrayOf(1.1, 2.2, 3.3)

    val emptyArray = Array(5) { 1 }
    val emptyNullableArray: Array<Int?> = arrayOfNulls(5)

    val readOnlyList: List<Any> = listOf(1, "b", "c")

    val mutableList: MutableList<String> = mutableListOf("a", "b", "c")

    val numberSet: Set<Int> = setOf(1, 2, 3, 4, 5, 5)

    val mutableNumberSet: MutableSet<Int> = mutableSetOf(1, 2, 3, 4, 5)

    mutableList.add("ui")
    val set = setOf("K", "o", "t", "l", "i", "n")

    for (letter in set) {
        println("|$letter|")
    }

    val list = listOf(32, 53, 1, -76)
    for (index in list.indices) {
        if (index == list.lastIndex) {
            println(list[index] + list[0])
        } else {
            println(list[index] + list[index + 1])
        }
    }

    var index = list.lastIndex
    while (index >= 0) {
        println("`${list[index--]}`")
    }
}
