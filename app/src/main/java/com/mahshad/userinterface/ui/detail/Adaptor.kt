package com.mahshad.userinterface.ui.detail

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.mahshad.userinterface.R
import com.mahshad.userinterface.data.ToDoList

class Adaptor(val list: List<ToDoList>) : RecyclerView.Adapter<ViewHolder>() {
    //it is called only when a new ViewHolder is required.
    //If there are already enough ViewHolders in the recycling pool, RecyclerView reuses them instead of creating new ones.
    //It typically gets called a few times initially, to fill the visible portion of the screen, and later when you scroll, if more items need to be displayed.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item, parent, false)
        //When you inflate an XML layout, you get a single View object that represents the root of the layout.
        //findViewById(R.id.someViewId) searches inside the root view for a child view with the given ID and returns it as a View object.
        return ViewHolder(view)
    }

    override fun getItemCount() = list.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.title.text = list[position].title
        holder.subject.text = list[position].subject
    }
}

//itemView is the item xml file which has been bound.
class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    val title = itemView.findViewById<TextView>(R.id.name)
    val subject = itemView.findViewById<TextView>(R.id.subjectName)
}

