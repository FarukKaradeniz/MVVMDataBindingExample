package com.farukkaradeniz.mvvm_databinding_example

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProviders
import com.farukkaradeniz.mvvm_databinding_example.databinding.ActivityMainBinding
import com.farukkaradeniz.mvvm_databinding_example.viewmodels.MainActivityViewModel

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val viewModel = ViewModelProviders.of(this).get(MainActivityViewModel::class.java)
        val binding: ActivityMainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.lifecycleOwner = this
        binding.viewmodel = viewModel
    }
}
