package day_3

import java.io.File

fun getInputDataFromFile1(filePath: String) =
    File(filePath).readLines().map { Pair(it.substring(0, it.length / 2).toSet(), it.substring(it.length / 2).toSet()) }

fun main() {
    var result = 0

    val priorities = buildMap {
        for (i in 0 until 52)
            if (i < 26) put('a' + i, i + 1)
            else put('A' + i - 26, i + 1)
    }

    getInputDataFromFile1("src/main/kotlin/day_3/input.txt").forEach {
        it.first.intersect(it.second).forEach{ letter ->
            result += priorities[letter]!!
        }
    }

    println(result)
}