package org.eodnorog.kotlincourse.lesson11

fun main() {

    val pair: Pair<Int, String> = 1 to "a"
    val pair2 = Pair(2, "a")

    println(pair.first)
    println(pair.second)

    val emptyMap: Map<String, String> = mapOf<String, String>()

    val capitals = mapOf(
        "Russia" to "Moscow",
        "France" to "Paris"
    )

    val a1 = "Spain" to "Madrid"
    val a2 = "Greece" to "Athens"

    val newCapitals = mapOf(a1, a2)

    val map: Map<Int, String> = mapOf(1 to "a", 2 to "b", 3 to "c")

    val mutableCapitals = mutableMapOf("Uk" to "London", "Ireland" to "Dublin")

    val capitalRus = capitals["Russia"]
    println(capitalRus)

    mutableCapitals["German"] = "Berlin"
    mutableCapitals.remove("Ireland")

    for (entries in mutableCapitals) {
        println("${entries.key} : ${entries.value}")
    }

    for ((country, capital) in capitals) {
        println("$country : $capital")
    }

    val mapWithNullableKey = mutableMapOf<String?, Int>(null to 1)


    val newPair = 2 to "N"

    val newMapMap1 = mapOf<String, Int>()

    val newMapMap2 = mapOf("Guitar" to "Drive", "Synth" to "Lead")

    val newMapMap3 = mutableMapOf("Synth" to "Analog")

    newMapMap3["Pedal"] = "Echo"

    for (elements in newMapMap3) {
        println("${elements.key} : ${elements.value}")
    }

    println(newMapMap3["Synth"])
    println(newMapMap3["Bass"])

    newMapMap3.remove("Synth")

    for ((keys, values) in newMapMap2) {
        println("$keys : $values")
    }

    val classWork: Map<String, List<Int>> = mapOf("Street" to listOf(1, 3, 6))

    val getDay = mapOf<String, List<String>>()
    val getClass = mapOf<String, MutableMap<String, String>>()

    val inventar = mapOf<String, MutableSet<String>>()
}


fun searchKey(mapKarta: Map<String, String>, word: String): String {
    for ((key, value) in mapKarta) {
        if (value == word) {
            return key
        }
    }
    return "Nothing"
}
