package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 07/01/2025
 * Given a sorted array of distinct integers and a target value, return the index if the target is found. If not, return the index where it would be if it were inserted in order.
 *
 * You must write an algorithm with O(log n) runtime complexity.
 *
 *
 *
 * Example 1:
 *
 * Input: nums = [1,3,5,6], target = 5
 * Output: 2
 * Example 2:
 *
 * Input: nums = [1,3,5,6], target = 2
 * Output: 1
 * Example 3:
 *
 * Input: nums = [1,3,5,6], target = 7
 * Output: 4
 *
 */

fun main() {
    val nums = arrayListOf(1, 3, 5, 6)
    var target = 5
    println("${searchInsertion(nums,target)}")
    target = 7
    println("${searchInsertion(nums,target)}")
    target = 2
    println("${searchInsertion(nums,target)}")

}


fun searchInsertion(nums: ArrayList<Int>, target: Int): Int {
    if (nums.contains(target))
        return nums.indexOf(target)
    nums.add(target)
    return nums.sorted().indexOf(target)
}