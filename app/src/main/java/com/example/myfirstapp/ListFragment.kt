package com.example.myfirstapp

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.myfirstapp.databinding.FragmentListBinding
import com.example.myfirstapp.recyclerview.AdapterItemToBuy
import com.example.myfirstapp.recyclerview.ItemToBuy


class ListFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val binding = FragmentListBinding.inflate(inflater, container, false)

        binding.recyclerView.layoutManager = LinearLayoutManager(requireContext())

        val data = listOf(
            ItemToBuy("shampoo", R.drawable.shampoo),
            ItemToBuy("toothpaste", R.drawable.toothpaste),
            ItemToBuy("soap", R.drawable.soap),
            ItemToBuy("cola", R.drawable.cola),
            ItemToBuy("shampoo", R.drawable.shampoo),
            ItemToBuy("toothpaste", R.drawable.toothpaste),
            ItemToBuy("soap", R.drawable.soap),
            ItemToBuy("cola", R.drawable.cola),
            ItemToBuy("shampoo", R.drawable.shampoo),
            ItemToBuy("toothpaste", R.drawable.toothpaste),
            ItemToBuy("soap", R.drawable.soap),
            ItemToBuy("cola", R.drawable.cola),
            ItemToBuy("shampoo", R.drawable.shampoo),
            ItemToBuy("toothpaste", R.drawable.toothpaste),
            ItemToBuy("soap", R.drawable.soap),
            ItemToBuy("cola", R.drawable.cola),
            ItemToBuy("shampoo", R.drawable.shampoo),
            ItemToBuy("toothpaste", R.drawable.toothpaste),
            ItemToBuy("soap", R.drawable.soap),
            ItemToBuy("cola", R.drawable.cola)
        )

        binding.recyclerView.adapter = AdapterItemToBuy(data)

        binding.buttonFromListPageToThirdFragment.setOnClickListener{
            findNavController().navigate(R.id.action_ListFragment_to_ThirdFragment)
        }

        return binding.root
    }

}