package be.inadevs.advent.of.code

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

internal class Day5Test {

    val day5 = Day5()

    @Test
    fun partOneSample() {
        val lines = File("./src/test/resources/Day5Sample.txt").readLines()
        val value = day5.partOne(lines)
        assertEquals(10, value)
    }

    @Test
    fun partOne() {
        val lines = File("./src/test/resources/Day5PartOneInput.txt").readLines()
        val value = day5.partOne(lines)
        println(lines)
        assertEquals(28675390, value)
    }
}