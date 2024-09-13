package org.eodnorog.kotlincourse

class Lesson_2 {
    val name: String = "Kate"

    var age: Int = 25

    const val PI = 3.14 // просто заметка константы всегда с большой буквы!!!

    const val FILE_EXTENSION = ".jpg"

    lateinit var userInfo: String

    val lazyValue: String by lazy {
        "Hello world!"
    }

    var speed: Double? = null

    var count: Int = 0 // чтобы мы могли влиять на то, что переменная отдает
        get() = field
        set(value) {
            if (value >= 0) field = value
            else field = 100 //но в целом, конечно, неособо понятно
        }

    val chassis: String = "YME069"

    var color: String = "Blue"

    var distance: Double = 30000.00

    lateinit var owner: String

    const val WHEELS: Int = 4

    val report: String by lazy {
        "Hello"
    }

    var fuel: Double = 0.0
        get() = field
        set(value) {
            if (value >= 0) field += value
            else field = 80.0
        }
}
