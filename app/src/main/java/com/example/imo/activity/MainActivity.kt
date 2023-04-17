package com.example.imo.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.imo.R
import com.example.imo.adapter.ChatAdapter
import com.example.imo.model.Chats

class MainActivity : AppCompatActivity() {
    lateinit var openContact:TextView
    private lateinit var recyclerView: RecyclerView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        /*openContact()*/
        initViews()
    }

   /* private fun openContact(){
        openContact = findViewById(R.id.fullName_id)
        openContact.setOnClickListener {
            val intent = Intent(this@MainActivity, ContactList::class.java)
            startActivity(intent)
        }
    }*/

    private fun initViews() {
        recyclerView = findViewById(R.id.recycleView_id)
        recyclerView.layoutManager = GridLayoutManager(this, 1)

        refreshAdapter(data())
    }

    private fun data():ArrayList<Chats> {
        val list = ArrayList<Chats>()
        list.add(Chats(R.drawable.character, "Emperor of the Sea", 9))
        list.add(Chats(R.drawable.character, "Monkey D. Luffy", 0))
        list.add(Chats(R.drawable.character, "Emperor of the Sea", 89))
        list.add(Chats(R.drawable.character, "Monkey D. Luffy", 10))
        list.add(Chats(R.drawable.character, "Emperor of the Sea", 0))
        list.add(Chats(R.drawable.character, "Monkey D. Luffy", 3))
        list.add(Chats(R.drawable.character, "Emperor of the Sea", 9))
        list.add(Chats(R.drawable.character, "Monkey D. Luffy", 0))
        list.add(Chats(R.drawable.character, "Emperor of the Sea", 89))
        list.add(Chats(R.drawable.character, "Monkey D. Luffy", 10))
        list.add(Chats(R.drawable.character, "Emperor of the Sea", 0))
        list.add(Chats(R.drawable.character, "Monkey D. Luffy", 3))
        list.add(Chats(R.drawable.character, "Emperor of the Sea", 9))
        list.add(Chats(R.drawable.character, "Monkey D. Luffy", 0))
        list.add(Chats(R.drawable.character, "Emperor of the Sea", 89))
        list.add(Chats(R.drawable.character, "Monkey D. Luffy", 10))
        list.add(Chats(R.drawable.character, "Emperor of the Sea", 0))
        list.add(Chats(R.drawable.character, "Monkey D. Luffy", 3))

        return list

    }

    private fun refreshAdapter(data:ArrayList<Chats>){
        val adapter = ChatAdapter(data)
        recyclerView.adapter = adapter
    }
}