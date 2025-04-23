package com.hamcoding.mongle.data.source

import androidx.room.Database
import androidx.room.RoomDatabase
import com.hamcoding.mongle.domain.model.Bucket

@Database(
    entities = [Bucket::class],
    version = 1
)
abstract class BucketDatabase : RoomDatabase() {

    abstract val bucketDao: BucketDao

    companion object {
        const val DATABASE_NAME = "buckets_db"
    }
}