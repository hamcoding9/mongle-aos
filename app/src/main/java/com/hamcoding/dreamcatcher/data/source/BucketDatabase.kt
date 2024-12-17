package com.hamcoding.dreamcatcher.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hamcoding.dreamcatcher.domain.model.BucketItem

@Database(
    entities = [BucketItem::class],
    version = 1
)
abstract class BucketDatabase : RoomDatabase() {

    abstract val bucketDao: BucketDao

    companion object {
        const val DATABASE_NAME = "buckets_db"
    }
}