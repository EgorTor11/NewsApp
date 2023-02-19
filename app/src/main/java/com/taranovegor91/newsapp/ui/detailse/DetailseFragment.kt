package com.taranovegor91.newsapp.ui.detailse

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.taranovegor91.newsapp.R
import com.taranovegor91.newsapp.databinding.FragmentDetailseBinding


class DetailseFragment : Fragment() {
    lateinit var binding: FragmentDetailseBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
       binding=FragmentDetailseBinding.inflate(layoutInflater,container,false)
        return binding.root
    }
}