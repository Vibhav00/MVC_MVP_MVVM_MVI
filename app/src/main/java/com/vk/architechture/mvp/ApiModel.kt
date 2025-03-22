package com.vk.architechture.mvp

import kotlinx.coroutines.delay

open class ApiModel {
    suspend fun fetchData(): String {
        delay(1000)
        return "API Response"
    }
}
