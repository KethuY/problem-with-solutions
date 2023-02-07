package com.example.condingquest.kotlinconcepts.idioms

fun main(){
     println("CLosed range")
     for (i in 1..25){
         print(" $i  ")// closed range: includes 100
     }
     println()
     println("Half open range")

     for (i in 1 until 20) {
         print(" $i  ") // half-open range: does not include 100
     }
     println()

     println("Step range")

     for (x in 2..10 step 2) {  print(" $x  ") }
     println()

     println("Down range")
     for (x in 10 downTo 1) {  print(" $x  ") }
     println()

     println("foreach range")
     (1..10).forEach {  print(" $it  ") }
    println("Map ")
    val map = mapOf("a" to 1, "b" to 2, "c" to 3)

    for ((k, v) in map) {
        println("$k -> $v")
    }

    println(" Singlten ${Resource.name} ")

    val myObject = object :MyAbstractClass(){
        override fun doSomething() {
            println(" doSomething ")

        }
        override fun sleep() {
            println(" sleep ")
        }
    }
    myObject.doSomething()
    myObject.sleep()

 /*   val values = mapOf("a" to 1, "b" to 2, "c" to 3)
    val email = values["d"] ?: throw IllegalStateException("Email is missing!")
    println(" $email ")*/


    val emails: String? = "sdfdsf"
    val mainEmail = emails?.lastOrNull()?: "Default"
    println(" $mainEmail ")

    val value :String?="Satya"

    value?.let {
        println("  $it ")
    }

}

object Resource {
    val name = "Name"
}

abstract class MyAbstractClass {
    abstract fun doSomething()
    abstract fun sleep()
}