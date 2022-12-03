package day_3

import java.io.File

fun getInputDataFromFile2(filePath: String) =
    File(filePath).readLines().map { it.toSet() }.chunked(3)

fun main() {
    var result = 0

    val priorities = buildMap {
        for (i in 0 until 52)
            if (i < 26) put('a' + i, i + 1)
            else put('A' + i - 26, i + 1)
    }

    getInputDataFromFile2("src/main/kotlin/day_3/input.txt").forEach {
        it[0].intersect(it[1]).intersect(it[2]).forEach { letter ->
            result += priorities[letter]!!
        }
    }

    println(result)
}