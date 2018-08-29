package com.mierez.navigation

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import com.mierez.navigation.model.Exercise
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.exercise_log_row_view.view.*

class ExerciseAdapter(private val clickListener: (Exercise) -> Unit) : ListAdapter<Exercise, ViewHolder>(ExerciseDiffCallback()) {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.exercise_log_row_view, parent, false))
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(getItem(position), clickListener)
    }

}

class ViewHolder(override val containerView: View) : RecyclerView.ViewHolder(containerView), LayoutContainer {

    fun bind(exercise: Exercise, clickListener: (Exercise) -> Unit) = with(containerView) {
        exercise_name.text = exercise.name
        weight.text = "${exercise.weight} lbs"
        reps_sets.text = "${exercise.reps} X ${exercise.sets}"
    }
}

class ExerciseDiffCallback : DiffUtil.ItemCallback<Exercise>() {
    override fun areItemsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Exercise, newItem: Exercise): Boolean {
        return oldItem == newItem
    }

}