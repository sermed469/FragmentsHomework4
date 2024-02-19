package com.sermedkerim.fragmentshomework4

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.Navigation
import com.sermedkerim.fragmentshomework4.databinding.FragmentAnaSayfaBinding
import com.sermedkerim.fragmentshomework4.databinding.FragmentSayfaABinding

class SayfaAFragment : Fragment() {
    private lateinit var binding: FragmentSayfaABinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSayfaABinding.inflate(inflater,container,false)

        binding.buttonGoToPageB.setOnClickListener {
            val goToB = Navigation.findNavController(it)
            goToB.navigate(R.id.navigationPageAtoPageB)
        }

        return binding.root
    }
}