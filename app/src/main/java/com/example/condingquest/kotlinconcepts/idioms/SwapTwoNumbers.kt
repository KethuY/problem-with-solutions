package com.example.condingquest.kotlinconcepts.idioms

fun main() {
    var a = 1
    var b = 2
    a = b.also { b = a }
    println(" $a & $b")
}