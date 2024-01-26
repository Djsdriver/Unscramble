package com.example.unscramble.di

import com.example.unscramble.domain.repository.UnscrambleRepository
import com.example.unscramble.domain.usecase.PickRandomWordAndShuffleUseCase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
class DomainModule {

    @Provides
    fun providePickRandomWordAndShuffle(unscrambleRepository: UnscrambleRepository): PickRandomWordAndShuffleUseCase{
        return PickRandomWordAndShuffleUseCase(unscrambleRepository = unscrambleRepository)
    }


}