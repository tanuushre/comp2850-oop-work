// Task 8.3: weather station temperature analysis program
package task8_3


fun main() {
    // Add code here to:
    //   - Fetch data
    val data = fetchData()

    //   - Find records with lowest and and highest temperatures
    val lowest = data.minByOrNull { it.second }
    val highest = data.maxByOrNull { it.second }

    println("Lowest temperature: ${lowest?.first} (${lowest?.second}°C)")
    println("Highest temperature: ${highest?.first} (${highest?.second}°C)")

    //   - Compute average temperature
    val avg = data.map { it.second }.average()
    println("Average temperature: %.2f°C".format(avg))
    //   - Display all of these statistics
}
