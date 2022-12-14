package com.example.fhsnews

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.viewModels
import com.example.fhsnews.adapter.NewsCardAdapter
import com.example.fhsnews.databinding.FragmentNewsScrollerBinding
import com.example.fhsnews.overview.OverviewViewModel

class NewsScrollerFragment : Fragment() {


    private val viewModel: OverviewViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentNewsScrollerBinding.inflate(inflater)

        binding.lifecycleOwner = this
        binding.viewModel = viewModel
        binding.newsRecycler.adapter = NewsCardAdapter()

        return binding.root
    }
}