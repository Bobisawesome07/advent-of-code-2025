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
        val listNoEnd = joltageList.subList(0, joltageList.size - 1)
        val o = listNoEnd.indexOf(listNoEnd.max()) + 1
        val g = joltageList.subList(o, joltageList.size)
        result += listNoEnd.max() * 10
        result += g.max()
        println("debug or something idfk, result it $result")
        return result
    }
}