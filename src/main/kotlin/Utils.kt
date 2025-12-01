package org.bobisawesome

import kotlin.io.path.Path
import kotlin.io.path.readText


    fun readInput(name: String): List<String> {
        val contents = Path("src/main/resources/$name.txt").readText().trim().lines()
        return contents
    }
