package com.rizdev.pkkwu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rizdev.pkkwu.databinding.FragmentKompetensiBinding
import com.rizdev.pkkwu.databinding.FragmentMateriBinding


class MateriFragment : Fragment() {

    private var _binding : FragmentMateriBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentMateriBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.bgKurikulum.setOnClickListener {
            findNavController().navigate(R.id.action_materiFragment_to_kompetensiFragment)
        }
    }
}