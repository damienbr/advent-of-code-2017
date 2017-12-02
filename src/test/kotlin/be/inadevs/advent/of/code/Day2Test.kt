package be.inadevs.advent.of.code

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Test
import java.io.File

internal class Day2Test {

    val day2 = Day2()

    @Test
    fun spreadsheetChecksumSample() {
        val lines = File("./src/test/resources/sample.txt").readLines()
        val actual = day2.spreadsheetChecksum(lines);
        Assertions.assertEquals(18, actual)
    }

    @Test
    fun spreadsheetChecksum() {
        val lines = File("./src/test/resources/spreadsheet.txt").readLines()
        val actual = day2.spreadsheetChecksum(lines);
        Assertions.assertEquals(36174, actual)
    }

    @Test
    fun spreadsheetChecksumSampleEven() {
        val lines = File("./src/test/resources/sampleEven.txt").readLines()
        val actual = day2.spreadsheetChecksumEven(lines);
        Assertions.assertEquals(9, actual)
    }

    @Test
    fun spreadsheetChecksumEven() {
        val lines = File("./src/test/resources/spreadsheetEven.txt").readLines()
        val actual = day2.spreadsheetChecksumEven(lines);
        Assertions.assertEquals(244, actual)
    }
}