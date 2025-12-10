package org.bobisawesome

class Day05 {
    fun main(inputFile: List<String>) {
        val emptyLine = inputFile.indexOf("")
        val ranges = inputFile.subList(0, emptyLine)
        val freshItemsList = inputFile.subList(emptyLine + 1, inputFile.size)
        val freshItems = 0

        for (range in ranges) {
            val lower = range.subSequence(0, range.indexOf("-"))
        }
    }

}
