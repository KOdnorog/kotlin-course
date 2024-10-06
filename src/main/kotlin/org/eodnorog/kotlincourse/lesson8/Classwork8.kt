package org.eodnorog.kotlincourse.lesson8

fun main() {
    val simpleString = "Это простая строка"

    val firstName = "Иван"
    val lastName = "Иванов"
    val fullName = firstName + " " + lastName

    val age = 30
    val greeting = "Привет! Меня зовут $fullName, мне $age лет."

    val person = Person("Алексей", 25)
    val introduction = "Меня зовут $person.name, и мне ${person.age} лет"

    val details = "Здесь находятся ${getDetails()}"

    val x = 10
    val y = 20
    val resultString = "Результат сложения x и y равен ${x + y}"

    val originalString = "Сабстринг, котлин это весело, говорили они"
    val subString4 = originalString.substring(11)
    val subString2 = originalString.substring(11, 17)
    val replacedString = originalString.replace("о", "FuN")
    val words = originalString.split("о")
    //println(words.joinToString ( "\n" ))

    val length = "Hello".length //количество букв в слове
    val upper = "hello".uppercase() //изменение регистра в Заглавные
    val lower = "HELLO".lowercase() //изменение регистар в обычные
    val trimmed = " hello .".trim('h', '.', ' ') //убирает лишние символы/точки/пробелы
    val starts = "Kotlin".startsWith("lin") //возвращает true иил false если есть строка начинается с какого-то элемента
    val ends = "Kotlin".endsWith("lin") //что сторка заканчивается на какой-то элемент
    val contains = "Hello".contains("ell") //есть какие-то элементы в слове
    val e: String? = null
    val empty = e.isNullOrEmpty()//не пустоя символы
    val blank = " ".isNullOrBlank() //с пустыми символами
    val repeat = "ab".repeat(3) //повторить 3 раза
    val letter = originalString[5]
    val indexOfChar = "Kotlin".indexOf('t')
    val indexOfWord = "Kotlin is the best language".indexOf("best")
    val backReverse = "niltoK".reversed()
    val multiLineString = """
            Первая строка
                Вторая строка
                    Третья строка
        """.trimIndent()
    val string = "Sweet summer child"
    val subString = string.substring(6)
    val subString1 = string.substring(12)

    println(multiLineString)
}

class Person(val name: String, val age: Int)

fun getDetails(): String {
    return "очень интересные детали"
}
