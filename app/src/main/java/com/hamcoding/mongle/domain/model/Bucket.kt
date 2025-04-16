package com.hamcoding.mongle.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class BucketItem(
    @PrimaryKey val id: Int? = null,
    val timestamp: Long,
    val content: String,
    val isAchieved: Boolean,
    val image: String,
    val achievedDate: String
)