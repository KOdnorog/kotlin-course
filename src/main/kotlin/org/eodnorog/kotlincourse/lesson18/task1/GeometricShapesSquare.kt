package org.eodnorog.kotlincourse.lesson18.task1

//Геометрические Фигуры и Их Площадь
//Абстрактный (базовый) класс: Shape с open методом area().
//Классы наследники: Circle, Square, Triangle.
//Метод area() возвращает 0.0.
//Переопределите метод area() в каждом классе-наследнике для расчета площади соответствующей фигуры.
//Подсказка: каждый класс должен иметь аргументы конструктора, позволяющие вычислить площадь (для круга это радиус, для квадрата это сторона, для треугольника это две стороны и угол между ними)
//Создай набор геометрических фигур и выведи в цикле их площадь

abstract class Shape(name: String) {
    open fun area(): Double {
        return 0.0
    }
}

class Circle(val a: Double, private val const: Double) : Shape("Circle") {
    override fun area(): Double {
        return a * a * const

    }
}

class Square(val a: Double) : Shape("Square") {
    override fun area(): Double {
        return a * a
    }
}

class Triangle(val a: Double, private val h: Double) : Shape("Triangle") {
    override fun area(): Double {
        return (a * h) / 2
    }
}

fun main() {
    val sqrt: List<Shape> = listOf(Square(3.6), Triangle(1.1, 2.2), Circle(5.5, 3.14159265))
    for (i in sqrt) {
        i.area()
    }
    sqrt.forEach { sqrt -> println("S = ${sqrt.area()}") }
}
