package com.example.condingquest.kotlinconcepts.idioms

class Turtle {
    fun penDown() { println("Pen Down")}
    fun penUp() {println("Pen Up")}
    fun turn(degrees: Double) {println("turn $degrees")}
    fun forward(pixels: Double) {println("forward $pixels")}
}

fun main() {
    val myTurtle = Turtle()
    with(myTurtle) { //draw a 100 pix square
        penDown()
        for (i in 1..4) {
            forward(100.0)
            turn(90.0)
        }
        penUp()
    }
}