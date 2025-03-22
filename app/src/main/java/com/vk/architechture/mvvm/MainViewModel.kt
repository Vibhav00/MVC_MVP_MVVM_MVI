package com.vk.architechture.mvvm

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import kotlinx.coroutines.launch

class MainViewModel : ViewModel() {
    private val repository = Repository()
    private val _data = MutableLiveData<String>()
    val data: LiveData<String> get() = _data

    fun fetchData() {
        viewModelScope.launch {
            _data.value = repository.fetchData()
        }
    }
}
