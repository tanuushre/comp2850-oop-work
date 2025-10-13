// Task 5.3.1: modification of task 5.1.2

import kotlin.random.Random

fun rollDie(sides: Int): Int {
    return Random.nextInt(1, sides + 1)
}


fun main() {
    val sides = readInt("Enter the number of sides on the die: ")
    val result = rollDie(sides)
    println("You rolled a" + result + "!")
}

fun readInt(prompt: String): Int {
    print(prompt)
    val input = readln()
    val number = input.toInt()
    return number
}