package day_4

import java.io.File

fun getInputData1(filePath: String) =
    File(filePath)
        .readLines()
        .map {
            val temp = it.split(",")
            (temp.first().split("-").first().toInt() to temp.first().split("-").last().toInt()) to (temp.last()
                .split("-").first().toInt() to temp.last().split("-").last().toInt())
        }

fun main() {
    var result = 0
    getInputData1("src/main/kotlin/day_4/input.txt").forEach {
        if ((it.first.first >= it.second.first && it.first.second <= it.second.second) || (it.second.first >= it.first.first && it.second.second <= it.first.second)) {
            result++
        }
    }

    println(result)
}