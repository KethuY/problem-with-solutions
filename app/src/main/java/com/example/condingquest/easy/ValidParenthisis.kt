package com.example.condingquest.easy

import java.util.*

fun main() {
    println(isValid("(){}[]"))
}

fun isValid(expr: String): Boolean {
    val stack: Deque<Char> = ArrayDeque()

    for (i in expr.indices) {
        val x: Char = expr.toCharArray()[i]
        if (x == '(' || x == '[' || x == '{') {
            // Push the element in the stack
            stack.push(x)
            continue
        }

        // If current character is not opening
        // bracket, then it must be closing. So stack
        // cannot be empty at this point.
        if (stack.isEmpty()) return false
        var check: Char
        when (x) {
            ')' -> {
                check = stack.pop()
                if (check == '{' || check == '[') return false
            }
            '}' -> {
                check = stack.pop()
                if (check == '(' || check == '[') return false
            }
            ']' -> {
                check = stack.pop()
                if (check == '(' || check == '{') return false
            }
        }
    }

    // Check Empty Stack
    return stack.isEmpty()
}