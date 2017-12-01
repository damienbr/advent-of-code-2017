package be.inadevs.advent.of.code

import java.util.stream.IntStream

class Day1 {

    fun decryptCaptcha(input: String, offset: Int): Int {
        val digits = input.split("")
                .filter { it.isNotBlank() }
                .map { Integer.valueOf(it) }

        return IntStream.range(0, digits.size)
                .filter { filterNext(it, digits, offset) }
                .map { digits[it] }
                .sum()
    }

    private fun filterNext(index: Int, digits: List<Int>, offset: Int): Boolean {
        return matches(digits[index], digits[(index + offset) % digits.size])
    }

    private fun matches(digit: Int, nextDigit: Int): Boolean {
        return digit == nextDigit
    }

}
