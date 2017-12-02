package be.inadevs.advent.of.code

class Day2 {

    fun spreadsheetChecksum(lines: List<String>): Int {
        return lines
                .map { average(it) }
                .sum()
    }

    fun spreadsheetChecksumEven(lines: List<String>): Int {
        return lines
                .map { even(it) }
                .sum()
    }

    private fun even(line: String): Int {
        val digits = convertToDigits(line)

        return digits.flatMap(findEven(digits))
                .first()
    }

    private fun findEven(digits: List<Int>): (Int) -> List<Int> {
        return { number ->
            digits.filter { number != it }
                    .filter { number % it == 0 }
                    .map { number.div(it) }
        }
    }

    private fun average(line: String): Int {
        val digits = convertToDigits(line)
        return digits.max()?.minus(digits.min() ?: 0) ?: 0
    }

    private fun convertToDigits(line: String): List<Int> {
        return line.split("[ \t]+".toRegex())
                .filter { it.isNotBlank() }
                .map { it.toInt() }
    }

}