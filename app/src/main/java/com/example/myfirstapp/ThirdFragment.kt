package com.example.myfirstapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.myfirstapp.databinding.FragmentThirdBinding
class ThirdFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentThirdBinding.inflate(inflater, container,false)

        binding.buttonReturnToSecondPage.setOnClickListener{
            findNavController().navigate(R.id.action_ThirdFragment_to_SecondFragment)
        }

        binding.buttonGoToListPage.setOnClickListener{
            findNavController().navigate(R.id.action_ThirdFragment_to_ListFragment)
        }

        return binding.root
    }

}