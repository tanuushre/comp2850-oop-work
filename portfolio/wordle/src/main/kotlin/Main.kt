fun main() {
    val words = readWordList("data/words.txt")
    val target = pickRandomWord(words)
    val maxAttempts = 10

    println("Welcome to Wordle!")
    println("Start typing to guess the word.")

    for (attempt in 1..maxAttempts) {
        val guess = obtainGuess(attempt)
        val matches = evaluateGuess(guess, target)
        displayGuess(guess, matches)

        if (guess == target) {
            println("That's correct! You guessed the word in $attempt attempt(s).")
            return
        }
    }

    println("Oops! You are out of guesses. The word was '$target'.")
}
