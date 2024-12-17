package com.hamcoding.dreamcatcher.domain.use_case

import com.hamcoding.dreamcatcher.domain.model.BucketItem
import com.hamcoding.dreamcatcher.domain.repository.BucketRepository
import kotlinx.coroutines.flow.Flow

// This Use Case improves readability by encapsulating the logic for getting bucket data.
class GetBucketsUseCase(
    private val repository: BucketRepository
) {

    operator fun invoke(): Flow<List<BucketItem>> {
        return repository.getBuckets()
    }
}