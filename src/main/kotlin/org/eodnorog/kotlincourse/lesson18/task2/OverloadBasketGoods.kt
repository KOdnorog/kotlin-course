package org.eodnorog.kotlincourse.lesson18.task2

class ShoppingCart() {
    private val item: MutableMap<Int, Int> = mutableMapOf()

    fun addToCard(itemId: Int) {
        item[itemId] = item.getOrDefault(itemId, 0) + 1
    }

    fun addToCart(itemId: Int, amount: Int) {
        item[itemId] = item.getOrDefault(itemId, 0) + amount
    }

    fun addToCart(itemMap: Map<Int, Int>) {
        for ((itemId, amount) in itemMap) {
            addToCart(itemId, amount)
        }
    }

    fun addToCard(itemIds: List<Int>) {
        for (itemId in itemIds) {
            addToCard(itemId)
        }
    }

    override fun toString(): String {
        var result = "Итого в корзине: \n"
        var totalItem = item.keys.size //количество наименований
        var totalQuantity = 0

        for ((itemId, quantity) in item) {
            result += "id товара $itemId, количество $quantity\n"
            totalItem++
            totalQuantity += quantity
        }

        result += "Всего товаров $totalItem\n"
        result += "Всего количество $totalQuantity\n"
        return result
    }
}

fun main() {
    val cart = ShoppingCart()
    cart.addToCard(1)
    cart.addToCart(2, 3)
    cart.addToCart(mapOf(3 to 2, 4 to 1))
    cart.addToCard(listOf(1, 2, 5, 6, 7, 8, 9))
    println(cart)
}
