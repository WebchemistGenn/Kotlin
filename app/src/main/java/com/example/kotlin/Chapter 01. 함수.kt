package com.example.kotlin

fun function() {
    println("Hello World!")
}

fun add(x: Int, y: Int): Int {
    return x + y
}

fun main() {
    function()

    println(add(1,3))
}