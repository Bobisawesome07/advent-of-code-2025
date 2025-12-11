package org.bobisawesome

class Day05 {
    fun main(inputFile: List<String>) {
        val emptyLine = inputFile.indexOf("")
        val freshRanges = inputFile.subList(0, emptyLine)
        val availableItems = inputFile.subList(emptyLine + 1, inputFile.size).toMutableList()
        var freshItems: Long = 0

        for (id in availableItems) {
            for (range in freshRanges) {
                val upperAndLower = range.split("-")
                val lower = upperAndLower[0].toLong()
                val upper = upperAndLower[1].toLong()

                if (id.toLong() in lower..upper) {
                    freshItems++
                    break
                }
            }
        }
        println("There are $freshItems fresh items.")

        val freshRangesLong = ArrayList<Range>()

        for (range in freshRanges) {
            val (lower, upper) = range.split("-").map { it.toLong() }
            freshRangesLong.add(Range(lower, upper))
        }

        val rangesSorted = freshRangesLong.sortedBy { it.lower }
        val mergedRanges = mutableListOf<Range>()
        var numFreshItems = 0L

        rangesSorted.forEach { println(it) }
        mergedRanges.add(rangesSorted[0])

        for ((currentRange, nextRange) in rangesSorted.windowed(2)) {

            val lastMerged = mergedRanges.last()

            if (nextRange.lower <= lastMerged.upper + 1) {
                mergedRanges[mergedRanges.lastIndex] =
                    Range(lastMerged.lower, maxOf(lastMerged.upper, nextRange.upper))
            } else {
                mergedRanges.add(nextRange)
            }
        }
        mergedRanges.forEach { numFreshItems += ((it.upper - it.lower) + 1) }
        println("The number of fresh items in the ranges is $numFreshItems")
    }
}
