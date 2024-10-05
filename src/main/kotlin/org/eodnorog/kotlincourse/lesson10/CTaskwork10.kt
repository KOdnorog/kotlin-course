package org.eodnorog.kotlincourse.lesson10

fun main() {

    val array = Array(100) { 0 }

    val double = doubleArrayOf(1.1, 2.2, 3.3, 4.4, 5.5)

    val emptyArray = Array(10) { 0 }
    emptyArray[0] = 10
    for (i in emptyArray.indices) {
        emptyArray[i] = (i + 1) * 10
    }
    println(emptyArray.toList())

    val arrayFive = arrayOf("hoh", "lol", "sos", "bobi", "5")
    for (i in arrayFive.indices) {
        arrayFive[i] = " "
    }
    println(arrayFive.toList())

    val arrayA = arrayOf(1, 2, 3)
    val arrayB = arrayOf(5, 6, 7)
    val emptyArrayC = Array(3) { 0 }
    for (i in emptyArrayC.indices) {
        emptyArrayC[i] = arrayA[i] + arrayB[i]
    }
    println(emptyArrayC.toList())

    val arrayEmpty = listOf<Int>() //неизменяемый пустой список

    val arrayThree = listOf("hjg", "jhg", "jhfg")
    for (i in arrayThree) {
        println(i)
    }

    val arrayIzmeniy = mutableListOf<Float>() //изменяемый список
    arrayIzmeniy.add(6632F)
    arrayIzmeniy.add(123F)
    arrayIzmeniy.remove(123F)
    arrayIzmeniy.removeAt(0)
    println(arrayIzmeniy.toList())

    val empltySet = setOf<Int>()
    val setNum = setOf(1, 2, 3, 4, 5)
    val setNum2 = mutableListOf(1, 2, 3)
    setNum2.add(6)
    setNum2.remove(2)
    println(setNum2)

    for (elem in setNum2) {
        println(elem * elem)
    }

//    findNumber(1,5)

    val set1 = setOf(1,2,3) //коллекция уникальных значений, если использовать дубликаты то нужно использовать listOf и у set нет индексов
    val set2 = setOf(3,4,5,6,7)
    var emptySet = mutableSetOf<Int>()

    for (elem in set1) {
        emptySet.add(elem)
    }
    for (elem in set2) {
        emptySet.add(elem)
    }

    println(emptySet)
    emptySet = mutableSetOf(1)
    println(emptySet)
}

//fun findNumber(setNum: Set<Int>, num: Int): Boolean {
//    for (elem in setNum) {
//        if (elem == num) {
//            println(elem)
//        }
//    }
//}
