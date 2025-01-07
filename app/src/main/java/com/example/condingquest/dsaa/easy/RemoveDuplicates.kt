package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 07/01/2025
 */

fun main() {
    var list = listOf(1, 1, 2)
    println("${removeDuplicates(list)}")
    list = listOf(0, 0, 1, 1, 1, 2, 2, 3, 3, 4)
    println("${removeDuplicates(list)}")
}

fun removeDuplicates(list: List<Int>): ArrayList<Any> {
    val uniqueData = list.distinct()
    val sizeDifference = (list.size - uniqueData.size)
    val result= arrayListOf<Any>()
    result.addAll(uniqueData)
    for (i in 1..sizeDifference) {
        result.add("_")
    }
    return result

}