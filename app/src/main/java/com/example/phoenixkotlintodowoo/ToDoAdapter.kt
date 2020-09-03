package com.example.phoenixkotlintodowoo

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.todo_row.view.*

class ToDoAdapter(val todos: List<String>): RecyclerView.Adapter<ToDoAdapter.ToDoHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ToDoHolder {
        return ToDoHolder(LayoutInflater.from(parent.context).inflate(R.layout.todo_row, parent, false))
    }

    override fun onBindViewHolder(holder: ToDoHolder, position: Int) {
        val title = todos[position]
        holder.bindToDo(title)
    }

    override fun getItemCount(): Int {
        return todos.count()
    }

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