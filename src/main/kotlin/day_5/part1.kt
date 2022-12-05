package day_5

import java.io.File

fun getInputData() = File("src/main/kotlin/day_5/input.txt").readLines().map {
    val temp = it.split(" ")
    Triple(temp[1].toInt(), temp[3].toInt(), temp[5].toInt())
}

fun main() {
    val elements = listOf(
        mutableListOf("N", "S", "D", "C", "V", "Q", "T"),
        mutableListOf("M", "F", "V"),
        mutableListOf("F", "Q", "W", "D", "P", "N", "H", "M"),
        mutableListOf("D", "Q", "R", "T", "F"),
        mutableListOf("R", "F", "M", "N", "Q", "H", "V", "B"),
        mutableListOf("C", "F", "G", "N", "P", "W", "Q"),
        mutableListOf("W", "F", "R", "L", "C", "T"),
        mutableListOf("T", "Z", "N", "S"),
        mutableListOf("M", "S", "D", "J", "R", "Q", "H", "N")
    )

    getInputData().forEach { elem ->
        val index = elements[elem.third - 1].size
        repeat(elem.first) {
            elements[elem.third - 1].add(index, elements[elem.second - 1].removeLast())
        }
    }

    elements.forEach {
        print(it.last())
    }
}