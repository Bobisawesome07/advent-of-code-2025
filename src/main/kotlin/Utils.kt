package org.bobisawesome

import kotlin.io.path.Path
import kotlin.io.path.readText


fun readInput(name: String): List<String> {
    val contents = Path("src/main/resources/$name.txt").readText().trim().lines()
    return contents
}

fun isEven(input: Int): Boolean {
    return if(input % 2 == 0){
        true
    } else {
        false
    }
}

data class Rotation (val direction: Int,val amount: Int){
}

