package com.example.epoxysample.viewmodel

import com.airbnb.epoxy.EpoxyController
import com.example.epoxysample.model.Food
import com.example.epoxysample.model.FoodDataFactory
import com.example.epoxysample.model.epoxy.SingleFoodModel_

class SingleFoodController : EpoxyController(){

    private val foodItems : List<Food> = FoodDataFactory.getFoodItems(50)

    private var index = 0L

    override fun buildModels() = foodItems.forEach{
        SingleFoodModel_(it)
            .id(index++)
            .addTo(this)
    }

}