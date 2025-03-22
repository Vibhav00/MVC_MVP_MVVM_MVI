package com.vk.architechture.mvp

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainPresenter(private val view: MainView, private val model: ApiModel) {
    fun fetchData() {
        view.showLoading()
        CoroutineScope(Dispatchers.Main).launch {
            val data = model.fetchData()
            view.showData(data)
        }
    }
}
