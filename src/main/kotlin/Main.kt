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

        "6" -> {
            val file = readInput("input06.txt")
            Day06().main(file)
        }

        "7" -> {
            val file = readInput("input07")
            Day07().main(file)
        }

        "8" -> {
            val file = readInput("input08")
            Day08().main(file)
        }

        "9" -> {
            val file = readInput("input09")
            Day09().main(file)
        }

        "10" -> {
            val file = readInput("input10")
            Day10().main(file)
        }

        "11" -> {
            val file = readInput("input11")
            Day11().main(file)
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

        "6t" -> {
            val file = readInput("test06")
            Day06().main(file)
        }

        "7t" -> {
            val file = readInput("test07")
            Day07().main(file)
        }

        "8t" -> {
            val file = readInput("test08")
            Day08().main(file)
        }

        "9t" -> {
            val file = readInput("test09")
            Day09().main(file)
        }

        "10t" -> {
            val file = readInput("test10")
            Day10().main(file)
        }

        "11t" -> {
            val file = readInput("test11")
            Day11().main(file)
        }

        "12" -> {
            val file = readInput("input12")
            Day12().main(file)
        }

        "12t" -> {
            val file = readInput("test12")
            Day12().main(file)
        }

        else -> println("Day $day not implemented yet")
    }
}