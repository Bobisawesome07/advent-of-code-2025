package org.bobisawesome

import kotlin.math.abs
import kotlin.system.exitProcess

class Day01 {
    var timesOnZero = 0
    val dialSize = 100

    fun main(inputFile: List<String>) {
        var lockPosition = 50
        val rotations = ArrayList<Rotation>()

        for (line in inputFile) {
            val dir: Int = direction(line.toString().first())
            val amount = line.toString().substring(1).toInt()
            val rotation = Rotation(dir, amount)

            rotations.add(rotation)
        }
        for (spin in rotations) {
//            println(spin.direction.toString() + " " + spin.amount.toString())
            lockPosition = rotate(spin, lockPosition)

            println("input was " + spin.direction.toString() + " " + spin.amount.toString() + " current lock position is $lockPosition")
            println("")


        }

        println("The password is $timesOnZero")
    }

    fun direction(direction: Char): Int {
        if (direction == 'L') {
            return -1
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
        var pos = currentPosition

        if (movement < 0) {
            for (num in 0 until abs(movement)) {
                if (pos == 0) {
                    pos = 99
                } else {
                    pos--
                    if (pos == 0) {
                        timesOnZero++
                    }
                }
            }
        } else if (movement > 0) {
            for (num in 0 until movement) {
                if (pos == 99) {
                    pos = 0
                    timesOnZero++
                } else {
                    pos++
                }
            }
        }


        return abs(pos)
    }
}