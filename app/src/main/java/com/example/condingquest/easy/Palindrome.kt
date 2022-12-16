package com.example.condingquest.easy

fun main() {
    print(isPalindrome(121))
}

fun isPalindrome(x: Int): Boolean {
    val givenNumer = "$x"
    val newText = givenNumer.reversed()
    return givenNumer == newText
}