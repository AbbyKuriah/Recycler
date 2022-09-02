package com.example.kotlinrecyclerview_001

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         //drag and drop recycler to bind this view
        var recycler: RecyclerView = findViewById(R.id.recycUser)

        val u1 = User("John", "Businessman")
        val u2 = User("Kandi", "Actor")
        val u3 = User("Greg", "Car Dealer")
        val u4 = User("Shabai", "Junk Dealer")
        val u5 = User("Shazak", "Mobutu")
        val u6 = User("Mulwa", "Butchery Guy")

        //array data
        val  usersList = ArrayList<User>()
        usersList.add(u1)
        usersList.add(u2)
        usersList.add(u3)
        usersList.add(u4)
        usersList.add(u5)
        usersList.add(u6)

        var adapter = CustomAdapter(usersList)
        recycler.layoutManager = LinearLayoutManager(this)
        recycler.adapter = adapter
    }
}