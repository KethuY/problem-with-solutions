package com.example.condingquest.stringproblems

import kotlin.math.floor
import kotlin.time.Duration.Companion.days

/*
* How to find the distinct character in a given String
* */

fun main() {
    val name = "java".toCharArray().distinct()
    println(name)
    //readString()

    var riversArray = arrayOf("Nile", "Amazon", "Yangtze")
    riversArray.joinToString(", ", prefix = "Rivers: ", postfix = ".") { it.uppercase() }
        .also { println(it) }
    riversArray.minOfOrNull { it.length }
        ?.let { println("Shortest river name length: $it") }
}

fun readString(){
    val wrongInt = readln().toIntOrNull()
    println(wrongInt)
}