package day_2

import java.io.File

fun getInputDataFromFile(filePath: String) =
    File(filePath).readLines().map { Pair(it.first().toString(), it.last().toString()) }