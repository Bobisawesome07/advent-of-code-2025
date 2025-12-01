package org.bobisawesome

import kotlin.system.exitProcess

fun main() {
    val lockPosition = 50
    val password = 0
    val rotations = ArrayList<Rotation>()

    println("Please input the name of the input file (do not include .txt")

    val input = readInput(readln())

    for (line in input.toString()) {
        val dir: Int = direction(line.toString().first())
        val amount = line.toString().substring(1).toInt()
        val rotation = Rotation(dir, amount)

        rotations.add(rotation)
    }
    for (spin in rotations) {
        println(spin.direction.toString() + " " + spin.amount.toString())
    }
}

fun direction (direction: Char): Int {
    if(direction == 'L') {
        return -1;
    }
    else if(direction == 'R') {
        return 1
    }
    else {
        exitProcess(1)
    }
}

data class Rotation (val direction: Int,val amount: Int){
}