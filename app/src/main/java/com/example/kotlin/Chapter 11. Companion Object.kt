package com.example.kotlin

class Book private  constructor(val id: Int, val name: String) {
    companion object BookFactory: IdProvider {

        override fun getId(): Int {
            return 12
        }
        val myBook = "name"
        fun create() = Book(getId(), myBook)
    }
}

interface IdProvider {
    fun getId(): Int
}

fun main() {
    val book = Book.create()

    val bookId = Book.BookFactory.getId();
    println("${book.id} ${book.name}")
}