// Task 5.2.1: geometric properties of circles
import kotlin.math.PI

fun circleArea(radius: Double) = PI * radius * radius

fun circlePerimeter(radius: Double) = 2 * PI * radius

fun readDouble(prompt: String): Double {
    print(prompt)
    val input = readln()
    return input?.toDoubleOrNull() ?: 0.0
}

fun main() {
    val radius = readDouble("Enter the radius of the circle: ")
    val area = circleArea(radius)
    val perimeter = circlePerimeter(radius)

    // Display to 4 decimal places
    println("Area: %.4f".format(area))
    println("Perimeter: %.4f".format(perimeter))
}