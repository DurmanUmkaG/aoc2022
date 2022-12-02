package day_2

fun main() {
    var result = 0
    val winPoints = mapOf(
        "A" to 2,
        "B" to 3,
        "C" to 1
    )

    val drawPoint = mapOf(
        "A" to 1,
        "B" to 2,
        "C" to 3
    )

    val losePoints = mapOf(
        "A" to 3,
        "B" to 1,
        "C" to 2
    )

    getInputDataFromFile("src/main/kotlin/day_2/input.txt").forEach {
        when (it.second) {
            "X" -> result += losePoints[it.first]!!
            "Y" -> result += 3 + drawPoint[it.first]!!
            "Z" -> result += 6 + winPoints[it.first]!!
        }
    }

    println(result)
}