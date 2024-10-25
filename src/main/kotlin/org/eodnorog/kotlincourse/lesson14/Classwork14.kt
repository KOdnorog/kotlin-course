package org.eodnorog.kotlincourse.lesson14

fun main() {

    val fruitsPrices = mapOf("apple" to 2.99, "banana" to 1.99, "cherry" to 3.99)

    //Перебор словаря (цикл)
    for (entry in fruitsPrices.entries) {
        println("Key: ${entry.key}, Value: ${entry.value}")
    }

    //Деструктуризация
    for ((key, value) in fruitsPrices) {
        println("Key: $key, Value: $value")
    }

    //Получение данных из словаря
    val entries: Set<Map.Entry<String, Double>> = fruitsPrices.entries //коллекция ветрет уникальные значения
    val keys: Set<String> = fruitsPrices.keys //коллекция возвращает уникальные ключи
    val value: Collection<Double> = fruitsPrices.values //коллекция возвращает уникальные значение

    //Получение элементов
    val priceOfPearOrElse: Double = fruitsPrices.getOrElse("pear") { 0.0 }
    val priceOfApple = fruitsPrices.getValue("apple") //значение по ключу, но переводит его в not null
    val priceOfPearOrDefault = fruitsPrices.getOrDefault("pear", 0.0) //если ключа нет, выкидыывает - дефолт

    //Изменение состава словаря
    val fruitsWithoutBanana = fruitsPrices - "banana" //из одного словаря убирает ненужный ключи
    val fruitsWithPineapple = fruitsPrices + ("pineapple" to 6.99)
    val mutableFruits = fruitsPrices.toMutableMap()

    //Добавление элемента
    mutableFruits["kiwi"] = 2.75
    mutableFruits.putAll(mapOf("lime" to 1.1, "avocado" to 1.9))
    //Удаление элемента
    mutableFruits.remove("apple")
    mutableFruits.clear()

    //Разнообразные проверки
    val containsApple = fruitsPrices.containsKey("apple")
    val containsValue1_5 = fruitsPrices.containsValue(1.5)
    val isEmpty = fruitsPrices.isEmpty()
    val isNotEmpty = fruitsPrices.isNotEmpty()
    val areAllFruitsExpensive = fruitsPrices.all { it.value > 1.0 } //возвращает булевое значение, все (логическое и &&)
    val isAnyFruitCheap = fruitsPrices.any { it.value < 1.0 }  //возвращает булевое значение, все (логическое или ||)

    val filteredByPrice = fruitsPrices.filter { it.key.contains("a") && it.value > 1.0 } //фильтрация словаря
    val filteredByKeys =
        fruitsPrices.filterKeys { it.startsWith("a") } //фильтрация по ключам, но будет создан новый словарь ключи и значение
    val filteredByValue = fruitsPrices.filterValues { it < 2.0 } //фильтрация словаря по значение
    val filteredNotApple = fruitsPrices.filterNot { it.key == "apple" }
    val countExpensiveFruits = fruitsPrices.count { it.value > 1.5 }

    //Преобразование
    val increasedPrices = fruitsPrices.mapValues { it.value * 1.0 }
    val fruitNamesUppercase = fruitsPrices.mapKeys { it.key.uppercase() }
    val fruitsList = fruitsPrices.map { "${it.key} cost ${it.value}" }

    val toMap = mutableFruits.toMap()
    val toMutableMap = mutableFruits.toMutableMap()

    //Деструктуризация
    fruitsPrices.forEach { (fruit, price) ->
        println("$fruit cost $price")
    }
    fruitsPrices.forEach {
        println("${it.key} cost ${it.value}")
    }
}

fun classWork() {
    val map = mapOf<String, Int>()
    for (entry in map.entries)
        println("")
}
