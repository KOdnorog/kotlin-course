package org.eodnorog.kotlincourse.lesson17.HW_task1_task2

abstract class Materials {

    private val materials = mutableListOf<String>()

    fun addMaterial(material: String) {
        materials.add(material)
    }

    fun extractMaterial(): List<String> {
        val extracted = materials.toList()
        materials.clear()
        return extracted
    }

    fun printContainer() {
        materials.forEachIndexed { index, layer ->
            println("[$index]: $layer")
        }
    }
}

val ordinalNumbers = listOf(
    "first", "second", "third", "fourth", "fifth",
    "sixth", "seventh", "eighth", "ninth", "tenth",
    "eleventh", "twelfth", "thirteenth", "fourteenth", "fifteenth",
    "sixteenth", "seventeenth", "eighteenth", "nineteenth", "twentieth"
)

class AddFirst() : Materials() {
    fun add(material: String) {
        val add = extractMaterial()
        addMaterial(material)
        add.forEach { addMaterial(it) }
    }
}

fun main() {
    val a1 = AddFirst()
    ordinalNumbers.forEach { a1.addMaterial(it) }
    a1.add("Хеллоу")
    a1.printContainer()
}
