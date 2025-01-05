package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 02/01/2025
 * Can you find the needle in the haystack?
 *
 * Write a function findNeedle() that takes an array full of junk but containing one "needle"
 *
 * After your function finds the needle it should return a message (as a string) that says:
 *
 * "found the needle at position " plus the index it found the needle, so:
 *
 * Example(Input --> Output)
 *
 * ["hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk"] --> "found the needle at position 5"
 *
 */
fun main() {
    val list = listOf("hay", "junk", "hay", "hay", "moreJunk", "needle", "randomJunk")
    println(findNeedle(list, "needle"))
    println(findNeedle(list, "Satya"))
}

fun findNeedle(list: List<String>, item: String): String {
    if (list.contains(item)) {
        val position = list.indexOf(item)
        return "found the needle at position $position"
    }
    return "Item is not found in the list"
}