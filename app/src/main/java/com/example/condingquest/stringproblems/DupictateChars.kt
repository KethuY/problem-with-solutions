package com.example.condingquest.stringproblems
// print duplciate chars

fun main() {
    val name = "javabbkkjppkkuuz".toCharArray().groupBy { it }.filter { it.value.size>1 }.keys
    println(name)
}
