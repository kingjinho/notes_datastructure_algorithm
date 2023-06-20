package algorithms.recursive

fun countingX(word: String): Int {
    return if (word.isEmpty()) {
        0
    } else if (word[0].uppercase() == "X") {
        1 + countingX(word.slice(1..word.lastIndex))
    } else {
        countingX(word.slice(1..word.lastIndex))
    }
}