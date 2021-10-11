package com.example.domain.models

data class Activity(
    val accessibility: Int,
    val activity: String,
    val key: String,
    val link: String,
    val participants: Int,
    val price: Int,
    val type: String
)