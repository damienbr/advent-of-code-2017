package be.inadevs.advent.of.code

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day6Test {

    private val input = "4	1	15	12	0	9	9	5	5	8	7	3	14	5	12	3"
    private val sample = "0  2   7   0"
    private val day6 = Day6()


    @Test
    fun phaseOne() {
        val values = sample.split("[ \t]+".toRegex())
        val actual = day6.phaseOne(values)
        assertEquals(5, actual)
    }

    @Test
    fun phaseTwo() {
        val values = sample.split("[ \t]+".toRegex())
        val actual = day6.phaseTwo(values)
        assertEquals(4, actual)
    }


    @Test
    fun phaseTwoInputs() {
        val values = input.split("[ \t]+".toRegex())
        val actual = day6.phaseTwo(values)
        assertEquals(2392, actual)
    }

    @Test
    fun phaseOneInputs() {
        val values = input.split("[ \t]+".toRegex())
        val actual = day6.phaseOne(values)
        assertEquals(5, actual)
    }
}