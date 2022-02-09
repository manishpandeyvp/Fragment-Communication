package com.example.fragmentcommunication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.fragmentcommunication.fragments.Fragment1
import com.example.fragmentcommunication.fragments.Fragment2

class MainActivity : AppCompatActivity(), Communicator {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer1, Fragment1()).commit()
        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer2, Fragment2()).commit()
    }

    override fun passValue(value: String) {
        val bundle = Bundle()
        bundle.putString("message", value)
        println(bundle.getString("message"))
        val fragment2 = Fragment2()
        fragment2.arguments = bundle
        Log.d("Main Activity", value)
        fragment2.arguments?.getString("message").let { println(it) }

        supportFragmentManager.beginTransaction().replace(R.id.fragmentContainer2, fragment2).commit()
    }
}