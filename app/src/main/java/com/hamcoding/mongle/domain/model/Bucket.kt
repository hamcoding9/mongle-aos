package com.hamcoding.mongle.domain.model

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Bucket(
    @PrimaryKey val id: Int? = null,
    val timestamp: Long? = null,
    val content: String,
    val isAchieved: Boolean = false,
    val image: String? = null,
    val achievedDate: String? = null
)