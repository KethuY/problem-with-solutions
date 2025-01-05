package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 02/01/2025
 * Create a method each_cons that accepts a list and a number n, and returns cascading subsets of the list of size n, like so:
 *
 * each_cons([1,2,3,4], 2)
 *   #=> [[1,2], [2,3], [3,4]]
 *
 * each_cons([1,2,3,4], 3)
 *   #=> [[1,2,3],[2,3,4]]
 *
 * As you can see, the lists are cascading; ie, they overlap, but never out of order.
 */
fun main() {
    var list= listOf(1, 3, 5, 7)
    println("($list, $2) : ${makeCascading(list,2)}")
}

fun makeCascading(list: List<Int>, n: Int): List<List<Int>> {
    val result = mutableListOf<List<Int>>()
    for (i in 0..list.size - n) {
        result.add(list.subList(i, i + n))
    }
    return result
}