package com.example.kotlin

/**
 * Lamda
 * 람다식은 우리가 마치 value 처럼 다룰 수 있는 익명함수입니다.
 * 1) 메소드의 파라미터로 넘겨줄수 있다.
 * 2) return 값으로 사용할 수 있다.
 */

// 람다의 기본정의
// val lamdaName: Type = {agrumentList -> codeBody}

//val squre = {number: Int -> number*number}
val squre: (Int) -> (Int) = {number -> number*number}
val nameAge = {name: String, age: Int -> "my name is ${name} I'm ${age}"}

// 확장함수
val pizzaIsGreat : String.() -> String = {this + "Pizza is th best!!"}

fun extendString(name: String, age: Int): String {
    val introduceMyself: String.(Int)->String = {"I am ${this} and ${it} years old"}
    return name.introduceMyself(age)
}

// 람다의 return
val calculateGrade: (Int) -> String = {
    when(it) {
        in 0..40 -> "Fail"
        in 41..70 -> "Pass"
        in 71..100 -> "Pefect"
        else -> "Error"
    }
}

// 람다를 표현한 여러가지 방법
fun invokeLamda(lamda: (Double) -> Boolean): Boolean {
    return lamda(5.2343)
}

fun main() {
    println(squre(12))
    println(nameAge("Genn", 20))

    val a = "Genn said"

    println(a.pizzaIsGreat())

    println(extendString("Genn", 28))

    println(calculateGrade(97))

    val lamda = {number: Double -> number == 4.3213}
    println(invokeLamda(lamda))
    println(invokeLamda ({ it > 3.22 })) // == invokeLamda {it > 3.22} 람다가 처음이자 마지막인 파라미터라면 다음과 같이 할 수 있습니다.

}