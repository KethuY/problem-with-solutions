package com.example.condingquest.designpatterns

object Singleton {
    const val NAME="Satya"
    init {
        println("Singleton Design Patter")
    }
}

fun main(){
    println(Singleton.NAME)
}