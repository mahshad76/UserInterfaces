package com.mahshad.userinterface.ui.detail

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mahshad.userinterface.R
import com.mahshad.userinterface.data.ToDoList

class Adaptor(val list: List<ToDoList>) : RecyclerView.Adapter<ViewHolder>() {
    //it is called only when a new ViewHolder is required.
    //If there are already enough ViewHolders in the recycling pool, RecyclerView reuses them instead of creating new ones.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}

//itemView is the item xml file which has been bound.
class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    init {
        val title = itemView.findViewById<TextView>(R.id.name)
        val subject = itemView.findViewById<TextView>(R.id.subjectName)
    }

}