package com.example.todoplanner

import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.RecyclerView
import java.text.FieldPosition

class TodoViewHolder(val view: View) : RecyclerView.ViewHolder(view) {

    private var TAG = "TodoView Holder"

    lateinit var todo: ToDo



    fun bind( todo: ToDo){
        view.findViewById<TextView>(R.id.text_title).text = todo.title
        Log.i(TAG, todo.title)
        view.findViewById<TextView>(R.id.text_description).text = todo.description
        view.findViewById<TextView>(R.id.text_date).text = todo.date
        view.findViewById<ImageView>(R.id.btn_delete).setOnClickListener{

        }
    }


}