package be.inadevs.advent.of.code

class Day4 {
    fun isValidPassphrase(input: String): Boolean {
        val words = input.split("[ ]".toRegex())
        return words.none { a -> words.indexOfFirst { a == it } != words.indexOfLast { a == it } }

    }

    fun isValidPassphraseStep2(input: String): Boolean {
        println("checking $input")
        val words = input.split("[ ]".toRegex())
        val filter = words
                .map { it.split("").filter { it.isNotBlank() } }
                .filter { letters ->
                    val filter = words.filter { word -> containsAllLetter(letters, word) }
                        println(filter)
                    filter.size != 1
                }

        println(filter)
        return filter.isEmpty()
    }


    fun containsAllLetter(letters:List<String>, word:String): Boolean {
        if(word.length != letters.size) return false
        val wordLetters = word.split("").filter { it.isNotBlank() }

        return wordLetters.sorted().equals(letters.sorted())

        //return wordLetters.filter { !letters.contains(it) }.isEmpty()
        /*val value = letters
                .filter { !word.contains(it) }
                .isEmpty()
        println("$letters with word $word result in $value")
        return value*/
    }


}