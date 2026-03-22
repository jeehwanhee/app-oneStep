package com.jeepark.onestep.data.model

data class Quest(
    val questName: String,
    val questLevel: Int,
    val questEXP: Int,
    val confirmQuestion: String,
)

data class PrevQuest(
    val questName: String,
    val questLevel: Int,
    val questEXP: Int,
    val confirmQuestion: String,
    val confirmAnswer: String,
    val doneDate: String, // 2026.03.22
)
