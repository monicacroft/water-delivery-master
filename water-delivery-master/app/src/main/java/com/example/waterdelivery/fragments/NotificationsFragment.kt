package com.example.waterdelivery.fragments

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.fragment.app.findFragment
import com.example.waterdelivery.R

class NotificationsFragment : Fragment(R.layout.fragment_notification) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        view.findViewById<TextView>(R.id.nameTextView).text =
            NotificationsFragmentArgs.fromBundle(requireArguments()).name


    }
}