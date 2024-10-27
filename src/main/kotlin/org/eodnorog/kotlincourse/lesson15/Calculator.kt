package org.eodnorog.kotlincourse.lesson15

class Calculator {

    //объект без имени, используемый только в этом классе
    companion object {

        const val VERSION = "12"

        fun add(a: Int, b: Int): Int {
            return a + b
        }
    }
}
