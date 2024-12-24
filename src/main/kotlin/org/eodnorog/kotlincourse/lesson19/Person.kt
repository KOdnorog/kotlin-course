package org.eodnorog.kotlincourse.lesson19

private const val CONST = "const"

open class Person(private val name: String, protected val age: Int) {

    // Публичный метод
    protected fun greet(): MyClass {
        println("Привет, меня зовут $name.")
        val m = MyClass()
        return m
    }

    // Защищённый метод
    protected fun getName(): String {
        return name
    }

    // Приватный метод
    private fun secret() {
        CONST
        println("Это секретный метод.")
    }

    protected class MyClass
}
