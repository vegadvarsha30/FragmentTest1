package com.example.fragmenttest1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText

class FragmentSecond : Fragment() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    lateinit var firstNameEditText: EditText
    lateinit var lastNameEditText: EditText
    lateinit var activity: MainActivity

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        val view = inflater.inflate(R.layout.fragment_second, container, false)
        val showDetailButton = view.findViewById<Button>(R.id.showDetailsButton)
        firstNameEditText = view.findViewById(R.id.editTextFirstName)
        lastNameEditText = view.findViewById(R.id.editTextLastName)

        showDetailButton.setOnClickListener {
            activity.showDetailsActivity(firstNameEditText.text.toString(), lastNameEditText.text.toString())
        }



        return view
    }

    override fun onDestroy() {
        activity.finish()
        super.onDestroy()
    }
}