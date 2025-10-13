// Task 8.3: functions for temperature analysis
package task8_3

typealias Record = Pair<String,Double>

fun fetchData(): List<Record> {
  // Create and return a simulated dataset here
  // Use the listOf() and to() functions to create the dataset

  return listOf(
    "Station A" to 15.6,
    "Station B" to 22.3,
    "Station C" to 18.9,
    "Station D" to 9.4,
    "Station E" to 25.1
  )
}

// Challenge: compute average temperature with one line of code
// in main(), instead of using the function below!

fun averageTemp(data: List<Record>): Double {
    var sum = 0.0
    for (record in data) {
        sum += record.second
    }
    return sum / data.size
}
