package com.example.condingquest.kotlinconcepts.coroutines
import kotlinx.coroutines.*

fun main1() = runBlocking { // this: CoroutineScope
    doWorld()
    println("Done")
}

private suspend fun doWorld() = coroutineScope {
    launch {
        delay(2000L)
        println("World 2")
    }
    launch {
        delay(1000L)
        println("World 1")
    }
    println("Hello")
}



/*fun main() = runBlocking { // this: CoroutineScope
    val job = launch { // launch a new coroutine and keep a reference to its Job
        delay(1000L)
        println("World!")
    }
    job.invokeOnCompletion {
        println("Completed")
    }
    println("Hello")
   // job.takeIf { it.isActive }?.join()
    job.takeUnless { !it.isActive }?.join()
   // job.join()
  // job.cancelAndJoin()



    println("Done")
}*/

/*
fun main() = runBlocking {

    repeat(10) {  // launch a lot of coroutines
        val job = launch {
            delay(100L)
            println("$it *")
        }
       if(it%2 ==0 ) job.cancel()
    }
}*/


fun main()= runBlocking {
    val job = launch {
        repeat(1000) { i ->
            println("job: I'm sleeping $i ...")
            delay(500L)
        }
    }
    delay(1300L) // delay a bit
    println("main: I'm tired of waiting!")
    job.cancel() // cancels the job
    job.join() // waits for job's completion
    println("main: Now I can quit.")
}
