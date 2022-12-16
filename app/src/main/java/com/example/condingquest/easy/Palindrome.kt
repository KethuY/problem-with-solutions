package com.example.condingquest.easy

fun main() {
    print(isPalindrome(121))
}

fun isPalindrome(x: Int): Boolean {
    if (x.toString().length == 1) {
        return false
    }
    val givenNumer = "$x"
    val newText = givenNumer.reversed()
    return givenNumer == newText
}