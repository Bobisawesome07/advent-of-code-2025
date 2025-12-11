package org.bobisawesome

class Day04 {

    fun main(inputFile: List<String>) {
        val grid = createGrid(inputFile)
        val result = scanGrid(grid)
        println("There are $result reachable toilet paper rolls.")
    }

    fun createGrid(inputList: List<String>): ArrayList<ArrayList<Boolean>> {
        val grid: ArrayList<ArrayList<Boolean>> = ArrayList()

        for (line in inputList) {
            val lineList: ArrayList<Boolean> = ArrayList()

            for (symbol in line) {
                lineList.add(symbol == '@')
            }
            grid.add(lineList)
        }
        return grid
    }

    fun scanGrid(grid: ArrayList<ArrayList<Boolean>>): Int {
        val scannedGrid: ArrayList<ArrayList<Boolean>> = ArrayList()
        val result = 0

        for (row in grid) {
            val scannedRow: ArrayList<Boolean> = ArrayList()
            for (item in row) {
                scannedRow.add(isReachable(grid, row.indexOf(item), grid.indexOf(row)))
            }
            scannedGrid.add(scannedRow)
        }
        return result
    }

    fun isReachable(grid: ArrayList<ArrayList<Boolean>>, row: Int, column: Int): Boolean {
        return false
    }

}
