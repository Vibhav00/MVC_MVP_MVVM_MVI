package com.vk.architechture.mvi

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.launch

class MviViewModel : ViewModel() {
    private val _state = MutableStateFlow<MainState>(MainState.Loading)
    val state: StateFlow<MainState> get() = _state

    fun processIntent(intent: MainIntent) {
        when (intent) {
            is MainIntent.FetchData -> fetchData()
        }
    }

    private fun fetchData() {
        viewModelScope.launch {
            _state.value = MainState.Loading
            delay(1000)
            _state.value = MainState.Success("API Response")
        }
    }
}
