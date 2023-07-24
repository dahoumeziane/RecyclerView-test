package com.brainerx.userslis

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val users : ArrayList<UserModel> = ArrayList()
        users.add(UserModel("Louiza amel","louiza@gmail.com","Teacher","https://pub-static.fotor.com/assets/projects/pages/d5bdd0513a0740a8a38752dbc32586d0/fotor-03d1a91a0cec4542927f53c87e0599f6.jpg"))
        users.add(UserModel("Iyed hamlaoui","iyed_hamlaoui@esi.dz","CS student","https://media.istockphoto.com/id/1322275410/photo/profile-of-young-man.jpg?s=612x612&w=0&k=20&c=Ssbvdy81Z-SZfPvUyxS3sixqpdYIlB7bNQprGaSRSDc="))
        users.add(UserModel("Islam rezzak","rezzak_islam@gmail.com","CS student","https://1fid.com/wp-content/uploads/2022/06/Twitter-profile-picture-4-1024x1024.jpg"))
        users.add(UserModel("Ilyes moussaoui","ilyesmoussaoui@gmail.com","CS student","https://wallpapers.com/images/hd/cool-profile-picture-2we7xmn0737hqgtu.jpg"))
        users.add(UserModel("Loubna boussoura","boussoura_loubna@gmail.com","CS student","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQYo4LV9phBXxDaxw-dXt_lwkwDuSEQI7gEgCjDxYg8c9Aqt-yy9nn4qTupRJkX1nJa_5Y&usqp=CAU"))
        users.add(UserModel("Ikram Lyna","ikram_lyna@gmail.com","Polytech student","https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcT3WEmfJCME77ZGymWrlJkXRv5bWg9QQmQEzw&usqp=CAU"))

        val adapter = UserAdapter(this,users)
        val e = 0
        val manager = LinearLayoutManager(this)
        users_list.adapter = adapter
        users_list.layoutManager = manager

    }
    fun add (a:Int,b:Int):Int{
        return a+b
    }
}