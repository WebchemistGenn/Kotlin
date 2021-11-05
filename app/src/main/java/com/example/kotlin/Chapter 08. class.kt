package com.example.kotlin

open class Person(val name: String = "default name") {
    init {
        println("New Person!")
    }
    fun eat() {
        println("YUMM!")
    }

    open fun sleep() {
        println("Sleep")
    }
}

class Test: Person {
    constructor(name: String = "test", age: Int) {
        println("new Test")
    }

    override fun sleep() {
        super.sleep()
        println("test sleep")
    }
}

fun main() {
    val genn = Person("Genn")
    genn.eat()

    println("my name is ${genn.name}")
}