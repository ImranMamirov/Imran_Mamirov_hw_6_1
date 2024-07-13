package com.example.imran_mamirov_hw_6_1

class CounterModel {

    private var count = 0

    fun inc() {
        count++
    }

    fun dec() {
        count--
    }

    fun getResult() = count
}