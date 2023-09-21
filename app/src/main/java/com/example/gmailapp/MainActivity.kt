package com.example.gmailapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MainActivity : AppCompatActivity() {
    lateinit var emails: List<Email>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val emailRv = findViewById<RecyclerView>(R.id.emailsRv)

        emails = EmailFetcher.getEmails()
        val adapter = EmailAdapter(emails)

        emailRv.adapter= adapter
        emailRv.layoutManager = LinearLayoutManager(this)

        findViewById<Button>(R.id.loadMore).setOnClickListener {
           val next5emails= EmailFetcher.getNext5Emails()

          (emails as MutableList<Email>).addAll(next5emails)

          adapter.notifyDataSetChanged()



        }


    }
}