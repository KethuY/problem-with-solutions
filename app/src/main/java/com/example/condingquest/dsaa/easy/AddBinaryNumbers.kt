package com.example.condingquest.dsaa.easy
/**
 * @Author: Yerramma Kethu
 * @Date: 07/01/2025
 * Given two binary strings a and b, return their sum as a binary string.
 * Example 1:
 *
 * Input: a = "11", b = "1"
 * Output: "100"
 * Example 2:
 *
 * Input: a = "1010", b = "1011"
 * Output: "10101"
 *
 */

fun main() {
    println(addBinary("11", "1"))
    println(addBinary("1010", "1011"))
}

fun addBinary(bin1: String, bin2: String): String {
    val num1 = bin1.toBigInteger(2)
    val num2 = bin2.toBigInteger(2)
    return (num1 + num2).toString(2)
}