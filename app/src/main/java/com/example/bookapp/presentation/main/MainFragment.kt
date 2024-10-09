package com.example.bookapp.presentation.main

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.bookapp.databinding.FragmentMainBinding
import com.example.bookapp.presentation.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainFragment : BaseFragment<FragmentMainBinding>() {
    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ) = FragmentMainBinding.inflate(
        inflater,
        container,
        false
    )
}
