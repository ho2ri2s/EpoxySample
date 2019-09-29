package com.example.epoxysample.model.epoxy

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.*
import com.example.epoxysample.R
import com.example.epoxysample.helper.KotlinHolder
import com.example.epoxysample.model.Food

@EpoxyModelClass(layout = R.layout.singlefood_layout)
abstract class SingleFoodModel (@EpoxyAttribute var food: Food) : EpoxyModelWithHolder<SingleFoodModel.FoodHolder>(){

    override fun bind(holder: FoodHolder) {
        holder.imageView.setImageResource(food.image)
        holder.titleView.text = food.title
    }

    /**
     * This is ViewHolder class equivalent to Google's RecyclerView.ViewHolder class
     */
    inner class FoodHolder : KotlinHolder(){

        val imageView by bind<ImageView>(R.id.image)
        val titleView by bind<TextView>(R.id.title)
        val descView by bind<TextView>(R.id.desc)

    }

}
