package org.eodnorog.kotlincourse.lesson19

//ООП Инкапсуляция
//Вся информация, которая нужна для работы конкретного объекта, должна храниться внутри этого объекта.
//Если нужно вносить изменения, методы для этого тоже должны лежать в самом объекте — посторонние объекты и классы этого делать не могут.
//Для внешних объектов доступны только публичные атрибуты и методы.
//
//Например, метод для внесения данных в карточку товара должен обязательно быть прописан в классе «Карточка товара».
//А не в классе «Корзина» или «Каталог товаров».
//
//Такой принцип обеспечивает безопасность и не даёт повредить данные внутри какого-то класса со стороны.
//Ещё он помогает избежать случайных зависимостей, когда из-за изменения одного объекта что-то ломается в другом.

fun main() {
    val account = Account(0.0)

    val student = Student("Ivan", 19, 3434)

}

class Atm(private var balance: Float = 0.0f) {
    private var pin = "2333"

    fun deposit(amount: Float, pin: String) {
        checkPin(pin)
    }

    fun withdraw(amount: Float, pin: String): Float {
        checkPin(pin)
        return amount // != balance
    }

    fun getBalance(pin: String): Float {

        checkPin(pin)
        return balance
    }

    private fun checkPin(pin: String) {
        if (pin != this.pin)
            throw Exception("Pin not correct")
    }
}
