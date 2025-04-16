package com.hamcoding.mongle.data.repository

import com.hamcoding.mongle.data.source.BucketDao
import com.hamcoding.mongle.domain.model.BucketItem
import com.hamcoding.mongle.domain.repository.BucketRepository
import kotlinx.coroutines.flow.Flow

class BucketRepositoryImpl(
    private val dao: BucketDao
): BucketRepository {

    override fun getBuckets(): Flow<List<BucketItem>> {
        return dao.getBuckets()
    }

    override suspend fun getBucketById(id: Int): BucketItem? {
        return dao.getBucketById(id)
    }

    override suspend fun insertBucket(item: BucketItem) {
        dao.insertBucket(item)
    }

    override suspend fun deleteBucket(item: BucketItem) {
        dao.deleteBucket(item)
    }
}