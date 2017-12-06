package be.inadevs.advent.of.code

class Day5 {
    fun partOne(lines: List<String>): Int {
        val values =
                lines.map { it.toInt() }
                        .toIntArray()

        var value: Int
        var idx = 0
        var count = 0
        try {
            while (true) {
                val actualValue = values[idx]
                value = when (actualValue > 2) {
                    true -> actualValue - 1
                    false -> actualValue + 1
                }

                values[idx] = value
                idx += actualValue
                count++
            }
        } catch (e: Exception) {
        }

        return count
    }

}