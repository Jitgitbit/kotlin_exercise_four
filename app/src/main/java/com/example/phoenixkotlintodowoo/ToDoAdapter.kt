package com.example.phoenixkotlintodowoo

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.todo_row.view.*

class ToDoAdapter(val todos: List<String>): RecyclerView.Adapter<ToDoAdapter.ToDoHolder>() {

    class ToDoHolder(v: View): RecyclerView.ViewHolder(v), View.OnClickListener {

        var view: View = v
        var title: String = ""

        init {
            v.setOnClickListener(this)
        }

        fun bindToDo(title: String){
            this.title = title
            view.textView.text = title
        }

        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }
    }
}