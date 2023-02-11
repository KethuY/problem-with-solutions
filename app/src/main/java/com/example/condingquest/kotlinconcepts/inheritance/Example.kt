package com.example.condingquest.kotlinconcepts.inheritance

open class BaseInheritanceExample(name:String)

class InheritanceExample(val p: String) : BaseInheritanceExample(p){

}

open class Shape {
    open val vertexCount: Int = 0
}

class Rectangle(override val vertexCount: Int = 4) : Shape() {
}




class Polygon : Shape() {
    override var vertexCount: Int = 0  // Can be set to any number later
}



open class Base(val name: String) {

    init { println("Initializing a base class") }

    open val size: Int =
        name.length.also { println("Initializing size in the base class: $it") }
}

class Derived(
    name: String,
    val lastName: String,
) : Base(name.replaceFirstChar { it.uppercase() }.also { println("Argument for the base class: $it") }) {

    init { println("Initializing a derived class") }

    override val size: Int =
        (super.size + lastName.length).also { println("Initializing size in the derived class: $it") }
}


fun main(){
    // println(InheritanceExample("Satya Meena Chaitu").p)
    val derived=Derived("satya","kethu")
    println(derived.name)
    println(derived.lastName)
    println(derived.size)
}