package com.example.fragmentcommunication.fragments

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.content.ContextCompat
import com.example.fragmentcommunication.R
import kotlinx.android.synthetic.main.fragment_2.*

class Fragment2 : Fragment() {

    var message : String ?= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Fragment 2", "On Create")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        message = arguments?.getString("message")
        println(message)
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onResume() {
        super.onResume()
        Log.d("Fragment 2", "on Resume")
        if(message != null){
            Log.d("Fragment 2", message!!)
            if(message == "A")
                image.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.ic_filled_icon))
            else
                image.setImageDrawable(ContextCompat.getDrawable(requireContext(), R.drawable.ic_outlined_icon))
        }
    }
}