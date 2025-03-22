package com.vk.architechture.mvvm

import kotlinx.coroutines.delay

class Repository {
    suspend fun fetchData(): String {
        delay(1000) // Simulate API call delay
        return "API Response"
    }
}
