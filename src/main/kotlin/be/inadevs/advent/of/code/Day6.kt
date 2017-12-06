package be.inadevs.advent.of.code

class Day6 {


    fun phaseOne(values: List<String>): Int {
        var actualValue = values
        val combinations = mutableSetOf<String>()

        while (!combinations.contains(actualValue.toString())) {
            combinations.add(actualValue.toString())
            actualValue = shiftValues(actualValue)
        }

        return combinations.size
    }


    fun phaseTwo(values: List<String>): Int {
        var actualValue = values
        val combinations = mutableSetOf<String>()

        while (!combinations.contains(actualValue.toString())) {
            combinations.add(actualValue.toString())
            actualValue = shiftValues(actualValue)
        }

        combinations.clear()
        while (!combinations.contains(actualValue.toString())) {
            combinations.add(actualValue.toString())
            actualValue = shiftValues(actualValue)
        }

        return combinations.size
    }

    private fun shiftValues(values: List<String>): List<String> {
        val intValues = values.map { it.toInt() }.toIntArray()
        val max = intValues.max() ?: 0
        var idx = intValues.indexOf(max)
        intValues[idx] = 0
        for (i in 1..max) {
            if (++idx >= intValues.size) {
                idx = 0
            }

            intValues[idx] = ++intValues[idx]
        }

        return intValues.map { "" + it }.toList()
    }


}