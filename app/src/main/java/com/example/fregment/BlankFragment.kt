package com.example.fregment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.lifecycle.ViewModelProvider

class BlankFragment : Fragment() {
    private lateinit var viewModel: SharedViewModel

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        viewModel = ViewModelProvider(requireActivity()).get(SharedViewModel::class.java)
        // Ваш код для инициализации UI
        return inflater.inflate(R.layout.fragment_blank, container, false)
    }

    // Пример передачи данных
    private fun sendData() {
        viewModel.text.value = "Hello from BlankFragment"
    }
}