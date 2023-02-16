package com.example.condingquest.kotlinconcepts.sealedclasses

sealed class Response<out R>
class Success<R>(val value: R): Response<R>()
class Failure(val error: Throwable): Response<Nothing>()

fun handle(response: Response<String>) {
    val text = when (response) {
        is Success -> "Success with ${response.value}"
        is Failure -> "Error"
        // else is not needed here
    }
    print(text)
}

sealed class OsSealed(val company: String) {
    object Linux : OsSealed("Open-Source")
    object Windows : OsSealed("Microsoft")
    object Mac : OsSealed("Apple")
}


sealed class A1{
    class B : A1()
    class C : A1()
}



sealed class A{
    class B : A()
    {
        class E : A() //this works.
    }
    class C : A()

    init {
        println("sealed class A")
    }

}

class D : A() //this works
{
    class F: A() //This won't work. Since sealed class is defined in another scope.
}


sealed class Shape{
    class Circle(var radius: Float): Shape()
    class Square(var length: Int): Shape()
    class Rectangle(var length: Int, var breadth: Int): Shape()
}

fun eval(e: Shape) =
    when (e) {
        is Shape.Circle -> println("Circle area is ${3.14*e.radius*e.radius}")
        is Shape.Square -> println("Square area is ${e.length*e.length}")
        is Shape.Rectangle -> println("Rectagle area is ${e.length*e.breadth}")
    }


fun main(){
//val value= D()

    var circle = Shape.Circle(4.5f)
    var square = Shape.Square(4)
    var rectangle = Shape.Rectangle(4,5)

    eval(circle)
    eval(square)
    eval(rectangle)
    println(greetMammal(Cat("Snowy")))
}




sealed class Mammal(val name: String)                                                   // 1

class Cat(val catName: String) : Mammal(catName)                                        // 2
class Human(val humanName: String, val job: String) : Mammal(humanName)

fun greetMammal(mammal: Mammal): String {
    when (mammal) {                                                                     // 3
        is Human -> return "Hello ${mammal.name}; You're working as a ${mammal.job}"    // 4
        is Cat -> return "Hello ${mammal.name}"                                         // 5
    }                                                                                   // 6
}

