package com.hamcoding.dreamcatcher.domain.use_case

import com.hamcoding.dreamcatcher.domain.model.BucketItem
import com.hamcoding.dreamcatcher.domain.repository.BucketRepository

class DeleteBucketUseCase(
    private val repository: BucketRepository
) {

    suspend operator fun invoke(item: BucketItem) {
        repository.deleteBucket(item)
    }
}