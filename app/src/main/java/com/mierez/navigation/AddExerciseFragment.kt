package com.mierez.navigation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.mierez.navigation.model.Exercise
import kotlinx.android.synthetic.main.add_exercise_layout.*

class AddExerciseFragment: Fragment() {

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.add_exercise_layout, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        add_exercise.setOnClickListener {
            val exerciseName = name_field.sanitizedText
            val exerciseWeight = weight_field.sanitizedFloat
            val numberOfSets = sets_field.sanitizedInt
            val numberOfReps = repetitions_field.sanitizedInt

            var shouldReturn = false
            if (exerciseName.isEmpty()) {
                name_layout.error = "Something wrong here"
                shouldReturn = true
            }

            if (exerciseWeight < 0) {
                weight_layout.error = "Something wrong here"
                shouldReturn = true
            }

            if (numberOfSets < 0) {
                sets_layout.error = "Something wrong here"
                shouldReturn = true
            }

            if (numberOfReps < 0) {
                repetitions_layout.error = "Something wrong here"
                shouldReturn = true
            }

            if (shouldReturn) {
                return@setOnClickListener
            }

            val exercise = Exercise(
                    name = exerciseName, weight = exerciseWeight,
                    sets = numberOfSets, reps = numberOfReps)

            findNavController().navigateUp()
        }
    }
}