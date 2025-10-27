import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class WordleTest : StringSpec({
    "isValid returns true for 5-letter words" {
        isValid("apple") shouldBe true
    }

    "isValid returns false for words shorter than 5 letters" {
        isValid("dog") shouldBe false
    }

    "isValid returns false for words with non-letters" {
        isValid("he1!o") shouldBe false
    }

    "readWordList reads valid 5-letter words" {
        val tempFile = createTempFile().apply {
            writeText("abode\npersona\ncider\n200497")
        }

        val words = readWordList(tempFile.absolutePath)
        words shouldBe mutableListOf("abode", "cider")
    }

    "pickRandomWord removes and returns a word from list" {
        val words = mutableListOf("abode", "cider", "honey")
        val picked = pickRandomWord(words)

        (listOf("abode", "cider", "honey").contains(picked)) shouldBe true
        words.contains(picked) shouldBe false
    }

    "evaluateGuess marks correct letters only" {
        evaluateGuess("abode", "cider") shouldBe listOf(1, 0, 0, 0, 1)
    }
})
