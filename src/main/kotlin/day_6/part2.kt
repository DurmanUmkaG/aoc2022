package day_6

import java.io.File

fun main() {
    val temp = mutableSetOf<Char>()
    val input = File("src/main/kotlin/day_6/input.txt").readText()

    input.forEachIndexed { index, _ ->
        temp.addAll(input.subSequence(index, index + 14).toList())
        if (temp.size == 14) {
            println(index + 14)
            return
        }
        temp.clear()
    }
}