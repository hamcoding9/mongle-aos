package com.hamcoding.mongle.data.source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.hamcoding.mongle.domain.model.BucketItem
import kotlinx.coroutines.flow.Flow

@Dao
interface BucketDao {

    @Query("SELECT * FROM bucketitem")
    fun getBuckets(): Flow<List<BucketItem>>

    @Query("SELECT * FROM bucketitem WHERE id = :id")
    suspend fun getBucketById(id: Int): BucketItem?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBucket(item: BucketItem)

    @Delete
    suspend fun deleteBucket(item: BucketItem)
}