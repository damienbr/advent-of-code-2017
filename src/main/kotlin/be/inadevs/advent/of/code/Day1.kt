package be.inadevs.advent.of.code

class Day1() {


    fun decryptCaptcha(input: String): Int {
        var sum = 0
        val digits = input.split("(?!^)".toRegex())
                .filter { it != "" }
                .map { Integer.valueOf(it) }

        var i = 0;
        while (i < digits.lastIndex) {
            if (matches(digits[i], digits[i + 1])) {
                sum += digits[i]
            }

            i++
        }
        if (matches(digits.last(), digits.first())) {
            sum += digits.last()
        }

        return sum
    }

    fun matches(digit: Int, nextDigit: Int): Boolean {
        return digit == nextDigit
    }

}
