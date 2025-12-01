package org.bobisawesome

import kotlin.system.exitProcess

fun main() {
    val lockPosition = 50
    val rotations = ArrayList<Rotation>()

    println("Please input the name of the input file (do not include .txt")

    val input = readInput(readln())

    for (line in input.toString()) {
        rotations.add(Rotation())
        line.toString().first()
    }
}

fun direction (direction: String): Int {
    if(direction == "L") {
        return -1;
    }
    else if(direction == "R") {
        return 1
    }
    else {
        exitProcess(1)
    }
}

data class Rotation (val direction: Int,val amount: Int){
}