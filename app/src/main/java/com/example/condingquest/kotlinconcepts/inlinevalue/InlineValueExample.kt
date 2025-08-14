package com.example.condingquest.kotlinconcepts.inlinevalue

/**
 * @Author: Yerramma Kethu
 * @Date: 14/08/2025
 */


@JvmInline
value class UserId constructor(val id: String){
    init {
        println("hjhvhjvhjh")
    }
    constructor(id1: Int) : this(id1.toString())
    constructor(id1: Double) : this(id1.toString())
}

fun main() {
    val userId = UserId("12345")
    val userId1 = UserId(122.00)
    println("User ID: ${userId.id}")
    println("User ID: ${userId1.id}")
}