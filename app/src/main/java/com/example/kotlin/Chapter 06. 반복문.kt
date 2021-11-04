package com.example.kotlin

fun main() {
    // For
    val students = arrayListOf("gen", "lee", "kim", "park")

    for (name in students) {
        println(name)
    }

    var sum: Int = 0;
    for ( i in 1..10) {
        sum += i
    }

    println(sum)

    for ( i in 1..10 step 2) { }
    for ( i in 10 downTo 1) { }
    for (i in 1 until 100) { }
    for ((index, name) in students.withIndex()) {
        println("${index + 1}번째 학생 : ${name}")
    }

    // While
    var index = 0;
    while(index < 10) {
        println("current index: ${index}")
        index++
    }
}