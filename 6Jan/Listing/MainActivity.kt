package com.example.rawan.listing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import  android.support.v7.widget.RecyclerView
import android.widget.ListAdapter


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list = findViewById<RecyclerView>(R.id.list)
        val names = mutableListOf<String>()
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        names.add("Rawan")
        list.layoutManager = LinearLayoutManager(applicationContext, LinearLayoutManager.VERTICAL, false)
        list.adapter = ListingAdapter(names)

    }
}
