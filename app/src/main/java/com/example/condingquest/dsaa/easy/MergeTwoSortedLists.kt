package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 07/01/2025
 */
fun main() {
    println("${mergeTwoSortedList(listOf(1, 2, 4), listOf(1, 3, 4))}")
}

fun mergeTwoSortedList(list: List<Int>, list1: List<Int>): List<Int> {
    val result = arrayListOf<Int>()
    result.addAll(list)
    result.addAll(list1)
    return result.sorted()
}