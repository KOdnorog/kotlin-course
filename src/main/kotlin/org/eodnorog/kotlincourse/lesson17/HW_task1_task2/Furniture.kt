package org.eodnorog.kotlincourse.lesson17.HW_task1_task2

open class Furniture(
    val serialNumber: Int,
    val name: String,
    val textile: String,
)

open class Chair(
    serialNumber: Int,
    name: String,
    textile: String,
    seat: Int
) : Furniture(serialNumber, name, textile)

class Sofa(
    serialNumber: Int,
    name: String,
    textile: String,
    seat: Int,
    pillows: Int,
    armrests: Int
) : Chair(serialNumber, name, textile, seat)
