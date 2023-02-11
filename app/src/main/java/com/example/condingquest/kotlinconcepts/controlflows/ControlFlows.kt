package com.example.condingquest.kotlinconcepts.controlflows

const val numb1 = 10
const val num2 = 100
const val num3 = 200
enum class Bit {
    ZERO, ONE
}

fun main() {
    println(if (numb1 > num2) numb1 else num2)
    println(if (numb1 > num3) numb1 else num3)
    val numericValue = when (getRandomBit()) {
        Bit.ZERO -> 0
        Bit.ONE -> 1
        // 'else' is not required because all cases are covered
    }
    println(numericValue)
     for (i in 1..5) {
        println("First for loop : $i")

        for (j in 1..5) {
            println("Second for loop : $j")

            if (j==3){
                println("if true : $j")
                break
            }
        }
    }
}

fun getRandomBit() = Bit.ZERO