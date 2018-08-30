package com.mierez.navigation

import android.content.Context
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import kotlinx.android.synthetic.main.update_your_info_layout.*

class EnterInfoFragment : Fragment() {

    val sharedPreferences by lazy {
        requireActivity().getSharedPreferences("default", Context.MODE_PRIVATE)
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.update_your_info_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        sharedPreferences.edit()
                .putBoolean("info_entered", true)
                .apply()

        enter_info.setOnClickListener {
            findNavController().popBackStack()
        }
    }
}