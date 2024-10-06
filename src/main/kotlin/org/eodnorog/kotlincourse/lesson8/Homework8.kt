package org.eodnorog.kotlincourse.lesson8

fun main() {
    println(makePhrase("Это невозможно выполнить за один день"))
    println(makePhrase("Я не уверен в успехе этого проекта"))
    println(makePhrase("Произошла катастрофа на сервере"))
    println(makePhrase("Этот код работает без проблем"))
    println(makePhrase("Удача"))
    println(makePhrase("Я не уверен невозможно катастрофа"))

    task1HW8("Пользователь вошел в систему -> 2021-12-01 09:48:23")
    task1HW8Example2("Пользователь вошел в систему -> 2021-12-01 09:48:23")

    task2HW8("4539 1488 0343 6467")

    task3HW8("username@example.com")

    task4HW8("C:/Пользователи/Документы/report.txt")

    task5HW8("Объектно-ориентированное программирование")
}

//Создайте функцию, которая будет анализировать входящие фразы и применять к ним различные преобразования, делая текст более ироничным или забавным.
// Функция должна уметь распознавать ключевые слова или условия и соответственно изменять фразу.

fun makePhrase(phrase: String): String {
    var newPhrase = phrase
    if (phrase.contains("невозможно")) {
        newPhrase = phrase.replace("невозможно", "совершенно точно возможно, просто требует времени")
    } else if (phrase.startsWith("Я не уверен")) {
        newPhrase += ", но моя интуиция говорит об обратном"
    } else if (phrase.contains("катастрофа")) {
        newPhrase = phrase.replace("катастрофа", "интересное событие")
    } else if (phrase.endsWith("без проблем")) {
        newPhrase = phrase.replace("без проблем", "с парой интересных вызовов на пути")
    } else if (phrase.contains(" ")) { //или здесь можно использовать phrase.split(" ").size == 1
        newPhrase = "Иногда, $phrase, но не всегда"
    }

    return newPhrase
}

//Задание 1: Извлечение Даты из Строки Лога. Используй indexOf или split для получения правой части сообщения.
//Описание: У вас есть строка лога вида "Пользователь вошел в систему -> 2021-12-01 09:48:23".
// Извлеките отдельно дату и время из этой строки и сразу распечатай их по очереди.

fun task1HW8(phrase: String) {
    val indexOfSymbols = phrase.indexOf(">") + 2
    val indexOfDateAndTime = phrase.substring(indexOfSymbols)
    val dateAndTime = indexOfDateAndTime.split(" ")
    val date = dateAndTime[0]
    val time = dateAndTime[1]

    val multiLineString = """
            Дата: $date
            Время: $time
        """.trimIndent()
    println(multiLineString)
}

fun task1HW8Example2(phrase: String) {
    val indexOfSymbols = phrase.indexOf(">") + 2
    val date = phrase.substring(indexOfSymbols, indexOfSymbols + 10)
    val time = phrase.substring(indexOfSymbols + 12)

    val multiLineString = """
            Дата: $date
            Время: $time
        """.trimIndent()
    println(multiLineString)
}

//Задание 2: Маскирование Личных Данных
//Описание: Дана строка с номером кредитной карты "4539 1488 0343 6467".
//Замаскируйте все цифры, кроме последних четырех, символами "*".

fun task2HW8(phrase: String) {
    val indexNumber = phrase.substring(0..14)
    val secure = phrase.replace(indexNumber, "**** **** **** ")
    println(secure)
}

//Задание 3: Форматирование Адреса Электронной Почты. Используй replace
//Описание: У вас есть электронный адрес "username@example.com".
//Преобразуйте его в строку "username [at] example [dot] com"

fun task3HW8(phrase: String) {
    val prestoString = phrase.replace("@", " [at] ")
        .replace(".", " [dot] ")
    println(prestoString)
}

//Задание 4: Извлечение Имени Файла из Пути
//Описание: Дан путь к файлу "C:/Пользователи/Документы/report.txt".
//Извлеките название файла с расширением

fun task4HW8(phrase: String) {
    val nameFile = phrase.split("/")
    val onlyNameAndFormate = nameFile[3]
    println(onlyNameAndFormate)
}

//Задание 5: Создание Аббревиатуры из Фразы.
//Используй split с набором символов для разделения.
//Используй for для перебора слов. Используй var переменную для накопления первых букв.
//Описание: У вас есть фраза, например "Объектно-ориентированное программирование".
//Создайте аббревиатуру из начальных букв слов (например, "ООП")

fun task5HW8(phrase: String) {
    val dividePhrase = phrase.split("-", " ")
    println(dividePhrase)
    var abbreviation = ""
    for (letter in dividePhrase) {
        abbreviation += letter[0].uppercase()
    }
    println(abbreviation)
}
