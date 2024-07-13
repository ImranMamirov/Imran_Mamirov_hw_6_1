package com.example.imran_mamirov_hw_6_1

import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.example.imran_mamirov_hw_6_1.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }

    //    private val view by lazy { ViewModelProvider(this)[CounterViewModel::class.java]}
    private val viewModel by viewModels<CounterViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setupClickListeners()
        setupObservers()
    }

    private fun setupObservers() {
        viewModel.counterData.observe(this) { data ->
            binding.tvResult.text = data.toString()
        }
    }

    private fun setupClickListeners() = with(binding) {
        btnPlus.setOnClickListener {
            viewModel.onIncrement()
        }

        btnMinus.setOnClickListener {
            viewModel.onDecrement()
        }
    }
}