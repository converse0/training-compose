package com.example.designcompose.model

data class Exercise(
    val name: String,
    val approach: Int,
    val countPerApproach: Int,
    val weight: Int?,
    val RestBetweenApproach: Int,
)
