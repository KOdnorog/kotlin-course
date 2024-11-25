package org.eodnorog.kotlincourse.lesson18

//ООП Полиморфизм
//Один и тот же метод может работать по-разному в зависимости от объекта, где он вызван, и данных, которые ему передали.
//Например, метод «Удалить» при вызове в корзине удалит товар только из корзины, а при вызове в карточке товара — удалит саму карточку из каталога.
//
//То же самое с объектами. Можно использовать их публичные методы и атрибуты в других функциях и быть уверенным, что всё сработает нормально.
//
//Этот принцип ООП, как и другие, обеспечивает отсутствие ошибок при использовании объектов.

//Перегрузка - это когда один и тот же метод может приниматься множество других типов или параметров,
//который находиться внутри одного класса. Пример, sum в калькуляторе, он принимает 2 какие-то значения и возвращает другой значение.

//Переопределение - это когда производные класс, который наследует другой класс, меняет реализацию метода из другого класса.

object Colors {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[30m"
    const val RED = "\u001B[31m"
    const val GREEN = "\u001B[32m"
    const val YELLOW = "\u001B[33m"
    const val BLUE = "\u001B[34m"
    const val PURPLE = "\u001B[35m"
    const val CYAN = "\u001B[36m"
    const val WHITE = "\u001B[37m"
}

object Background {
    const val RESET = "\u001B[0m"
    const val BLACK = "\u001B[40m"
    const val RED = "\u001B[41m"
    const val GREEN = "\u001B[42m"
    const val YELLOW = "\u001B[43m"
    const val BLUE = "\u001B[44m"
    const val PURPLE = "\u001B[45m"
    const val CYAN = "\u001B[46m"
    const val WHITE = "\u001B[47m"
}

fun printColored(text: String, color: String, backgroundColor: String = "") {
    println("$color$backgroundColor$text${Colors.RESET}")
}


abstract class MusicalInstrument {

    abstract fun playNote(note: String)

    open fun playNoteB(note: String) {
        println("белеберда")
    }

    protected fun shortNote(note: String, color: String) {
        printColored("Play short note $note", color)
    }

    protected fun longNote(note: String, color: String) {
        printColored("Play long note $note", color)
    }
}

class Cello : MusicalInstrument() {
    override fun playNote(note: String) {
        longNote(note, Colors.PURPLE)
    }
}

fun main() {
    Cello().playNote("Do")
    val orchestra: List<MusicalInstrument> = listOf(Piano(), Flute(), Cello())
    orchestra[0].playNote("Re")
    orchestra[1].playNote("Fa")
    orchestra[2].playNote("Sole")
}

class Piano : MusicalInstrument() {
    override fun playNote(note: String) {
        shortNote(note, Colors.GREEN)
    }
}

class Flute : MusicalInstrument() {
    override fun playNote(note: String) {
        longNote(note, Colors.WHITE)
    }
}
