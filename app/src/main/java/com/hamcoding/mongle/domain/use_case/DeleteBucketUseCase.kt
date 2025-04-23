package com.hamcoding.mongle.domain.use_case

import com.hamcoding.mongle.domain.model.Bucket
import com.hamcoding.mongle.domain.repository.BucketRepository

class DeleteBucketUseCase(
    private val repository: BucketRepository
) {

    suspend operator fun invoke(item: Bucket) {
        repository.deleteBucket(item)
    }
}