package com.example.kotlin

fun main() {
    val x = 20
    val y = 10
    val score  = 1

    if (x < y) {
        println("Y가 더 큽니다.")
    } else {
        println("X가 더 큽니다.")
    }

    val result = if(x > y) x else y;
    println(result)

    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("i don't know")
    }

    val result2 = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println(result2)

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..90 -> println("not bad")
        else -> println("okay")
    }
}