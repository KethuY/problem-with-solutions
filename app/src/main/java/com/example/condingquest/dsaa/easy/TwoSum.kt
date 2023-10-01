package com.example.condingquest.dsaa.easy

fun main() {
    val numberArray = intArrayOf(2, 7, 11, 15,5,4)
    val target = 9
    val resultArray = twoSum(numberArray, target)
    resultArray.let {
       for (element in resultArray){
           print(element)
           print(" ")
       }
   }
}

fun twoSum(nums: IntArray, target: Int): List<Int> {
    val indexes = arrayListOf<Int>()
    for (i in nums.indices) {
        for (j in i + 1 until nums.size) {
           /* Solution1
            if (nums[j] == target - nums[i]) {
                indexes.add(i)
                indexes.add(j)
            }*/

            // solution 2
            if (target == nums[j] + nums[i]) {
                indexes.add(i)
                indexes.add(j)
            }
        }
    }
    // In case there is no solution, we'll just return null
    return indexes
}