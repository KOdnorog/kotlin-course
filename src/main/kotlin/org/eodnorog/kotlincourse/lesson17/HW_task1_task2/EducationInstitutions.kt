package org.eodnorog.kotlincourse.lesson17.HW_task1_task2

open class EducationInstitutions(
    val number: Int,
    val name: String,
    val floor: Int,
    val classRoom: Int
)

open class School(
    number: Int,
    name: String,
    floor: Int,
    classRoom: Int,
    sportRoom: Int
) : EducationInstitutions(number, name, floor, classRoom)

class MilitarySchool(
    number: Int,
    name: String,
    floor: Int,
    classRoom: Int,
    sportRoom: Int,
    beds: Int
) : School(number, name, floor, classRoom, sportRoom)
