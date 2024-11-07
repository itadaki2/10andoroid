package com.example.fregment

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SharedViewModel : ViewModel() {
    val text: MutableLiveData<String> = MutableLiveData()
}