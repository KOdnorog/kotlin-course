package org.eodnorog.kotlincourse.lesson15

object Logger {

    private var data = 0

    fun log(message: String) {
        println("Log: $message $data")
    }

    fun setData(data: Int) {
        this.data = data //this текущее обращение к текущему классу
    }
}
