package org.eodnorog.kotlincourse.lesson6

fun main() {
    getMonth(1)
    getMonth(3)
    getMonth(8)
    getMonth(10)
    getMonth(12)

    getYearsDogs(1)
    getYearsDogs(2)
    getYearsDogs(3)
    getYearsDogs(7)

    typeTransport(10)
    typeTransport(2)
    typeTransport(1)

    calculatBonuses(100)
    calculatBonuses(500)
    calculatBonuses(999)
    calculatBonuses(1000)
    calculatBonuses(1001)
    calculatBonuses(10000)

    typeDoc(".doc")
    typeDoc(".kot")

    conversionTemperature(12, "F")
    conversionTemperature(123, "C")
    conversionTemperature(30, "yty")

    selectionClothes(-5)
    selectionClothes(12)
    selectionClothes(24)
    selectionClothes(42)

    chooseMovieForAge(5)
    chooseMovieForAge(12)
    chooseMovieForAge(27)
}

    //Задание 1: "Определение Сезона"
    //Контекст: Напишите функцию, которая на основе номера месяца возвращает сезон года.

fun getMonth(numberMonth: Int) {
    val WinterRange: IntRange = 1..2
    val SpringRange: IntRange = 3..5
    val SummerRange: IntRange = 6..8
    val AutomRange: IntRange = 9..11

    if (numberMonth in WinterRange) {
        println("Зима")
    } else if (numberMonth in SpringRange) {
        println("Весна")
    } else if (numberMonth in SummerRange) {
        println("Лето")
    } else if (numberMonth in AutomRange) {
        println("Осень")
    } else if (numberMonth == 12) {
        println("Зима")
    }
}

    //Задание 2: "Расчет Возраста Питомца"
    //Контекст: Создайте функцию, которая преобразует возраст собаки в "человеческие" годы.
    //До 2 лет каждый год собаки равен 10.5 человеческим годам, после - каждый год равен 4 человеческим годам.

fun getYearsDogs(yearDog: Int) {
    if (yearDog <= 2) {
        println(yearDog * 10.5)
    } else if (yearDog >= 3) {
        println(2 * 10.5 + (yearDog - 2) * 4)
    }
}

    //Задание 3: "Определение Вида Транспорта"
    //Контекст: Напишите функцию, которая определяет, какой вид транспорта лучше использовать, исходя из длины маршрута.
    //Если маршрут до 1 км - "пешком", до 5 км - "велосипед", иначе - "автотранспорт".

fun typeTransport(length: Int) {
    val onFoot: IntRange = 0..1
    val bicycle: IntRange = 2..5
    if (length in onFoot) {
        println("Иди пешком")
    } else if (length in bicycle) {
        println("Бери велосипед")
    } else if (length > 5) {
        println("Ну, что только на машине")
    }
}

    //Задание 4: "Расчет Бонусных Баллов"
    //Контекст: Клиенты интернет-магазина получают бонусные баллы за покупки.
    //Напишите функцию, которая принимает сумму покупки и возвращает количество бонусных баллов: 2 балла за каждые 100 рублей
    //при сумме покупки до 1000 рублей и 5 баллов за каждые 100 рублей при сумме свыше этого.

fun calculatBonuses(amountBuy: Int) {
    if (amountBuy < 1000) {
        println(amountBuy / 100 * 2)
    } else if (amountBuy >= 1000) {
        println( amountBuy / 100 * 5)
    }
}

    //Задание 5: "Определение Типа Документа"
    //Контекст: В системе хранения документов каждый файл имеет расширение.
    //Напишите функцию, которая на основе расширения файла возвращает его тип: "Текстовый документ", "Изображение", "Таблица" или "Неизвестный тип".

fun typeDoc(fileExtension: String) {
    when (fileExtension) {
        ".doc", ".txt" -> println("Текстовый документ")
        ".jpg", ".jpeg", ".png" -> println("Изображение")
        ".tab", ".xlsx" -> println("Таблица")
        else -> println("Неизвестный тип")
    }
}

    //Задание 6: "Конвертация Температуры"
    //Контекст: Создайте функцию, которая конвертирует температуру из градусов Цельсия в Фаренгейты и наоборот в зависимости от указанной единицы измерения (C/F).
    //Единицу измерения нужно передать вторым аргументом функции. Несколько аргументов передаются через запятую. Возвращать нужно строку.
    //Подсказка: для генерации строки из числа и буквы можно использовать шалон “$result F” для фаренгейта или “$result C” для цельсия

fun conversionTemperature(temperature: Int, unitMeasurement: String) {
    when (unitMeasurement) {
        "C" -> {
            val result = temperature * 1.8 + 32
            println("$result F")
        }
        "F" -> {
            val result = (temperature - 32) / 1.8
            println("$result C")
        }
        else -> {
            println("error")
        }
    }
}

    //Задание 7: "Подбор Одежды по Погоде"
    //Контекст: Напишите функцию, которая на основе температуры воздуха рекомендует тип одежды: "куртка и шапка"
    //при температуре ниже 0, "ветровка" от 0 до 15 градусов и "футболка и шорты" при температуре выше 15.
    //При температурах ниже -30 и выше +35 рекомендуйте не выходить из дома.

fun selectionClothes(temperature: Int) {
    when (temperature) {
        in -30 until 0 -> println("куртка и шапка")
        in 0..15 -> println("ветровка")
        in 16..35 -> println("футболка и шорты")
        else -> println("рекомендуем не выходить из дома")
    }
}


    //Задание 8: "Выбор Фильма по Возрасту"
    //Контекст: Кинотеатр предлагает фильмы разных возрастных категорий.
    //Напишите функцию, которая принимает возраст зрителя и возвращает доступные для него категории фильмов: "детские", "подростковые", "18+".

fun chooseMovieForAge(yourAge: Int) {
    val childRange: IntRange = 0 until 12
    val teenagersRange: IntRange = 12 until 18
    if (yourAge in childRange) {
        println("детские")
    } else if (yourAge in teenagersRange) {
        println("подростковые")
    } else{
        println("18+")
    }
}
