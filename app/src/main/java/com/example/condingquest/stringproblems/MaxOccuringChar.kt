package com.example.condingquest.stringproblems

/*
* How to find the maximum occurring character in a given String? (solution)
Write an efficient Java/C/Python program to return the maximum occurring character in the input string, e.g., if the input string is "Java" then the function should return 'a'.
* */
// I/P : JAVa
// O/P : a
fun main() {
    val name = "java".toCharArray().map { it.lowercase() }.groupingBy { it }.eachCount()
    println(name.maxByOrNull { it.value }?.key)
}