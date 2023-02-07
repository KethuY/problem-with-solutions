package com.example.condingquest.kotlinconcepts.basics

val items = listOf("apple", "banana", "kiwifruit")
val x = 10
val y = 9
 sealed class Shape

class Rectangle( height: Double, length: Double): Shape() {
    var perimeter = (height + length) * 2
}

fun getPerimeter() = Rectangle(10.00, 20.00)

fun main() {
    println("Perimeter ${getPerimeter().perimeter}")
    println("Indices ${items.indices}")
    println("List reversed ${items.reversed()}")
   for (item in items){
       println("For Loop : $item")
   }
    for (index in items.indices){
        println("For Loop Indices: ${items[index]}")
    }

    for (i in 0..10 ){
        print("$i ")
    }
    var index=0
    while (index< items.size){
        println("While loop:  ${items[index]}")
        index++
    }

    main("")

    if (x in 1..y+1) {
        println("X is available in the range")
    }

    if (-5 in 1..y+1) {
        println("X is available in the range")
    }

    when {
        "banana" in items -> println("juicy")
        "apple" in items -> println("apple is fine too")
    }
    println("***********-----------------*************")

    val fruits = listOf("banana", "avocado", "apple", "kiwifruit")
    fruits
        .filter { it.startsWith("a") }
        .sortedBy { it }
        .map { it.reversed() }
        .forEach { println(it) }
}

fun describe(obj: Any): String =
    when (obj) {
        1          -> "One"
        "Hello"    -> "Greeting"
        is Long    -> "Long"
        !is String -> "Not a string"
        else       -> "Unknown"
    }

fun main(args :String) {
    println(describe(1))
    println(describe("Hello"))
    println(describe(1000L))
    println(describe(2))
    println(describe("other"))
}



