package com.example.condingquest.kotlinconcepts.classesobj

class Person(val name: String) {
    override fun toString(): String {
        return name
    }
}

fun main() {
    val person = Person("android")
    println(person.toString())
    InitOrderDemo("hello")
    SuperSpecificButton().click()
}

class InitOrderDemo(name: String) {
    val dummy = name.reversed()
    val firstProperty = "First property: $name".also(::println)

    init {
        println("First initializer block that prints $name")
    }

    val secondProperty = "Second property: ${name.length}".also(::println)

    init {
        println("Second initializer block that prints ${name.length}")
    }
}

public class Customer(name: String) { /*...*/ }


class Person1  (val name: String) {
    val children: MutableList<Person1> = mutableListOf()
    constructor(name: String, parent: Person1) : this(name) {
        parent.children.add(this)
    }
}

class DontCreateMe private constructor(){

}


 abstract class Polygon {
    abstract fun draw()
}

class Rectangle : Polygon() {
    override fun draw() {
        // draw the rectangle
    }
}



open class Button {
    open fun click() = print("Click")
    fun doubleClick() = print("Double Click")
}

 open class SpecificButton() : Button() { // Inheritance is now possible
    override fun click() = print("Specific Click") // Now it works
   // override fun doubleClick() = print("Specific Double Click") // Error
}


open class SuperSpecificButton : SpecificButton() {
    final override fun click() = print("Super Specific Click")
}
class SuperduperSpecificButton : SuperSpecificButton() {
      fun click1() = print("Super Duper Specific Click")
}