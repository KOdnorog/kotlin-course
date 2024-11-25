package org.eodnorog.kotlincourse.lesson18.task1

import org.eodnorog.kotlincourse.lesson18.Colors
import org.eodnorog.kotlincourse.lesson18.printColored

// Класс базовый: животные
abstract class Animal(
    val maxWeight: Int,
    val type: String,
) {
    open fun makeSound() {
        println("This animal makes no sound.")
    }
}

// Класс наследник: Собака
class Dog : Animal(maxWeight = 100, type = "dogs") {

    override fun makeSound() {
        printColored("Bark", Colors.RED)
    }
}

// Класс наследник: Кошка
class Cat : Animal(maxWeight = 50, type = "cats") {

    override fun makeSound() {
        printColored("Meow", Colors.GREEN)
    }
}

// Класс наследник: Птица
class Bird : Animal(maxWeight = 15, type = "birds") {

    override fun makeSound() {
        printColored("Twit", Colors.YELLOW)
    }
}

fun main() {
    val animals: List<Animal> = listOf(Cat(), Bird(), Dog(), Dog(), Bird())
    for (i in animals) {
        i.makeSound()
    }
}
