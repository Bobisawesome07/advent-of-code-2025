package org.bobisawesome

class Day03 {
    fun main(inputFile: List<String>) {
        var result = 0

        for (line in inputFile) {
            val nums = line.map { it.digitToInt() }
            result += getJoltage(nums)
        }

        println("output joltage is $result")
    }

    fun getJoltage (joltageList: List<Int>): Int {
        var result = 0
        return 0
    }
}