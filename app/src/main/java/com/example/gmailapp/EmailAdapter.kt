package com.example.gmailapp

import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class EmailAdapter(private val emails: List<Email>) :  RecyclerView.Adapter<EmailAdapter.ViewHolder>() {
    // Provide a direct reference to each of the views within a data item
    // Used to cache the views within the item layout for fast access
    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        // TODO: Create member variables for any view that will be set
        // as you render a row.

        // We also create a constructor that accepts the entire item row
        // and does the view lookups to find each sub-view
        val senderView:TextView
        val titleView:TextView
        val summaryView:TextView
        init {
            // TODO: Store each of the layout's views into
            // the public final member variables created above
            senderView= itemView.findViewById(R.id.sender)
            titleView= itemView.findViewById(R.id.emailTitle)
            summaryView= itemView.findViewById(R.id.emailsum)

        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}