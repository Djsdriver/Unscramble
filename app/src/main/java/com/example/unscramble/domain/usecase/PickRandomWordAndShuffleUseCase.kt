package com.example.unscramble.domain.usecase

import com.example.unscramble.domain.repository.UnscrambleRepository

class PickRandomWordAndShuffleUseCase(private val unscrambleRepository: UnscrambleRepository) {


    fun pickRandomWordAndShuffle(usedWords: MutableSet<String>,currentWord: String): String{
        return unscrambleRepository.pickRandomWordAndShuffle(usedWords, currentWord)
    }

}