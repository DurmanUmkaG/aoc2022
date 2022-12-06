package day_6

import java.io.File

fun main() {
    val temp = mutableSetOf<Char>()
    val input = File("src/main/kotlin/day_6/input.txt").readText()

    input.forEachIndexed { index, _ ->
        temp.addAll(input.subSequence(index, index + 4).toList())
        if (temp.size == 4) {
            println(index + 4)
            return
        }
        temp.clear()
    }
}