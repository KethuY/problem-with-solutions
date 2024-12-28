package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 26/12/2024
 */
fun main() {
    val tickets = listOf(
        Ticket("T1", 2, 100),
        Ticket("T2", 1, 120),
        Ticket("T3", 2, 95)
    ).sortedWith(compareBy<Ticket> { it.pri }.thenBy { it.time }).map { it.name }
    println("$tickets")
}

data class Ticket(val name: String, val pri: Int, val time: Int)