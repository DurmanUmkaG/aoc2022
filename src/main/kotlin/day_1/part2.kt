package day_1

fun main() {
    println(
        getDataFromFile("src/main/kotlin/day_1/input.txt")
            .sortedByDescending { it.sum() }
            .take(3)
            .flatten()
            .sum()
    )
}