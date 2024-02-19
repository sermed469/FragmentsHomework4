package com.sermedkerim.fragmentshomework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sermedkerim.fragmentshomework4.databinding.FragmentSayfaBBinding

class SayfaBFragment : Fragment() {
    private lateinit var binding: FragmentSayfaBBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaBBinding.inflate(inflater,container,false)

        binding.buttonGoFromBToY.setOnClickListener {
            val goToY = Navigation.findNavController(it)
            goToY.navigate(R.id.navigationPageBtoPageY)
        }

        return binding.root
    }
}