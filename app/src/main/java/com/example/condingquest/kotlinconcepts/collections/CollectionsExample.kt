package com.example.condingquest.kotlinconcepts.collections

fun printAll(strings: Collection<String>) {
    for(s in strings) print("$s ")
    println()
}

fun List<String>.getShortWordsTo(shortWords: MutableList<String>, maxLength: Int) {
    this.filterTo(shortWords) { it.length <= maxLength }
    // throwing away the articles
    val articles = setOf("a", "A", "an", "An", "the", "The")
    shortWords -= articles
}

data class Person(var name: String, var age: Int)

fun main1() {
    val stringList = listOf("one", "two", "one")
    printAll(stringList)

    val stringSet = setOf("one", "two", "three")
    printAll(stringSet)

    val words = "A long time ago in a galaxy far far away".split(" ")
    val shortWords = mutableListOf<String>()
    words.getShortWordsTo(shortWords, 3)
    println(shortWords)

    val bob = Person("Bob", 31)
    val people = listOf(Person("Adam", 20), bob, bob)
    val people2 = listOf(Person("Adam", 20), Person("Bob", 31), bob)
    println(people == people2)
    bob.age = 32
    println(people == people2)

    val doubled = List(3) { it * 2 }  // or MutableList if you want to change its content later
    println(doubled)

    val map = buildMap { // this is MutableMap<String, Int>, types of key and value are inferred from the `put()` calls below
        put("a", 1)
        put("b", 0)
        put("c", 4)
    }
    println(map) // {a=1, b=0, c=4}
}

fun main2() {
    val numbers = listOf("one", "two", "three", "four")
    val listIterator = numbers.listIterator()
    println("Iterating listIterator: $listIterator")

    while (listIterator.hasNext()) {
        //println("Iterating listIterator.hasNext(): ${listIterator.hasNext()}")
        println("Iterating listIterator.next(): ${listIterator.next()}")
        listIterator.next()
    }
    println("Iterating backwards:")

    while (listIterator.hasPrevious()) {
      //  println("Iterating listIterator.hasNext(): ${listIterator.previousIndex()}")
      //  println("Iterating listIterator.next(): ${listIterator.previous()}")
        print("Index: ${listIterator.previousIndex()}")
        println(", value: ${listIterator.previous()}")
    }


}

class Version(val major: Int, val minor: Int): Comparable<Version> {
    override fun compareTo(other: Version): Int {
        if (this.major != other.major) {
            return this.major - other.major
        }
        return this.minor - other.minor
    }
}
/*
fun main() {
    val versionRange = Version(1, 11)..Version(1, 30)
    println(Version(0, 9) in versionRange)
    println(Version(1, 20) in versionRange)
}*/

fun main3() {
    val i = 1
    if (i in 1..4) { // equivalent of i >= 1 && i <= 4
        println(i)
    }

    for (i in 1..4) print(i)
    println()
    for (i in 4 downTo 1) print(i)
    println()
    for (i in 1..10 step 2) print(i)
    println()
    for (i in 10 downTo 1 step 3) print(i)
    println()
    for (i in 1 until 10) print(i)


    val versionRange = Version(1, 11)..Version(1, 30)
    println(Version(0, 9) in versionRange)
    println(Version(1, 20) in versionRange)
    sequenceOf("four", "three", "two", "one").iterator().forEach {
        println(it)
    }
    }

fun main4(){
    val numbers = listOf("one", "two", "three", "four")

    println(numbers)
    println(numbers.joinToString())

    val listString = StringBuffer("The list of numbers: ")
    numbers.joinTo(listString)
    println(listString)

    val numbers1 = listOfNotNull("one", "two", "three", "four", "five", "six","", null)
    println(numbers1.takeWhile { !it.startsWith('f') })
    println(numbers1.takeLastWhile { it != "three" })
    println(numbers1.dropWhile { it.length == 3 })
    println(numbers1.dropLastWhile { it.contains('i') })
    println(numbers1.takeIf { it.isNotEmpty() })
}

fun main() {
    val numbers = listOf("one", "two", "three", "four")
    println("${numbers.asReversed()}")
    println("${numbers.asReversed().map { it.uppercase() }}")
    println("${numbers.subList(1,3)}")
}

