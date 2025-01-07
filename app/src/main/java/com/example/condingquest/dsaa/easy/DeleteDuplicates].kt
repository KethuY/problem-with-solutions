package com.example.condingquest.dsaa.easy

/**
 * @Author: Yerramma Kethu
 * @Date: 07/01/2025
 * Given the head of a sorted linked list, delete all duplicates such that each element appears only once. Return the linked list sorted as well.
 */

fun main() {
    println(deleteDuplicates(listOf(1, 1, 2)))
}

fun deleteDuplicates(listOf: List<Int>) = listOf.distinct()