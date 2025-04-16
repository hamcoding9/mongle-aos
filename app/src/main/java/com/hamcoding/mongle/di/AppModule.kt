package com.hamcoding.mongle.di

import android.app.Application
import androidx.room.Room
import com.hamcoding.mongle.data.repository.BucketRepositoryImpl
import com.hamcoding.mongle.data.source.BucketDatabase
import com.hamcoding.mongle.domain.repository.BucketRepository
import com.hamcoding.mongle.domain.use_case.BucketUseCases
import com.hamcoding.mongle.domain.use_case.DeleteBucketUseCase
import com.hamcoding.mongle.domain.use_case.GetBucketsUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideBucketDatabase(app: Application): BucketDatabase {
        return Room.databaseBuilder(
            app,
            BucketDatabase::class.java,
            BucketDatabase.DATABASE_NAME
        ).build()
    }

    @Provides
    @Singleton
    fun provideBucketRepository(db: BucketDatabase): BucketRepository {
        return BucketRepositoryImpl(db.bucketDao)
    }

    @Provides
    @Singleton
    fun provideBucketUseCases(repository: BucketRepository): BucketUseCases {
        return BucketUseCases(
            getBuckets = GetBucketsUseCase(repository),
            deleteBucket = DeleteBucketUseCase(repository)
        )
    }
}