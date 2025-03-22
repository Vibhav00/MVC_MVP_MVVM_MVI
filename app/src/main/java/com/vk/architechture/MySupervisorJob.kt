package com.vk.architechture

import kotlinx.coroutines.*

suspend fun task1() {
    delay(1000)
    println("Task 1 completed")
}

suspend fun task2() {
    delay(1500)
    println("Task 2 completed")
}

suspend fun task3() {
    delay(500)
    throw Exception("Task 3 failed")
}

suspend fun main() {
    supervisorScope { // Ensures failure of one coroutine doesn't cancel others
        launch { task3() }  // This will fail but won't affect others
        launch { task2() }
        launch { task1() }
    }

}