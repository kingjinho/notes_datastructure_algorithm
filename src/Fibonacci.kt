fun getFibonacci(nth: Int, memo: IntArray): Int {
    if (memo[nth] != 0) {
        return memo[nth]
    }
    var result : Int = if (nth == 1 || nth == 2)
        1
    else
        getFibonacci(nth - 1, memo) + getFibonacci(nth - 2, memo)
    memo[nth] = result
    return result
}