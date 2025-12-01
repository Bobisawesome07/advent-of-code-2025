package org.example

import java.io.File

fun main() {
    val lockPosition = 50

    println("Please input absolute path to the input file + its name")

    val input = readln()
    val file = File(input)

    for (line in input.split("\n")) {

    }
}
class rotation{
    var direction: String = ""
    var amount: Int = 0
}