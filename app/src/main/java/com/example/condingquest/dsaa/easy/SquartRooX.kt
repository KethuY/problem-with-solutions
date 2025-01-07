package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 07/01/2025
 * Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
 *
 * You must not use any built-in exponent function or operator.
 *
 * For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
 * Example 1:
 *
 * Input: x = 4
 * Output: 2
 * Explanation: The square root of 4 is 2, so we return 2.
 * Example 2:
 *
 * Input: x = 8
 * Output: 2
 * Explanation: The square root of 8 is 2.82842..., and since we round it down to the nearest integer, 2 is returned.
 */

fun main(){
    println(mySqrt(8))
}

fun mySqrt(number: Int): Int {
    if (number == 0 || number == 1) return number

    var low = 0
    var high = number
    var result = 0

    while (low <= high) {
        val mid = low + (high - low) / 2
        val midSquared = mid * mid

        if (midSquared == number) {
            return mid // If we find an exact square root
        } else if (midSquared < number) {
            low = mid + 1
            result = mid // Store the current mid as the result
        } else {
            high = mid - 1
        }
    }

    return result
}