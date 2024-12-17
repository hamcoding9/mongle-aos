package com.hamcoding.dreamcatcher.data.repository

import com.hamcoding.dreamcatcher.data.source.BucketDao
import com.hamcoding.dreamcatcher.domain.model.BucketItem
import com.hamcoding.dreamcatcher.domain.repository.BucketRepository
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