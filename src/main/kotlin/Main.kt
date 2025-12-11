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

        "3" -> {
            val file = readInput("input03")
            Day03().main(file)
        }

        "4" -> {
            val file = readInput("input04")
            Day04().main(file)
        }

        "5" -> {
            val file = readInput("input05")
            Day05().main(file)
        }

        "1t" -> {
            val file = readInput("test01")
            Day01().main(file)
        }

        "2t" -> {
            val file = readInput("test02")
            Day02().main(file)
        }

        "3t" -> {
            val file = readInput("test03")
            Day03().main(file)
        }

        "4t" -> {
            val file = readInput("test04")
            Day04().main(file)
        }

        "5t" -> {
            val file = readInput("test05")
            Day05().main(file)
        }

        else -> println("Day $day not implemented yet")
    }
}