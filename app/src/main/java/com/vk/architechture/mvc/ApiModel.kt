package com.vk.architechture.mvc

import kotlinx.coroutines.delay

class ApiModel {
    suspend fun fetchData(): String {
        delay(1000)
        return "API Response"
    }
}
