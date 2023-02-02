package com.example.condingquest.dsaa

fun main() {
    val data = intArrayOf(8, 7, 6, 4, 2)
    sort(data)
    println(data.contentToString())
}

fun sort(data: IntArray) {

    for (i in 0 until data.size - 1) {
        for (j in 0 until data.size - 1 - i) {
            // do the swap if required
            if (data[j] > data[j + 1]) {
                val tmp = data[j + 1]
                data[j + 1] = data[j]
                data[j] = tmp
            }
        }
    }
}