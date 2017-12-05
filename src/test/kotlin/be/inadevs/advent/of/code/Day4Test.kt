package be.inadevs.advent.of.code

import org.junit.jupiter.api.Assertions
import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test
import java.io.File

internal class Day4Test {

    val day4 = Day4()

    @Test
    fun passPhrasePhaseOne() {
        var actual = day4.isValidPassphrase("aa bb cc dd ee")
        Assertions.assertTrue(actual)
        actual = day4.isValidPassphrase("aa bb cc dd aa")
        Assertions.assertFalse(actual)
        actual = day4.isValidPassphrase("aa bb cc dd aaa")
        Assertions.assertTrue(actual)
    }

    @Test
    fun validatePassphraseTwo() {
        var actual = day4.isValidPassphraseStep2("abcde fghij")
        Assertions.assertTrue(actual)
        actual = day4.isValidPassphraseStep2("abcde xyz ecdab")
        Assertions.assertFalse(actual)
        actual = day4.isValidPassphraseStep2("a ab abc abd abf abj")
        Assertions.assertTrue(actual)
        actual = day4.isValidPassphraseStep2("iiii oiii ooii oooi oooo")
            Assertions.assertTrue(actual)
        actual = day4.isValidPassphraseStep2("oiii ioii iioi iiio")
        Assertions.assertFalse(actual)
    }

    @Test
    fun validateInput() {
        val count = File("./src/test/resources/day4inputs.txt")
                .readLines()
                .filter { day4.isValidPassphrase(it) }
                .count()

        assertEquals(325, count)
    }

    @Test
    fun validateInputPart2() {
        val count = File("./src/test/resources/day4Part2.txt")
                .readLines()
                .filter { day4.isValidPassphraseStep2(it) }
                .count()

        assertEquals(119, count)
    }


}