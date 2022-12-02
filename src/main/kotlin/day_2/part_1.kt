package day_2

fun main() {
    var result = 0
    val winConditions = mapOf(
        "A" to "Z",
        "B" to "X",
        "C" to "Y"
    )

    val drawConditions = mapOf(
        "A" to "X",
        "B" to "Y",
        "C" to "Z"
    )

    val points = mapOf(
        "X" to 1,
        "Y" to 2,
        "Z" to 3
    )

    getInputDataFromFile("src/main/kotlin/day_2/input.txt").forEach {
        result += points[it.second]!!
        when (it.second) {
            winConditions[it.first] -> {}
            drawConditions[it.first] -> result += 3
            else -> result += 6
        }
    }

    println(result)
}