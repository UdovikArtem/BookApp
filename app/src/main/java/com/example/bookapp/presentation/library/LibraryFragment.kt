package com.example.bookapp.presentation.library

import android.view.LayoutInflater
import android.view.ViewGroup
import com.example.bookapp.databinding.FragmentLibraryBinding
import com.example.bookapp.presentation.BaseFragment
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class LibraryFragment : BaseFragment<FragmentLibraryBinding>() {
    override fun inflateViewBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): FragmentLibraryBinding = FragmentLibraryBinding.inflate(
        inflater,
        container,
        false
    )
}
