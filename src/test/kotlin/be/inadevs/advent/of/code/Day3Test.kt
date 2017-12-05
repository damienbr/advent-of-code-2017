package be.inadevs.advent.of.code

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

internal class Day3Test {

    private val day3 = Day3()

    @Test
    fun part1() {
        var actual = day3.accessMemory(2)
        assertEquals(1, actual)
        actual = day3.accessMemory(3)
        assertEquals(2, actual)
        actual = day3.accessMemory(12)
        assertEquals(3, actual)
        actual = day3.accessMemory(4)
        assertEquals(1, actual)
        actual = day3.accessMemory(5)
        assertEquals(2, actual)
        actual = day3.accessMemory(6)
        assertEquals(1, actual)
        actual = day3.accessMemory(7)
        assertEquals(2, actual)
        actual = day3.accessMemory(8)
        assertEquals(1, actual)
        actual = day3.accessMemory(23)
        assertEquals(2, actual)
        actual = day3.accessMemory(1024)
        assertEquals(31, actual)
        actual = day3.accessMemory(361527)
        assertEquals(326, actual)
    }
}