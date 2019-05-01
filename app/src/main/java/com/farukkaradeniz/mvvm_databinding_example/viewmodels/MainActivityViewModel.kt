package com.farukkaradeniz.mvvm_databinding_example.viewmodels

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.farukkaradeniz.mvvm_databinding_example.FakeRepository

class MainActivityViewModel: ViewModel() {
    private val province: MutableLiveData<String> = MutableLiveData()
    val name: MutableLiveData<String> = MutableLiveData()

    private val repo = FakeRepository()

    init {
        province.value = repo.provinces.random()
        name.value = ""
    }

    fun getProvince(): LiveData<String> = province

    fun randomizeProvince() {
        province.value = repo.provinces.random()
        Log.i(this.javaClass.simpleName, "Here ${province.value}")
    }

}

