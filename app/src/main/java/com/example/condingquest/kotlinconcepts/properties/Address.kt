package com.example.condingquest.kotlinconcepts.properties

class Address {
    var name: String = "Holmes, Sherlock"
    var street: String = "Baker"
    var city: String = "London"
    var state: String? = null
    var zip: String = "123456"

    override fun toString(): String {
        return name + "\n" + street + "\n" + city + "\n" + state + "\n" + zip
    }
}

var initialized = 1


class Rectangle(val width: Int, val height: Int) {
    val area get() = this.width * this.height

}
fun main() {
    println(Address().toString())
    initialized=10
    val rectangle = Rectangle(3, 4)
    println("Width=${rectangle.width}, height=${rectangle.height}, area=${rectangle.area}")

    println(stringRepresentation)
    //stringRepresentation = "Srinu"
}

var stringRepresentation: String
    get() = "Satya"
    set(value) {
        setDataFromString(value) // parses the string and assigns values to other properties
    }

fun setDataFromString(value: String) {
    println(value)
    stringRepresentation = value
}

private var _table: Map<String, Int>? = null
public var table: Map<String, Int>
    get() {
        if (_table == null) {
            _table = HashMap() // Type parameters are inferred
        }
        return _table ?: throw AssertionError("Set to null by another thread")
    }
    set(value) {
        _table = value
    }

