package com.hamcoding.dreamcatcher.data.source

import androidx.room.Database
import com.hamcoding.dreamcatcher.domain.model.BucketItem

@Database(
    entities = [BucketItem::class],
    version = 1
)
abstract class BucketDatabase {

    abstract val bucketDao: BucketDao
}