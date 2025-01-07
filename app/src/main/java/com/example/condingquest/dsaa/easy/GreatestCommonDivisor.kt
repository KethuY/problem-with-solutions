package com.example.condingquest.dsaa.easy

fun gcd(a: Int, b: Int): Int {
    return if (b == 0) a else gcd(b, a % b)
}

fun main() {
    println(gcd(25, 10)) // should print 5
    println(gcd(25, 0)) // should print 5
    println(gcd(36, 12)) // should print 5
    println(gcd(48, 72)) // should print 5
}