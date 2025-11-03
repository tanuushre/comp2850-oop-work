// Implement the six required functions here

import java.io.File

fun isValid(word: String): Boolean {
    return word.length == 5 && word.all { it.isLetter() }
} 

fun readWordList(filename: String): MutableList<String> = File(filename)
    .readLines()
    .map { it.trim().lowercase() }
    .filter { isValid(it) }
    .toMutableList()

fun pickRandomWord(words: MutableList<String>): String {
    val word = words.random()
    words.remove(word)
    return word
}

fun obtainGuess(attempt: Int): String {
    while (true) {
        print("Attempt $attempt: ")
        val guess = readln().trim().lowercase()

        if (isValid(guess)) {
            return guess
        } else {
            println("Invalid guess. Please enter a 5-letter word.")
        }
    }
}

fun evaluateGuess(guess: String, target: String): List<Int> = guess.mapIndexed { i, c ->
    if (c == target[i]) 1 else 0
}

fun displayGuess(guess: String, matches: List<Int>) {
    for (i in guess.indices) {
        if (matches[i] == 1) {
            print(guess[i])
        } else {
            print("?")
        }
    }
    println()
}
