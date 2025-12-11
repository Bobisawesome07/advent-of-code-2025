package org.bobisawesome

class Day02 {
    fun main(inputFile: List<String>) {
        val input = inputFile[0].split(",")
        var result: Long = 0

        for (thing in input) {
            val splitThing = thing.split("-")
            val lower = splitThing[0]
            val upper = splitThing[1]

            println("lower is $lower upper is $upper")

            for (num in lower.toLong()..upper.toLong()) {
                val numString = num.toString()
                val lastHalfNumString = numString.substring(numString.length / 2)
                val firstHalfNumString = numString.take(numString.length / 2)

                if (!isEven(numString.length)) {
                    continue
                } else if (lastHalfNumString == firstHalfNumString) {
                    result += num
                }
            }
        }
        println("answer is $result")
    }
}