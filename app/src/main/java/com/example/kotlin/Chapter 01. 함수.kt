package com.example.kotlin

/**
 * 1. 함수
 */

fun main() {
    function()

    println(add(1,3))
}

fun function() {
    println("Hello World!")
}

fun add(x: Int, y: Int): Int {
    return x + y
}



fun variable() {
    val a: Int = 10
    var b: Int = 9
    var c = 100 // 별도의 타입선언이 없어도 상관없습니다.

    // a = 100 // Val cannot be reassigned
    b = 100
    println(b)

    var name = "Genn"
}

/**
 * 3. String Template
 */

fun stringTemplate() {
    val name = "Genn"
    println("my name is $name")
    println("this is ${name}'s kotlin")
}

/**
 * 4. 조건문
 */

fun conditional(x: Int, y: Int): Int {
    return if (x > y) {
        x
    }  else  {
        y
    }
}

fun conditional2(x: Int, y: Int) = if(x > y) x else y

fun choice(score: Int) {
    when(score) {
        0 -> println("this is 0")
        1 -> println("this is 1")
        2, 3 -> println("this is 2 or 3")
        else -> println("i don't know")
    }

    val result = when(score) {
        1 -> 1
        2 -> 2
        else -> 3
    }

    println(result)

    when(score) {
        in 90..100 -> println("You are genius")
        in 10..90 -> println("not bad")
        else -> println("okay")
    }
}

// Expression vs Statement

// 5. Array and List
// Array 정해진 사이즈가 존재
// List
// - ImmutableList ( 불변 )
// - MutableList ( 변환 )
fun array() {
    val array = arrayOf(1,2,3)
    val list = listOf(1,2,3)

    val array2 = arrayOf(1, "d", 3.4f)
    val list2 = listOf(1, "d", 11L)

    array[0] = 3
    // list[0] = 2 불가능
    var list0 = list.get(0);

    val arrayList = arrayListOf<Int>()
    arrayList.add(10)
    arrayList.add(20)
    arrayList[0] = 30
}