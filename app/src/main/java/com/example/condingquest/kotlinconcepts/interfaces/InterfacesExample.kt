package com.example.condingquest.kotlinconcepts.interfaces


interface MyInterface {
    fun bar()
    fun foo() {
        println("foo")
    }
}

class MyInterfaceImpl:MyInterface{
    override fun bar() {
        println("bar")
    }
}

fun main(){
    println(MyInterfaceImpl().foo())
    println(MyInterfaceImpl().bar())
}