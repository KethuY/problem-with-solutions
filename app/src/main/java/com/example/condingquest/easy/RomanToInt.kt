package com.example.condingquest.easy
val romanMap:HashMap<String,Int> = HashMap()

fun main(){
    romanMap["I"] = 1
    romanMap["V"] = 5
    romanMap["X"] = 10
    romanMap["L"] = 50
    romanMap["C"] = 100
    romanMap["D"] = 500
    romanMap["M"] = 1000
    romanMap["IV"] = 4
    romanMap["IX"] = 9
    romanMap["XL"] = 40
    romanMap["XC"] = 90
    romanMap["CD"] = 400
    romanMap["CM"] = 900
    println(romanToInt("MCMXCIV"))
}

fun romanToInt(s: String): Int {
    val nums = IntArray(s.length)
    for (i in s.indices) {
        when (s[i]) {
            'M' -> nums[i] = 1000
            'D' -> nums[i] = 500
            'C' -> nums[i] = 100
            'L' -> nums[i] = 50
            'X' -> nums[i] = 10
            'V' -> nums[i] = 5
            'I' -> nums[i] = 1
        }
    }
    var sum = 0
    for (i in 0 until nums.size - 1) {
        if (nums[i] < nums[i + 1]) sum -= nums[i] else sum += nums[i]
    }
    return sum + nums[nums.size - 1]
}