package org.bobisawesome

class Day06 {
    fun main(inputFile: List<String>) {

        val matrix = Array(inputFile.size) { arrayOf<String>() }
        val rowCount = inputFile.size
        for (i in inputFile.indices) {

            val parts = inputFile[i].trim().split("\\s+".toRegex())
            matrix[i] = parts.toTypedArray()
        }

        val colCount = matrix[0].size
        val transposed = Array(colCount) {
            arrayOfNulls<String>(rowCount)
        }

        for(i in 0 until rowCount) {
            for(j in 0 until colCount) {
                transposed[j][i] = matrix[i][j]
            }
        }

        transposed.forEach { it.to }
    }
}
