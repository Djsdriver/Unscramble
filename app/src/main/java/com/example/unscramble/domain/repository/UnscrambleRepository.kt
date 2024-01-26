package com.example.unscramble.domain.repository

interface UnscrambleRepository {

    fun pickRandomWordAndShuffle(usedWords: MutableSet<String>, currentWord: String): String


}