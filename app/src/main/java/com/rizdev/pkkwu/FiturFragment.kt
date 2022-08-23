package com.rizdev.pkkwu

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.rizdev.pkkwu.databinding.FragmentFiturBinding


class FiturFragment : Fragment() {
    private var _binding : FragmentFiturBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentFiturBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }
        binding.tvMateri.setOnClickListener {
            findNavController().navigate(R.id.action_fiturFragment_to_materiFragment)
        }
        binding.tvEvaluasi.setOnClickListener {
            findNavController().navigate(R.id.action_fiturFragment_to_evaluasiFragment)
        }
        binding.tvKredit.setOnClickListener {
            findNavController().navigate(R.id.action_fiturFragment_to_kreditFragment)
        }
        binding.tvKompetensi.setOnClickListener {
            findNavController().navigate(R.id.action_fiturFragment_to_kompetensiFragment)
        }
        binding.tvPetunjuk.setOnClickListener {
            findNavController().navigate(R.id.action_fiturFragment_to_petunjukFragment)
        }
    }
}