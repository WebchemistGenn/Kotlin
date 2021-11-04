package com.example.kotlin

fun main() {
    // NPE : Null Pointer Exception

    var name : String = "genn"
    var nullName: String? = null
    var nameInUpperCase = name.uppercase()
    var nullNameInUpperCase = nullName?.uppercase()

    val lastName: String? = null
    val fullName: String = name + (lastName ?: "No lastName") // null 이라면 대체합니다.

    println(fullName)
}

fun ignoreNulls(str: String?) {
    val mNotNull: String = str!! // 절대로 null 일 수 없다고 지정
    val upper: String = mNotNull.uppercase()

    // null 아닐때만 동작
    val email: String? = "genn@company.com"
    email?.let {
        println("my email is ${email}")
    }
}