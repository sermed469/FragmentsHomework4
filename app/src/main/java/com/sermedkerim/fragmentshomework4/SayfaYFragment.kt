package com.sermedkerim.fragmentshomework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.OnBackPressedCallback
import com.sermedkerim.fragmentshomework4.databinding.FragmentSayfaYBinding

class SayfaYFragment : Fragment() {
    private lateinit var binding: FragmentSayfaYBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaYBinding.inflate(inflater,container,false)

        val backPress = object : OnBackPressedCallback(true){
            override fun handleOnBackPressed() {
                isEnabled = false
                requireActivity().onBackPressedDispatcher.onBackPressed()
            }
        }

        requireActivity().onBackPressedDispatcher.addCallback(backPress)

        return binding.root
    }
}