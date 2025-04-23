package com.hamcoding.mongle.domain.repository

import com.hamcoding.mongle.domain.model.Bucket
import kotlinx.coroutines.flow.Flow

interface BucketRepository {

    fun getBuckets(): Flow<List<Bucket>>

    suspend fun getBucketById(id: Int): Bucket?

    suspend fun insertBucket(item: Bucket)

    suspend fun deleteBucket(item: Bucket)
}