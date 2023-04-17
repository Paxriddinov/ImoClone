package com.example.imo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.imo.R
import com.example.imo.model.Chats
import com.google.android.material.imageview.ShapeableImageView

class ChatAdapter(private var list: ArrayList<Chats>): RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.chats_item, parent, false)
        return ChatViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val chats:Chats = list[position]
        if (holder is ChatViewHolder){
            holder.profileImage.setImageResource(chats.profileImage)
            holder.fullName.text = chats.fullName
            holder.count.text = chats.count.toString()

            if (chats.count > 0){
                holder.linearLayout.visibility = View.VISIBLE
            }else{
                holder.linearLayout.visibility = View.GONE
            }
        }
    }


    inner class ChatViewHolder(view: View):RecyclerView.ViewHolder(view){
        val profileImage:ShapeableImageView = view.findViewById(R.id.profileImage_id)
        val fullName:TextView = view.findViewById(R.id.fullName_id)
        val count:TextView = view.findViewById(R.id.number_id)
        val linearLayout:LinearLayout = view.findViewById(R.id.linearLayout_id)
    }
}