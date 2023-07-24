package com.brainerx.userslis

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.squareup.picasso.Picasso

class UserAdapter(
    val context: Context,
    val data : ArrayList<UserModel>
) : RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        return UserViewHolder(
            LayoutInflater.from(context).inflate(R.layout.row_user,parent,false)
        )
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int) {
            holder.username.text = data[position].username
            holder.email.text = data[position].email
            holder.speciality.text = data[position].speciality
            Picasso.get().load(data[position].image).resize(300,300).centerCrop().into(holder.profilePic)
    }

    override fun getItemCount(): Int {
        return data.size
    }
}