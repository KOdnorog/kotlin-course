package org.eodnorog.kotlincourse.lesson15

//хранит данные
data class User(val id: Int, val name: String)

fun main() {
    val user1 = User(1, "Alice")
    val user2 = user1.copy(name = "Bob") //copy создание объекта, но с измененым значением

    println(user1) //Output: User(id=1, name=Alice)
    println(user2) //Output: User(id=1, name=Bob)
}
