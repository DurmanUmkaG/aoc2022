package day_1

import java.io.File

fun getDataFromFile(filePath: String) =
    File(filePath)
        .readText()
        .split("\n\n").map {
            it.split("\n")
                .map { value -> value.toInt() }
        }

fun main() {
    println(getDataFromFile("src/main/kotlin/day_1/input.txt").maxOf { it.sum() })
}