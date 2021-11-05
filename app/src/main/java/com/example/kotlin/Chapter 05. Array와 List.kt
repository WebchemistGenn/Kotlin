package com.example.kotlin

// 5. Array and List
// Array 정해진 사이즈가 존재
// List
// - ImmutableList ( 불변 )
// - MutableList ( 변환 )

fun main() {
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