package com.example.condingquest.medium

var generatedParenthis = arrayListOf<String>()

fun main() {
    generateParenthesis(3)
    for (c in generatedParenthis) print("$c ")
}

fun generateParenthesis(n: Int): List<String> {
    generatedParenthis = arrayListOf()
    solve("", 0, 0, n)
    return generatedParenthis
}

private fun solve(str: String, left: Int, right: Int, n: Int) {
    if (str.length == 2 * n) {
        generatedParenthis.add(str)
    }
    if (left < n) {
        var temp1 = str
        temp1 += "("
        solve(temp1, left + 1, right, n)
    }
    if (right < left) {
        var temp1 = str
        temp1 += ")"
        solve(temp1, left, right + 1, n)
    }
}

