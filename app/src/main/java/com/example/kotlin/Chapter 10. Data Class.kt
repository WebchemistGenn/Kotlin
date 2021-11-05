package com.example.kotlin

data class Ticket(val company: String, val name: String, val date: String, val seatNum: Int)
// toString(), hashCode(), equals(), copy()

class TicketClass(val company: String, val name: String, val date: String, val seatNum: Int)

fun main() {
    val ticketA = Ticket("KoreaAir", "Genn", "2021-11-05", 15)
    val ticketB = TicketClass("KoreaAir", "Genn", "2021-11-07", 20)

    println(ticketA)
    println(ticketB)
}