package org.eodnorog.kotlincourse.lesson18.task1

import org.eodnorog.kotlincourse.lesson18.Background
import org.eodnorog.kotlincourse.lesson18.Colors
import org.eodnorog.kotlincourse.lesson18.printColored

//Создай абстрактный принтер, который имеет абстрактный метод печати, принимающий в качестве аргумента строку.
//Создай классы наследники: лазерный и струйный
//Лазерный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно чёрными буквами на белом фоне (хорошо работает на тёмной теме)
//Струйный принтер должен разбивать фразу на слова по пробелу и выводить каждое слово отдельно цветными буквами на цветном фоне. Слова должны быть разноцветны. Можно сделать список пар с цветом текста и фона и проходить циклически по этому списку при выводе текста. Проверить работу на длинном тексте.
//Подумать, как бы вынести в protected метод базового класса общую для обоих классов логику и избавиться от дублирования кода.

abstract class Printer(name: String) {
    abstract fun printText(text: String)

    protected fun processText(text: String, colorText: String, colorsBack: String) {
        val words = text.split(" ")
        words.forEach { word -> printColored(word, colorText, colorsBack) }
    }
}

class Laser : Printer("Laser") {
    override fun printText(text: String) {
        processText(text, Colors.BLACK, Background.WHITE)
    }
}

class InkJet : Printer("InkJet") {
    val colorPair = listOf(
        Colors.BLACK to Background.BLUE,
        Colors.RED to Background.BLACK,
        Colors.WHITE to Background.GREEN,
        Colors.GREEN to Background.PURPLE,
        Colors.PURPLE to Background.YELLOW,
        Colors.YELLOW to Background.CYAN,
        Colors.BLUE to Background.RED,
        Colors.CYAN to Background.WHITE,
    )

    override fun printText(text: String) {
        val words = text.split(" ")
        var colorIndex = 0 //добавляем инкримент

        for (text in words) {
            val colorText = colorPair[colorIndex].first
            val colorsBack = colorPair[colorIndex].second
            processText(text, colorText, colorsBack)
            colorIndex++
            if (colorIndex >= colorPair.size) {
                colorIndex = 0
            }
        }
    }
}

fun main(){
    Laser().printText("jxhfbvsldfuhvbfsouvfouvbvshfbvuohrbgoqugbfqougahbfvoauerbfo fkjvndfihfdfnvisrhgisrbg sergjrebgirebg ergierbgiebg erguerbv jsrbv")
    InkJet().printText("как дела или еще прикольно как тут может быть а тут не понятно он каждую пару будет отдельно  смотреть")
}
