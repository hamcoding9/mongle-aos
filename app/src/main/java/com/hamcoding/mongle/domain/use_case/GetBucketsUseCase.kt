package com.hamcoding.mongle.domain.use_case

import com.hamcoding.mongle.domain.model.BucketItem
import com.hamcoding.mongle.domain.repository.BucketRepository
import kotlinx.coroutines.flow.Flow

// This Use Case improves readability by encapsulating the logic for getting bucket data.
class GetBucketsUseCase(
    private val repository: BucketRepository
) {

    operator fun invoke(): Flow<List<BucketItem>> {
        return repository.getBuckets()
    }
}