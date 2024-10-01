package org.eodnorog.kotlincourse.lesson7

fun main() {
    six()
    whileTen()
    continueEven()
    whileThree()
    tableMultiplication()
}

//Задания для Прерывания и Пропуска Итерации
//Использование break:
//- Напишите цикл for от 1 до 10 и используйте break, чтобы выйти из цикла при достижении 6.

fun six() {
    for (i in 1..10) {
        if (i == 6) break
        println(i)
    }
}

//- Создайте цикл while, который бесконечно выводит числа, начиная с 1, но прерывается при достижении 10.

fun whileTen() {
    var count = 1
    while (true) {
        count++
        if (count == 10) break
        println(count)
    }
}

//Использование continue:
//- В цикле for от 1 до 10 используйте continue, чтобы пропустить четные числа.

fun continueEven() {
    for (i in 1..10) {
        if (i % 2 == 0) continue
        println(i)
    }
}
//- Напишите цикл while, который выводит числа от 1 до 10, но пропускает числа, кратные 3.

fun whileThree() {
    var count = 1
    while (count < 10) {
        count++
        if (count % 3 == 0) continue
    println(count)
    }
}

//Задача на вложенный цикл
//- Создать цикл в цикле, в каждом использовать диапазон от 1 до 10.
//В консоль вывести результат умножения переменных цикла.
//Результат умножения выводить через print() и добавлять ещё один print(“ ”) с пробелом, чтобы отделять значения в строку.
//После вложенного цикла выводить пустой println() чтобы следующий проход начинать с новой строки.
//Результат должен быть как на картинке.

fun tableMultiplication() {
    for (i in 1..10) {
        for (a in 1..10) {
            print(i*a)
            print(" ")
        }
        println("")
    }
}
