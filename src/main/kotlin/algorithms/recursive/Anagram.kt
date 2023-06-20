package algorithms.recursive

//abc
fun anagram(word: String): List<String> {
    if(word.length == 1) {
        return listOf(word)
    }
    val result = mutableListOf<String>()

    val subAnagram = anagram(word.slice(1..word.lastIndex))
    subAnagram.forEach {sub ->
        for(i in 0..sub.length) {
            val copy = StringBuilder().append(sub)
                .insert(i, word[0])
                .toString()
                result.add(copy)
        }
    }

    return result.toList()
}