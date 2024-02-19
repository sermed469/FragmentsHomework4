package com.sermedkerim.fragmentshomework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.NavController
import androidx.navigation.Navigation
import com.sermedkerim.fragmentshomework4.databinding.FragmentAnaSayfaBinding

class AnaSayfaFragment : Fragment() {

    private lateinit var binding: FragmentAnaSayfaBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentAnaSayfaBinding.inflate(inflater,container,false)

        binding.buttonGoToPageA.setOnClickListener {
            val goToA = Navigation.findNavController(it)
            goToA.navigate(R.id.navigationAnasayfaToPageA)
        }

        binding.buttonGoToPageX.setOnClickListener {
            val goToX = Navigation.findNavController(it)
            goToX.navigate(R.id.navigationAnasayfaToPageX)
        }

        return binding.root
    }
}