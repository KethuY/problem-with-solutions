package com.example.condingquest.kotlinconcepts.someoddkeys

class Structure {

    infix fun createPyramid(rows: Int) {
        var k = 0
        for (i in 1..rows) {
            k = 0
            for (space in 1..rows-i) {
                print("  ")
            }
            while (k != 2*i-1) {
                print("* ")
                ++k
            }
            println()
        }
    }

    infix fun print1(rows: String) {
       println(rows)
    }
}


fun main(args: Array<String>) {
    val p = Structure()
    p createPyramid 4 // p.createPyramid(4)
    p print1 "Satya"

    myInlineFun { println("Call to inline function") }

    //  p print "Satya"
}


inline fun myInlineFun(myFun: () -> Unit ) {
    myFun()
    print("TutorialsPoint")
}