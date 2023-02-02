package com.example.condingquest.dsaa.linkedlist

fun main() {
    val linkedList = LinkedList<Int>()
    println("List isEmpty : ${linkedList.isEmpty}")
    linkedList.addAtStart(data = 5)
    linkedList.addAtStart(data = 10)
    linkedList.addAtStart(data = 2)
    linkedList.addAtStart(data = 12)
    linkedList.addAtStart(data = 19)
    linkedList.addAtStart(data = 20)
    println("List isEmpty after : ${linkedList.isEmpty}")
    println(linkedList.toString())
    println(linkedList.length())
    println(linkedList.deleteAtStart())
    println(linkedList.toString())
    println(linkedList.find(data = 12))
    println(linkedList.find(data = 120))
}