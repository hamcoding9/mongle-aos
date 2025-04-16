package com.hamcoding.mongle.domain.repository

import com.hamcoding.mongle.domain.model.BucketItem
import kotlinx.coroutines.flow.Flow

interface BucketRepository {

    fun getBuckets(): Flow<List<BucketItem>>

    suspend fun getBucketById(id: Int): BucketItem?

    suspend fun insertBucket(item: BucketItem)

    suspend fun deleteBucket(item: BucketItem)
}