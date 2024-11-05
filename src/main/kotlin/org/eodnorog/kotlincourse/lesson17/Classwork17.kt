package org.eodnorog.kotlincourse.lesson17

//ООП Наследование
//В этом принципе — вся суть объектно-ориентированного программирования.
//Разработчик создаёт:
//
//● Класс с определёнными свойствами;
//● Подкласс на его основе, который берёт свойства класса и добавляет свои;
//● Объект подкласса, который также копирует его свойства и добавляет свои.
//
//Каждый дочерний элемент наследует методы и атрибуты, прописанные в родительском.
//Он может использовать их все, отбросить часть или добавить новые.
// При этом заново прописывать эти атрибуты и методы не нужно.

open class Vehicle(
    val maxWeight: Int,
    val passengerCapacity: Int,
    val serialNumber: String
) {
    open fun startMovement() {
        println("Транспортное средство начало движение.")
    }

    open fun stopMovement() {
        println("Транспортное средство остановлено.")
    }
}

// Класс Колёсное транспортное средство, наследующийся от Транспортного средства
open class WheeledVehicle(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String,
    val wheelCount: Int
) : Vehicle(maxWeight, passengerCapacity, serialNumber)

// Класс Автомобиль, наследующийся от Колёсного транспортного средства
class Car(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String,
    wheelCount: Int,
    val engineType: String,
    val bodyType: String
) : WheeledVehicle(maxWeight, passengerCapacity, serialNumber, wheelCount) {

    fun turnOnLights() {
        println("Габариты включены.")
    }

    fun turnOffLights() {
        println("Габариты выключены.")
    }

    fun activateTurnSignal(direction: String) {
        println("Поворотник включен: $direction")
    }

    fun activateWipers() {
        println("Стеклоочистители включены.")
    }
}

// Класс Велосипед, наследующийся от Колёсного транспортного средства
class Bicycle(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String
) : WheeledVehicle(maxWeight, passengerCapacity, serialNumber, 2) {

    fun pedal() {
        println("Педали крутятся.")
    }
}

// Класс Летательные аппараты
open class Aircraft(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String,
    val flightAltitude: Int
) : Vehicle(maxWeight, passengerCapacity, serialNumber) {

    fun increaseAltitude(amount: Int) {
        println("Высота увеличена на $amount метров.")
    }

    fun decreaseAltitude(amount: Int) {
        println("Высота уменьшена на $amount метров.")
    }
}

// Класс Самолёт, наследующийся от Летательного аппарата
class Airplane(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String,
    flightAltitude: Int
) : Aircraft(maxWeight, passengerCapacity, serialNumber, flightAltitude)

// Класс Вертолёт, наследующийся от Летательного аппарата
class Helicopter(
    maxWeight: Int,
    passengerCapacity: Int,
    serialNumber: String,
    flightAltitude: Int
) : Aircraft(maxWeight, passengerCapacity, serialNumber, flightAltitude)
