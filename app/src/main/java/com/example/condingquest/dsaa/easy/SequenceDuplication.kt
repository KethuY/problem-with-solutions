package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 31/12/2024
 */
fun main() {
    val inputList1 = listOf("hello", "world", "hello", "hello", "hello", "hi", "world","Kethu")
    println(printFirstThreeConsecutiveWords(inputList1)) // [hello, world, hi, Kethu]

    // Test Case 2
   // val inputList2 = listOf("hi", "hi", "hi", "hello", "hi", "hello")
    val inputList2 = listOf("hi", "hi", "hi", "hello", "hello","hello","Adib","hi", "hello","Satya")
    println(printFirstThreeConsecutiveWords(inputList2))  // [hi, hi, hi, hello, hello, hello, Adib, Satya]
}


fun printFirstThreeConsecutiveWords(inputList: List<String>) {
    var consecutiveCount = 0
    var lastWord: String? = null
    val result = arrayListOf<String>()
    inputList.forEachIndexed { index, currentWord ->
        if (currentWord == lastWord) {
            consecutiveCount++
        } else {
            consecutiveCount = 1
        }
        if (consecutiveCount == 3 && !result.contains(currentWord)) {
            repeat(3) {
                result.add(currentWord)
            }
            consecutiveCount = 1
        }

        val isDiffWord =  !result.contains(currentWord)  && (index < inputList.lastIndex && currentWord != inputList[index + 1] || index == inputList.lastIndex) // || index == inputList.lastIndex &&  !result.contains(currentWord)
        if (isDiffWord) {
            result.add(currentWord)
        }
        lastWord = currentWord
    }
    println(result)
}