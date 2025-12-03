package org.bobisawesome

class Day03 {
    fun main(inputFile: List<String>) {
        var result = 0
        for (line in inputFile) {
            val nums: MutableList<Int> = line.map { it.digitToInt() }.toMutableList()
            val biggest = nums.maxOrNull()
            val biggestIndex = nums.indexOf(nums.maxOrNull())
        }
        println("output joltage is $result")
    }
}