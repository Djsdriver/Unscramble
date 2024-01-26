package com.example.unscramble.data.repository

import com.example.unscramble.data.allWords
import com.example.unscramble.domain.repository.UnscrambleRepository

class UnscrambleRepositoryImpl : UnscrambleRepository {
    override fun pickRandomWordAndShuffle(usedWords: MutableSet<String>, currentWord: String): String {
        var newWord = currentWord

        while (usedWords.contains(newWord)) {
            newWord = allWords.random()
        }
        usedWords.add(newWord)
        return shuffleCurrentWord(newWord)
    }
}


private fun shuffleCurrentWord(word: String): String {
    val tempWord = word.toCharArray()
    // Scramble the word
    tempWord.shuffle()
    while (String(tempWord).equals(word)) {
        tempWord.shuffle()
    }
    return String(tempWord)
}