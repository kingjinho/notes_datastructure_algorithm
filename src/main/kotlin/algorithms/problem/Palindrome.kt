package algorithms.problem

fun isPalindrome(word: String): Boolean {

    if(word.isEmpty() || word.length <= 1) {
        return false
    }
    val lastIndex = word.lastIndex
    for(i in 0..lastIndex / 2) {
        if(word[i] != word[lastIndex - i]) {
            return false
        }
    }

    return true
}