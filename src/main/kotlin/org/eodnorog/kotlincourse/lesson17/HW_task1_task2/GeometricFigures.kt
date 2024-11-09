package org.eodnorog.kotlincourse.lesson17.HW_task1_task2

open class GeometricFigures(
    val square: Int,
    val sumPoints: Int
)

open class Polygons(
    square: Int,
    sumPoints: Int,
    degreeAngles: Int
) : GeometricFigures(square, sumPoints)

class Circle(
    square: Int,
    sumPoints: Int,
    val radius: Int,
    val pi: Double = 3.1415926535
) : GeometricFigures(square, sumPoints)

class Triangle(
    square: Int,
    sumPoints: Int,
    val numberAngles: Int = 3,
    degreeAngles: Int
) : Polygons(square, sumPoints, degreeAngles)

class Quadrilateral(
    square: Int,
    sumPoints: Int,
    val numberAngles: Int = 4,
    degreeAngles: Int
) : Polygons(square, sumPoints, degreeAngles)
