package com.example.recylcview.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.recylcview.R
import com.example.recylcview.view.adapter.adapter
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var recyclerViewAdapter:adapter? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val layoutManager:RecyclerView.LayoutManager = LinearLayoutManager(this)
        recyleView.layoutManager = layoutManager
        loadData()
    }

    fun loadData(){
        recyclerViewAdapter = adapter()
        recyleView.adapter = recyclerViewAdapter
    }
}