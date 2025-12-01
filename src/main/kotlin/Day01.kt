package org.bobisawesome

import kotlin.math.abs
import kotlin.system.exitProcess

class Day01 {
    var timesOnZero = 0
    val dialSize = 100

    fun main() {
        var lockPosition = 50
        val rotations = ArrayList<Rotation>()

        println("Please input the name of the input file (do not include .txt")

        val input = readInput(readln())

        for (line in input) {
            val dir: Int = direction(line.toString().first())
            val amount = line.toString().substring(1).toInt()
            val rotation = Rotation(dir, amount)

            rotations.add(rotation)
        }
        for (spin in rotations) {
//            println(spin.direction.toString() + " " + spin.amount.toString())
            lockPosition = rotate(spin, lockPosition)

            println("input was " + spin.direction.toString() + " "+ spin.amount.toString() + " current lock position is $lockPosition")
            println("")

            if(lockPosition == 0){
                timesOnZero += 1
            }
        }

        println("The password is $timesOnZero")
    }

    fun direction(direction: Char): Int {
        if (direction == 'L') {
            return -1;
        } else if (direction == 'R') {
            return 1
        } else {
            println(direction)
            exitProcess(143)
        }
    }

    fun rotate(spinner: Rotation, currentPosition: Int): Int {
        val direction = spinner.direction
        val amount = spinner.amount
        val movement = direction * amount
        val rawPosition = currentPosition + movement
        val pastZero = abs(rawPosition)/100
        timesOnZero+=pastZero
        println("past zero $pastZero")

        val finalPosition = (rawPosition % dialSize + dialSize) % dialSize

        return abs(finalPosition)
    }
}

data class Rotation (val direction: Int,val amount: Int){
}