package com.example.imran_mamirov_hw_6_1

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CounterViewModel : ViewModel() {

    private val _counterData = MutableLiveData(10)
    val counterData: LiveData<Int> = _counterData

    fun onIncrement() {
        _counterData.value = (_counterData.value ?: 0) + 1
    }

    fun onDecrement() {
        _counterData.value = (_counterData.value ?: 0) - 1
    }
}