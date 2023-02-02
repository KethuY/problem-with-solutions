package com.example.condingquest.dsaa.linkedlist


open  class LinkedList<T>{
    var head: Node<T>? = null
    fun addAtStart(data: T) {
        head = Node(data, head)
    }

    fun deleteAtStart(): Node<T>? {
        val toDel = head
        head = head!!.nextNode
        return toDel
    }

    fun find(data: T): Node<T>? {
        var curr = head
        while (curr != null) {
            if (curr.data == data) {
                return curr
            }
            curr = curr.nextNode
        }
        return null
    }

    fun length(): Int {
        if (head == null) return 0
        var length = 0
        var curr = head
        while (curr != null) {
            length += 1
            curr = curr.nextNode
        }
        return length
    }

    val isEmpty: Boolean
        get() = head == null

     override fun toString(): String {
         var res = ""
         var curr = head
         while (curr != null) {
             res += "$curr, "
             curr = curr.nextNode
         }
         return res
     }

}

data class Node<T>(val data: T, var nextNode: Node<T>? = null)