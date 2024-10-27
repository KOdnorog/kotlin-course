package org.eodnorog.kotlincourse.lesson15

fun main() {
    val person = Person("John", 30)
    person.sayHello()

    val person1 = Person(age = 31, name = "Lolla") //можно изменять порядок, но нужно прописать аргумент
    person1.sayHello()

    Logger.log("fgf") //существует в единственном классе
    Logger.setData(5)

    val result = Calculator.add(1, 4)
    println(result)

    println(Calculator.VERSION)
}
