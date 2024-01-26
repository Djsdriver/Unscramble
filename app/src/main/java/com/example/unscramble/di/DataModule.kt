package com.example.unscramble.di

import com.example.unscramble.data.repository.UnscrambleRepositoryImpl
import com.example.unscramble.domain.repository.UnscrambleRepository
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
class DataModule {

    @Provides
    @Singleton
    fun provideRepository(): UnscrambleRepository{
        return UnscrambleRepositoryImpl()
    }
}