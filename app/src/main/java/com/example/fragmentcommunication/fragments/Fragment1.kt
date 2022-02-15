package com.example.fragmentcommunication.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.fragmentcommunication.Communicator
import com.example.fragmentcommunication.R
import kotlinx.android.synthetic.main.fragment_1.*

class Fragment1 : Fragment() {

    private lateinit var communicator: Communicator

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        communicator = activity as Communicator
        return inflater.inflate(R.layout.fragment_1, container, false)
    }

    override fun onResume() {
        super.onResume()
        btn1.setOnClickListener {
            println("Fragment 1 : Button 1 Clicked")
            communicator.passValue("A")
        }
        btn2.setOnClickListener {
            println("Fragment 1 : Button 2 Clicked")
            communicator.passValue("B")
        }
    }
}