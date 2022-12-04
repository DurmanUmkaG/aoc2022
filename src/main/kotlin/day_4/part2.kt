package day_4

import java.io.File

fun getInputData2(filePath: String) =
    File(filePath)
        .readLines()
        .map {
            val temp = it.split(",")
            (temp.first().split("-").first().toInt()..temp.first().split("-").last().toInt()).toSet() to (temp.last()
                .split("-").first().toInt()..temp.last().split("-").last().toInt()).toSet()
        }

fun main() {
    var result = 0
    getInputData2("src/main/kotlin/day_4/input.txt").forEach {
        if (it.first.intersect(it.second).isNotEmpty()) {
            result++
        }
    }

    println(result)
}