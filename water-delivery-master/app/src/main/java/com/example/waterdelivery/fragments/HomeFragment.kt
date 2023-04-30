package com.example.waterdelivery.fragments

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment
import androidx.navigation.Navigation
import com.example.waterdelivery.R

class HomeFragment : Fragment(R.layout.fragment_home) {

    private lateinit var nameEditText : EditText
    private lateinit var sendButton : Button

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        nameEditText = view.findViewById<EditText?>(R.id.homeNameEditText)
        sendButton = view.findViewById(R.id.homeSendButton)

        val controller = Navigation.findNavController(view)

        sendButton.setOnClickListener {
            val name = nameEditText.text.toString()

            val action = HomeFragmentDirections.actionHomeFragmentToNotificationsFragment(name)

            controller.navigate(action)
        }


    }


}