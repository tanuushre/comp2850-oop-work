// Without a return Statement

import kotlin.random.Random

fun rollDie(sides: Int) {
    if (sides in setOf(4, 6, 8, 10, 12, 20)) {
        println("Rolling dice...")
        val result = Random.nextInt(1, sides + 1)
        println("You rolled $result")
    }
    else {
        println("Error: cannot have a sides-sided dice")
    }
}

fun main() {
    rollDie(8)
    rollDie(20)
    rollDie(5)
}