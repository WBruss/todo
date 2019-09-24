package com.example.todoplanner

import android.content.Context
import android.util.Log
import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.ListAdapter
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.room.Delete
import com.example.todoplanner.R.id.btn_delete

class TodoAdapter(context: Context) : ListAdapter<ToDo, TodoViewHolder>(MCallBack) {

    private val TAG = "Todo Adapter"

    private val inflater: LayoutInflater = LayoutInflater.from(context)

    lateinit var btn: ToDo

    var deleteCond: Boolean = false

    lateinit var button: ImageView

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TodoViewHolder {
        val holder = TodoViewHolder(inflater.inflate(R.layout.item_todo, parent, false))
        return holder
    }

    override fun onBindViewHolder(holder: TodoViewHolder, position: Int) {
        holder.bind(getItem(position))
        button = holder.btnDelete()
        deleteCond = holder.delete

        Log.i(TAG, getItem(position).title)
    }

    fun deleteButton(): ImageView{
        return button
    }

    fun getTodoToDelete(): ToDo{
        return btn
    }


    fun getDelete(): Boolean{
        return deleteCond
    }

    interface OnTodoClickListener{
        fun onTodoClick(int: Int)
    }
}