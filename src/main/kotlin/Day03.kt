package org.bobisawesome

class Day03 {
    fun main(inputFile: List<String>) {
        var result = 0
        val nums = inputFile.forEach { it.map { it.digitToInt() }.toMutableList() }

        println("output joltage is $result")
    }
}