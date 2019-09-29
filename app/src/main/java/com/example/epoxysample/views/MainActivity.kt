package com.example.epoxysample.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.DividerItemDecoration
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.epoxysample.R
import com.example.epoxysample.viewmodel.SingleFoodController
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val singleFoodController: SingleFoodController by lazy {
        SingleFoodController()
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initRecycler()
    }

    private fun initRecycler() {
        val linearLayoutManager = LinearLayoutManager(this@MainActivity)
        recycler_view.apply {
            layoutManager = linearLayoutManager
            setHasFixedSize(true)
            adapter = singleFoodController.adapter
            addItemDecoration(
                DividerItemDecoration(
                    this@MainActivity,
                    linearLayoutManager.orientation
                )
            )
        }
        //ここでModelを立ち上げてrecyclerViewに紐づける
        //データに変更があるたびに呼び出す必要がある
        singleFoodController.requestModelBuild()
    }
}
