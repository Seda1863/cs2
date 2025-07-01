package com.example.cs2

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.cs2.databinding.FragmentQuestion1Binding

class Question1Fragment : Fragment() {
    private lateinit var binding: FragmentQuestion1Binding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = FragmentQuestion1Binding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.submitButton1.setOnClickListener {
            findNavController().navigate(R.id.action_question1Fragment_to_question2Fragment)
        }
    }
}