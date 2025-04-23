package com.hamcoding.mongle.data.source

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.hamcoding.mongle.domain.model.Bucket
import kotlinx.coroutines.flow.Flow

@Dao
interface BucketDao {

    @Query("SELECT * FROM bucket")
    fun getBuckets(): Flow<List<Bucket>>

    @Query("SELECT * FROM bucket WHERE id = :id")
    suspend fun getBucketById(id: Int): Bucket?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertBucket(item: Bucket)

    @Delete
    suspend fun deleteBucket(item: Bucket)
}