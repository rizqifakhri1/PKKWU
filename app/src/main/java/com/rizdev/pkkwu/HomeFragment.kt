package com.rizdev.pkkwu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rizdev.pkkwu.databinding.FragmentHomeBinding


class HomeFragment : Fragment() {

    private var _binding : FragmentHomeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentHomeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.banner1.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_materiFragment)
        }
        binding.banner2.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_kompetensiFragment)
        }
        binding.tvSeeallBelajar.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_materiFragment)
        }
        binding.tvFitur1.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_materiFragment)
        }
        binding.tvFitur2.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_petunjukFragment)
        }
        binding.tvFitur3.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_kompetensiFragment)
        }
        binding.tvFitur4.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_evaluasiFragment)
        }
        binding.tvFitur5.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_kreditFragment)
        }
        binding.tvSeeallFitur.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_fiturFragment2)
        }
        binding.tvTextAboutus.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_kreditFragment)
        }
        binding.btnKuis.setOnClickListener {
            findNavController().navigate(R.id.action_homeFragment_to_evaluasiFragment)
        }

    }

}