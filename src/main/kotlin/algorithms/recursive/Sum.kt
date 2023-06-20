package algorithms.recursive

fun sumOfArray(array: IntArray): Int {
    return if(array.size == 1) {
        array[0]
    } else {
        array[0] + sumOfArray(array.sliceArray(1..array.lastIndex))
    }
}