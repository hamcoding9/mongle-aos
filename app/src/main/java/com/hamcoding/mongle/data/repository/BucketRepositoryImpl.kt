package com.hamcoding.mongle.data.repository

import com.hamcoding.mongle.data.source.BucketDao
import com.hamcoding.mongle.domain.model.Bucket
import com.hamcoding.mongle.domain.repository.BucketRepository
import kotlinx.coroutines.flow.Flow

class BucketRepositoryImpl(
    private val dao: BucketDao
): BucketRepository {

    override fun getBuckets(): Flow<List<Bucket>> {
        return dao.getBuckets()
    }

    override suspend fun getBucketById(id: Int): Bucket? {
        return dao.getBucketById(id)
    }

    override suspend fun insertBucket(item: Bucket) {
        dao.insertBucket(item)
    }

    override suspend fun deleteBucket(item: Bucket) {
        dao.deleteBucket(item)
    }
}