package org.bobisawesome

fun main() {
    println("what day is it?")
    when (val day = readln()) {
        "1" -> Day01().main()
        else -> println("Day $day not implemented yet")
    }
}