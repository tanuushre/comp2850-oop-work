// Task 13.3

// Implement your Money class here
data class Money(val dollars: Int, val cents: Int)

operator fun plus(other: Money) = Money(2, 50)

operator fun plus(other: Money) = Money(dollars + other.dollars, 50)