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

}
