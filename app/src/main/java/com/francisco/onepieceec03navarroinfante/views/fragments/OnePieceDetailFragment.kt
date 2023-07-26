package com.francisco.onepieceec03navarroinfante.views.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.francisco.onepieceec03navarroinfante.databinding.FragmentOnePieceDetailBinding


class OnePieceDetailFragment : Fragment() {
    private lateinit var binding: FragmentOnePieceDetailBinding
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        binding = FragmentOnePieceDetailBinding.inflate(inflater, container, false)
        return binding.root
    }


}