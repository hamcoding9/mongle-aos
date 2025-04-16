package com.hamcoding.mongle.domain.use_case

import com.hamcoding.mongle.domain.model.BucketItem
import com.hamcoding.mongle.domain.repository.BucketRepository

class DeleteBucketUseCase(
    private val repository: BucketRepository
) {

    suspend operator fun invoke(item: BucketItem) {
        repository.deleteBucket(item)
    }
}