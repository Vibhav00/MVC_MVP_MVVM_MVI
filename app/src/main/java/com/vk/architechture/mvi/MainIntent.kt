package com.vk.architechture.mvi

sealed class MainIntent {
    object FetchData : MainIntent()
}
