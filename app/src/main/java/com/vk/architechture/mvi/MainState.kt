package com.vk.architechture.mvi

sealed class MainState {
    object Loading : MainState()
    data class Success(val data: String) : MainState()
}
