package com.example.fragmentcommunication.fragments

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.content.res.AppCompatResources
import androidx.fragment.app.Fragment
import com.example.fragmentcommunication.R
import kotlinx.android.synthetic.main.fragment_2.*

class Fragment2 : Fragment() {

//    var message : String ?= ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        println("Fragment 2 : On Create")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
//        message = arguments?.getString("message")
        return inflater.inflate(R.layout.fragment_2, container, false)
    }

    override fun onResume() {
        super.onResume()
        println("Fragment 2 : On Resume")
    }

    fun displayImage(message: String, context: Context) {
        println("Fragment 2 : message is : $message")

        if (message == "A") {
            image.setImageDrawable(
                AppCompatResources.getDrawable(
                    requireActivity().applicationContext,
                    R.drawable.ic_filled_icon
                )
            )
//            image.setImageDrawable(
//                contextCompat.getDrawable(
//                    requireContext(),
//                    R.drawable.ic_filled_icon
//                )
//            )
        } else {
            image.setImageDrawable(
                AppCompatResources.getDrawable(
                    this.requireContext(),
                    R.drawable.ic_outlined_icon
                )
            )
//            image.setImageDrawable(
//                ContextCompat.getDrawable(
//                    requireContext(),
//                    R.drawable.ic_outlined_icon
//                )
//            )
        }
    }
}