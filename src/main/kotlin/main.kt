package org.bobisawesome

fun main() {
    println("what day is it?")
    when (val day = readln()) {
        "1" -> {
            val file = readInput("input01")
            Day01().main(file)
        }
        "2" -> {
            val file = readInput("input02")
            Day02().main(file)
        }
        "1t" -> {
            val file = readInput("test01")
            Day01().main(file)
        }
        "2t" -> {
            val file = readInput("test02")
            Day02().main(file)
        }
        else -> println("Day $day not implemented yet")
    }
}