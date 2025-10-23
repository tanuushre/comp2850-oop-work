// Task 13.3

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.assertions.withClue
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.shouldBe

@Suppress("unused")
class MoneyTest : StringSpec({
    "Can create a Money" {
        val m = Money(1,50)
        withClue("dollars") { m.dollars shouldBe 1 }
        withClue ("cents") { m.cents shouldBe 50 }
    }

    "Can create a different Money" {
        val m = Money(2, 99)
        withClue("dollars") { m.dollars shouldBe 2 }
        withClue("cents") { m.cents shouldBe 99 }
    }

    "$1.50 + $1.00 is $2.50" {
        Money(1, 50) + Money(1,0) shouldBe Money(2, 50)
    }

    "$1.50 + $2.00 is $3.50" {
        Money(1, 50) + Money(2, 0) shouldBe Money(3, 50)
    }
})
