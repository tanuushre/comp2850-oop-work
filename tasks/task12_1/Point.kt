class Point(x: Double, y: Double) {
    var x = x     // Changed val to var since "p.x" was added
    var y = y
}

fun main() {
    val p = Point()
    p.x = 4.5
    p.y = 7.0       // changes the value of when it is printed.

    println(p.x) //prints 0.0
    println(p.y) //prints 0.0
}