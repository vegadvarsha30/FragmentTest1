package com.example.fragmenttest1


import android.content.Context
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import android.widget.Toast
import androidx.fragment.app.Fragment


class FragmentOne : Fragment() {
    val TAG = "ActivityLifeCycle"

    lateinit var firstName: TextView
    lateinit var lastName: TextView

    override fun onAttach(context: Context) {
        super.onAttach(context)
        Log.d(TAG, "===>fragment===>onAttach()")
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d(TAG, "===>fragment===>onCreate()")
    }


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Log.d(TAG, "===>fragment===>onCreateView()")
        // Inflate the layout for this fragment

        val root = inflater.inflate(R.layout.fragment_one, container, false) as ViewGroup

        firstName = root.findViewById(R.id.textViewFirstName)
        lastName = root.findViewById(R.id.textViewLastName)

        return root
    }

    fun showDetailsFragmentOne(firstName: String, lastName: String) {
        this.firstName.text = firstName
        this.lastName.text = lastName
    }


     override fun onActivityCreated(savedInstanceState: Bundle?) {
         super.onActivityCreated(savedInstanceState)
         Log.d(TAG, "===>fragment===>onActivityCreated()")
     }

    override fun onStart() {
        super.onStart()
        Log.d(TAG, "===>fragment===>onStart()")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "===>fragment===>onStart()")
    }

    override fun onPause() {
        super.onPause()
        Log.d(TAG, "===>fragment===>onStart()")

    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "===>fragment===>onStop()")
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d(TAG, "===>fragment===>onDestroyView()")
    }

    override fun onDestroy() {
        super.onDestroy()

        Log.d(TAG, "===>fragment===>onDestroy()")

    }

    override fun onDetach() {
        super.onDetach()
        Log.d(TAG, "===>fragment===>onDetach()")
    }


}