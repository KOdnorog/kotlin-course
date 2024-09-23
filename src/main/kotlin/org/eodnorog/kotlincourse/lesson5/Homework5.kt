package org.eodnorog.kotlincourse.lesson5

fun main() {
    val oneEasy = (12 / 3 > 3) && (5 * 2 == 10) //true && true = true
    val twoEasy = (14 - 4 <= 10) || (6 / 2 != 3) //true || false = true
    val threeEasy = (9 + 1 == 10) && (8 % 2 == 0) //true && true = true
    val fourEasy = (7 - 2 < 5) || (4 * 3 != 12) //false || false = false
    val fiveEasy = (18 / 6 >= 3) && (5 + 5 == 10) //true && true = true
    val sixEasy = (11 % 3 != 2) || (9 - 3 == 6) //false || true = true
    val sevenEasy = (5 * 2 < 11) && (14 / 2 == 7) //true && true = true
    val eightEasy = (8 + 2 <= 10) || (7 % 2 != 1) //true || false = true
    val nineEasy = (16 / 4 > 3) && (3 + 4 == 7) //true && true = true
    val tenEasy = (10 % 2 == 0) || (5 - 3 != 1) //true || true = true

    val oneDifficult = ((4 * 3) < 13) && !(8 / 4 == 2) || (10 % 3 != 1) //true && false || false = false
    val twoDifficult = ((14 - 5) > 8) || (9 / 3 == 3) && !(7 + 0 != 7) //true || true && true = true
    val threeDifficult = ((2 + 3) <= 5) && (16 / 4 == 4) || !(6 % 2 == 0) //true && true || false = true
    val fourDifficult = ((5 * 3) != 15) && !(10 / 2 > 4) || (4 + 4 == 8) //false && false || true = true
    val fiveDifficult = ((12 / 4) >= 3) || (7 % 2 != 1) && !(3 + 3 == 6) //true || false && false = true

    var f = 6; --f >= 5
    val oneAdvanced = (5 == 5) || ((3 * 2 == 6) && (9 - 4 != 5)) //true || (true && false) = true
    var g = 0; g++ != 0
    val twoAdvanced = ((1 != 0) && (4 + 2 == 6)) || (5 / 1 == 5) //(true && true) || true = true
    var h = 7; h-- > 6
    val threeAdvanced = (6 > 6) || (8 + 1 == 9) && (3 % 2 != 1) //false || true && false = false
    var i = 5; i++ == 5
    val fourAdvanced = ((6 == 5) || (2 * 2 != 4)) && (10 / 2 == 5) //(false || false) && true = false
    var j = 4; j-- < 4
    val fiveAdvanced = (3 < 4) && ((6 + 0 == 6) || (5 % 2 != 1)) //true && (true || false) = true

    println(task1(5.40,0.7))
    println(task2(3.0))
    task3(null)

}

    //Оператор элвиса
    //Задание выполняется в виде функций, принимающих один или более аргументов.
    // Все функции должны быть вызваны из функции main() в вариантах с null и с вещественным значением.


    //Контекст: Вы изучаете физическое явление затухания звука в помещении.
    //У вас есть измеренное значение начальной интенсивности звука,
    //но из-за ограничений оборудования данные о коэффициенте затухания иногда могут быть неизвестны.
    //Задача: Рассчитать предполагаемую интенсивность звука после затухания.
    //Интенсивность звука после затухания пропорциональна начальной интенсивности, умноженной на коэффициент затухания.
    //Если коэффициент затухания неизвестен, использовать стандартное значение 0.5.

fun task1(initial: Double, startInitial: Double?): Double {

    val def = startInitial ?: 0.5

    return initial * def
}

    //Контекст: Клиент оплачивает доставку груза.
    //К стоимости доставки добавляется страховка на груз, которая составляет 0,5% от его стоимости.
    //В случае, если стоимость не указана, то берётся стандартная стоимость в $50
    //Задача: Рассчитать полную стоимость доставки.

fun task2(cost: Double?): Double {

    val costStart = cost ?: 50.0
    val insur = costStart * 0.05

    return costStart + insur

}

    //Контекст: Вы проводите метеорологические измерения. Одним из важных показателей является атмосферное давление,
    //которое должно быть зафиксировано. Лаборант приносит вам набор показателей, но по пути может что-нибудь потерять.
    //Задача: Cообщить об ошибке в случае отсутствия показаний атмосферного давления.

fun task3(atmosfDav: String?) {

    println(atmosfDav ?: throw Exception("Ошибка"))

}
