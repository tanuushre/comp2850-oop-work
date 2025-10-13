// With a return Statement

fun anagrams(first: String, second: String): Boolean {
    if (first.length != second.length) {
        return false
    }
    val firstChars = first.lowercase().toList().sorted()
    val secondChars = second.lowercase().toList().sorted()
    return firstChars == secondChars
}

fun main() {
    val str1 = "Hello"
    val str2 = "Olleh"
    println(anagrams(str1, str2))
}