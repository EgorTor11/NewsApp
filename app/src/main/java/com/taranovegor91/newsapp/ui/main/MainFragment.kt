package com.taranovegor91.newsapp.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.taranovegor91.newsapp.R
import com.taranovegor91.newsapp.databinding.FragmentDetailseBinding
import com.taranovegor91.newsapp.databinding.FragmentMainBinding


class MainFragment : Fragment() {
    lateinit var binding: FragmentMainBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        binding= FragmentMainBinding.inflate(layoutInflater,container,false)
        return binding.root
    }

}