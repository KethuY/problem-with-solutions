package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 07/01/2025
 */

fun main() {
    var haystack = "sadbutsad"
    var needle = "sad"
    println("${findIndexOfWord(haystack, needle)}")
    haystack = "leetcode"
    needle = "leeto"
    println("${findIndexOfWord(haystack, needle)}")

}

fun findIndexOfWord(haystack: String, needle: String): Int {
    return haystack.indexOf(needle)
}