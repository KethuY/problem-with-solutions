package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 07/01/2025
 */

fun main() {
    var list = listOf(3, 2, 2, 3)
    var element = 3
    println(removeElement(list, element))
    list = listOf(0, 1, 2, 2, 3, 0, 4, 2)
    element = 2
    println(removeElement(list, element))
}

fun removeElement(nums: List<Int>, element: Int): Pair<Int, List<Any>> {
    val list = nums.filter { it != element }
    val sizeDifference = (nums.size - list.size)
    val result = arrayListOf<Any>()
    result.addAll(list)
    for (i in 1..sizeDifference) {
        result.add("_")
    }
    return list.size to result

}