package com.rizdev.pkkwu

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.rizdev.pkkwu.databinding.FragmentEvaluasiBinding
import com.rizdev.pkkwu.databinding.FragmentKompetensiBinding


class EvaluasiFragment : Fragment() {

    private var _binding : FragmentEvaluasiBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        _binding = FragmentEvaluasiBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.btnBack.setOnClickListener {
            findNavController().popBackStack()
        }

        binding.btnKuis.setOnClickListener {
            val uri: Uri =
                Uri.parse("https://bit.ly/KUIS_PKKWU") // missing 'http://' will cause crashed
            val intent = Intent(Intent.ACTION_VIEW, uri)
            startActivity(intent)
        }
    }

}