package algorithms.problem

fun getAvgOfEvenNumbers(array: IntArray): Double {

    var count = 0
    var sumOfEvenNumbers = 0

    for(i in array) {
        if(i % 2 == 0) {
            count++
            sumOfEvenNumbers += i
        }
    }

    return if(count == 0) {
        Double.POSITIVE_INFINITY
    } else {
        sumOfEvenNumbers.toDouble() / count
    }

}