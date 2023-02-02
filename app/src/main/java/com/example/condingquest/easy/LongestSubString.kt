package com.example.condingquest.dsaa

fun main() {
    println(lengthOfLongestSubstring("pwwkew"))
    println(lengthOfLongestSubstring("abcabcbb"))
    println(lengthOfLongestSubstring("bbbbb"))
}


fun lengthOfLongestSubstring(s: String): Int {
    if (s.isEmpty()) return 0
    val map = HashMap<Char, Int>()
    var max = 0
    var i = 0
    var j = 0
    while (i < s.length) {
        val lChar = s[i]
        if (map.containsKey(lChar)) {
            val mapValue = map[lChar].toString().toInt()
            j = j.coerceAtLeast(mapValue + 1)
        }
        map[lChar] = i
        max = max.coerceAtLeast(i - j + 1)
        ++i
    }
    return max
}