package com.mierez.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.exercise_log_layout.*

class ExerciseLogFragment : Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.exercise_log_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val adapter = ExerciseAdapter {

        }
        exercise_list.layoutManager = LinearLayoutManager(context)
        exercise_list.addItemDecoration(DividerItemDecoration(context, DividerItemDecoration.VERTICAL))
        exercise_list.adapter = adapter

        val data = exerciseDatabase().exerciseDao().getAll()
        data.observe(this, Observer {
            if (it != null) {
                adapter.submitList(it)
            }
        })
    }
}