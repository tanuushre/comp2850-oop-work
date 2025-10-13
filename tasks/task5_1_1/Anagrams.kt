// Task 5.1.1: anagram checking using a function

fun anagrams(str1: String, str2: String): Boolean {
    // Remove spaces, convert to lowercase, and sort both strings
    val sorted1 = str1.replace(" ", "").lowercase().toCharArray().sorted()
    val sorted2 = str2.replace(" ", "").lowercase().toCharArray().sorted()
    return sorted1 == sorted2
}

fun main() {
    print("Enter the first word: ")
    val word1 = readln()

    println("Enter the second word: ")
    val word2 = readln()

    if (anagrams(word1, word2)) {
        println("The words are anagrams!")
    } else {
        println("The words are not anagrams.")
    }
}