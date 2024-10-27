package org.eodnorog.kotlincourse.lesson15

class Person(
    val name: String,
    var age: Int //поля класса || аргументы конструктора класса || переменные класса
) {
    private var isAlive = true //можно в классе передавать приватные аргументы

    //Метод класса
    fun sayHello() {
        println("Hello, my $name and I am $age yeats old.")
    }
}
