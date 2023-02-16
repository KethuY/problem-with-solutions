package com.example.condingquest.kotlinconcepts.generics

data class Box<T>(val t: T) {
    var value = t
}


interface Source<out T> {
    fun nextT(): T
}

fun demo(strs: Source<String>) {
    val objects: Source<Any> = strs // This is OK, since T is an out-parameter
    // ...
}

interface Production<out T> {
    fun produce(): T
}

interface Consumer<in T> {
    fun consume(item: T)
}

interface ProductionConsumer<T> {
    fun produce(): T
    fun consume(item: T)
}

class OutClass<out T>(val value: T) {
    fun get(): T {
        return value
    }
}




 class Name(val s: String) {
    init {
        require(s.isNotEmpty()) { }
    }

    val length: Int
        get() = s.length

    fun greet() {
        println("Hello, $s")
    }
}


interface Printable {
    fun prettyPrint(): String
}

@JvmInline
value class Name1(val s: String) : Printable {
    override fun prettyPrint(): String = "Let's $s!"
}


interface Base {
    fun print()
}

class BaseImpl(val x: Int) : Base {
    override fun print() { print(x) }
}

class Derived(b: Base) : Base by b


class KotlinConsumer<in T> {
    fun toString(value: T): String {
        return value.toString()
    }
}


class KotlinProducer<out T>(val value: T) {
    init {
        println(value)
    }
}



fun main(){
    val box: Box<Int> = Box<Int>(1)
    println(box)
    val name = Name("Kotlin")
    name.greet() // method `greet` is called as a static method
    println(name.length) // property getter is called as a static method

    val name1 = Name1("Kotlin")
    println(name1.prettyPrint()) // Still called as a static method


    val helloWorld = object {
        val hello = "Hello"
        val world = "World"
        // object expressions extend Any, so `override` is required on `toString()`
        override fun toString() = "$hello $world"
    }
    print(helloWorld)

    val b = BaseImpl(10)
    Derived(b).print()



    val inValue: KotlinConsumer<Number> = KotlinConsumer()
    val copyOfInValue: KotlinConsumer<Int> = inValue
    if (copyOfInValue is KotlinConsumer<Int>) {
        println(copyOfInValue.toString())
    }

    val outValue = KotlinProducer("Just a string")
    val copyOfOutValue: KotlinProducer<Any> = outValue
    println(copyOfOutValue.value.toString())
}





class MyStringCollection {
    infix fun add(s: String) {
        
    }

    fun build() {
        this add "abc"   // Correct
        add("abc")       // Correct
        //add "abc"        // Incorrect: the receiver must be specified
    }
}