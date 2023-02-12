package com.example.condingquest.kotlinconcepts.dataclasses

data class User(val name: String, val age: Int){

}
data class Person(val name: String) {
    var age: Int = 0
}
fun main(){
    val user=User("Satya",30)
    println(user.toString())
    val pers = Person("Satya")
    println(pers.toString())
    val jack = User(name = "Jack", age = 1)
    val olderJack = jack.copy(age = 2)

    println(jack==olderJack)
    println(olderJack)
    println(jack)
    val jane = User("Jane", 35)
    val (name, age) = jane
    println("$name,$age")


}
