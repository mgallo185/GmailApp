package com.example.gmailapp

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
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
        val dateView: TextView
        val trollView: ImageView
        init {
            // TODO: Store each of the layout's views into
            // the public final member variables created above
            senderView= itemView.findViewById(R.id.sender)
            titleView= itemView.findViewById(R.id.emailTitle)
            summaryView= itemView.findViewById(R.id.emailsum)
            dateView= itemView.findViewById(R.id.date)
            trollView= itemView.findViewById(R.id.troll)
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        // Inflate the custom layout
        val contactView = inflater.inflate(R.layout.email_item, parent, false)
        // Return a new holder instance
        return ViewHolder(contactView)
    }

    override fun getItemCount(): Int {
        return emails.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        // Get the data model based on position
        val email = emails.get(position)
        // Set item views based on views and data model
        holder.senderView.text = email.sender
        holder.titleView.text = email.title
        holder.summaryView.text = email.summary
        holder.dateView.text= email.date

    }

}