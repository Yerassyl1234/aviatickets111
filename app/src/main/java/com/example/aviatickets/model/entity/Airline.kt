package com.example.aviatickets.model.entity

import com.google.gson.annotations.SerializedName

data class Airline(
    @SerializedName("name")
    val name: String,

    val code: String
)