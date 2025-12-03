package org.bobisawesome

class Day03 {
    fun main(inputFile: List<String>) {
        var result = 0
        for (line in inputFile) {
            val nums: MutableList<Int> = line.map { it.digitToInt() }.toMutableList()
            val biggest = nums.maxOrNull()
            val biggestIndex = nums.indexOf(nums.maxOrNull())
            val numsSecond: MutableList<Int> = nums.toMutableList().apply { removeAt(nums.indexOf(biggest)) }
            val secondBiggest = numsSecond.maxOrNull()
            val secondBiggestIndex = numsSecond.indexOf(numsSecond.maxOrNull())

            println("from $nums $biggest and $secondBiggest are the 2 biggest numbers")

            if(secondBiggestIndex >= biggestIndex){
                result += (biggest.toString() + secondBiggest.toString()).toInt()
            } else {
                result += (secondBiggest.toString() + biggest.toString()).toInt()
            }
        }
        println("output joltage is $result")
    }
}