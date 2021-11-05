package com.example.kotlin

// 실행될때 한번 생성되어 메모리를 아낄수 있습니다.
// Singleton Pattern
object CarFactory {
    var cars = mutableListOf<Car>()

    fun makeCar(power: Int): Car {
        var car = Car(power)
        cars.add(car)
        return car
    }
}

data class Car(var power: Int)

fun main() {
    var car1 = CarFactory.makeCar(10)
    var car2 = CarFactory.makeCar(100)

    println(car1)
    println(car2)

    println(CarFactory.cars.size.toString())
}