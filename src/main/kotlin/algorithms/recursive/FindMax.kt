package algorithms.recursive

fun findMax(array: IntArray): Int {
    if(array.size == 1) {
        return array[0]
    }

    val findMaxFromSliced = findMax(array.sliceArray(1..array.lastIndex))

    return if(array[0] > findMaxFromSliced) {
        array[0]
    } else {
        findMaxFromSliced
    }
}