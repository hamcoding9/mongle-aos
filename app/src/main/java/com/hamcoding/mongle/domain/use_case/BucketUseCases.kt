package com.hamcoding.mongle.domain.use_case

data class BucketUseCases(
    val getBuckets: GetBucketsUseCase,
    val deleteBucket: DeleteBucketUseCase
)