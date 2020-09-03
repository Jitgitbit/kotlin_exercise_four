package com.example.phoenixkotlintodowoo

import android.view.View
import androidx.recyclerview.widget.RecyclerView

class ToDoAdapter(val todos: List<String>): RecyclerView.Adapter {

    class ToDoHolder(v: View): RecyclerView.ViewHolder(v), View.OnClickListener {

        var view: View = v
        var title: String = ""

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View?) {
            TODO("Not yet implemented")
        }
    }
}