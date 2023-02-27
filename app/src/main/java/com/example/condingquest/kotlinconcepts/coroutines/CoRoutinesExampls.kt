package com.example.condingquest.kotlinconcepts.coroutines
import kotlinx.coroutines.*

fun main1() = runBlocking { // this: CoroutineScope
  doWorld()
}

suspend fun doWorld() = coroutineScope {
    launch {
        println("Satya")
    }
    delay(1000L)
    println("Hello World")
}

fun main() = runBlocking {
    val job = launch {
        repeat(10) { i ->
            println("job: I'm sleeping $i ...")
           // delay(500L)
        }
    }
    job.cancel()
    job.join()
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancel() // cancels the job
   // job.join() // waits for job's completion
    println("main: Now I can quit.")
}