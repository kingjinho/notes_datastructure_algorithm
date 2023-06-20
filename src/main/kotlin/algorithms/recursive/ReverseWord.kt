package algorithms.recursive

import java.lang.StringBuilder

fun reverseWordRecursive(word: String): String {
    return if(word.length == 1) {
        word
    } else {
        reverseWordRecursive(word.slice(1..word.lastIndex)) + word[0]
    }
}