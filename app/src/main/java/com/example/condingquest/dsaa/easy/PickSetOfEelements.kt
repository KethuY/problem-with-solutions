package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 05/01/2025
 */

fun main() {
    val arr = listOf('a', 'b', 'c', 'd', 'e')
   println("$arr  ; ${pickSetOfElements(arr,1)}")
   println("$arr  ; ${pickSetOfElements(arr,2)}")
   println("$arr  ; ${pickSetOfElements(arr,6)}")
   println("$arr  ; ${pickSetOfElements(arr,4)}")
}
fun pickSetOfElements(arr: List<Char>, n: Int): List<Char> {
    if(arr.isEmpty() || arr.size == 1 || n >= arr.size) {
        return arr
    }

  return  arr.subList(0,n)
}