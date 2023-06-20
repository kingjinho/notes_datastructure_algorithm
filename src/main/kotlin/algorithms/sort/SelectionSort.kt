package algorithms.sort


fun selectionSortAsc(array: IntArray): IntArray {

    for (i in 0 until array.lastIndex) {
        var smallestIndex = i
        for (j in i + 1..array.lastIndex) {
            if (array[smallestIndex] > array[j]) {
                smallestIndex = j
            }
        }

        if (smallestIndex != i) {
            val temp = array[i]
            array[i] = array[smallestIndex]
            array[smallestIndex] = temp
        }
    }
    return array

}

fun selectionSortDesc(array: IntArray): IntArray {
    for (i in 0 until array.lastIndex) {
        var largestIndex = i
        for (j in i + 1..array.lastIndex) {
            if (array[largestIndex] < array[j]) {
                largestIndex = j
            }
        }

        if (largestIndex != i) {
            val temp = array[i]
            array[i] = array[largestIndex]
            array[largestIndex] = temp
        }
    }
    return array
}