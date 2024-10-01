package com.example.bookapp.presentation.history

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.bookapp.databinding.FragmentHistoryBinding
import com.example.bookapp.presentation.BaseFragment

class HistoryFragment: BaseFragment<FragmentHistoryBinding>() {
    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentHistoryBinding = FragmentHistoryBinding.inflate(inflater, container, false)
}