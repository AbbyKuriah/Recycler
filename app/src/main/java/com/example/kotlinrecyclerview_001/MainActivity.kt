package com.example.kotlinrecyclerview_001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var recycler: RecyclerView = findViewById(R.id.recycUser)
         //drag and drop recycler to bind this view
        //var recycler: RecyclerView = findViewById(R.id.recycUser)
        val user1 = User("John Paul", "Actor")
        val user2 = User("The Rock", "Action Actor")
        val user3 = User("Kevin Hart", "Comedian Actor")

        //array data
        val usersList = ArrayList<User>()
        usersList.add(user1)
        usersList.add(user2)
        usersList.add(user3)

        var adapter = CustomAdapter(usersList)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter

//        var adapter = CustomAdapter(usersList)
//        recycler.layoutManager = LinearLayoutManager(this)
//        recycler.adapter = adapter
    }
}