package com.brainerx.userslis

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.row_user.view.*

class UserViewHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    val username : TextView = itemView.username
    val email : TextView = itemView.email
    val speciality : TextView = itemView.speciality
    val profilePic : ImageView= itemView.profile_pic
}