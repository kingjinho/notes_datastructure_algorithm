package algorithms.recursive

fun doubleArray(array: IntArray, index: Int = 0) : IntArray {
    return if(array.size > index) {
        array[index] = array[index] * 2
        doubleArray(array, index + 1)
    } else {
        array
    }
}