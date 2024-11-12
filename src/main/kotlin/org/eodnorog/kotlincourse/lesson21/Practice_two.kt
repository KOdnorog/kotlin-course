package org.eodnorog.kotlincourse.lesson21

class Container<T>(val item: T) //класс ограничен дженериком, который хранит класс типа Т

class PairBox<A, B>(val item: A, val item2: B) //поля словаря

class LimitContainer<A : Number>(val item: A?)

interface Storage<T> { //set принимает аргументы, а get возвращает
    fun set(item: T)
    fun get(): T
}

interface Transformer<D, T> { //объект одного типа, можем приобразовать в другой тип
    fun set(item: D): T
    //fun get(): T
}
