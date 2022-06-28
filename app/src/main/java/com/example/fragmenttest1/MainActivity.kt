package com.example.fragmenttest1

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity


class MainActivity : AppCompatActivity() {

   // val fragmentOne: FragmentOne = FragmentOne()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        loadSecondFragment()
    }


    fun loadSecondFragment() {
        val secondFragment = supportFragmentManager.findFragmentById(R.id.frameLayoutMain) as FragmentSecond
        secondFragment.activity = this
       // val secondFragment = FragmentSecond()
        //val fragTransaction = supportFragmentManager.beginTransaction()
       // secondFragment.activity = this
        //secondFragment.showDetails(secondFragment.firstNameEditText.text.toString(), secondFragment.lastNameEditText.text.toString())
        //fragTransaction.add(R.id.frameLayoutMain, secondFragment)
        //fragTransaction.commit()
    }

    fun showDetailsActivity(firstName: String, lastName: String) {
        // get reference to FragmentOne object (created in xml)
        val fragmentOne: FragmentOne = supportFragmentManager.findFragmentById(R.id.fragmentmain) as FragmentOne
        fragmentOne.showDetailsFragmentOne(firstName, lastName)
    }

    override fun onDestroy() {
        super.onDestroy()
    }
}
