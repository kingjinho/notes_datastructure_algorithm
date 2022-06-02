package algorithms.sort


fun selectionSortAsc(array: IntArray): IntArray {

    for(i in array.indices) { //starting index
        var smallestIndex = i
        for(j in i until array.size) {
            if(array[smallestIndex] > array[j]) {
                smallestIndex = j
            }
        }
        val temp = array[i]
        array[i] = array[smallestIndex]
        array[smallestIndex] = temp
    }
    return array
}

fun selectionSortDesc(array: IntArray): IntArray {
    for(i in array.indices) { //starting index
        var largestIndex = i
        for(j in i until array.size) {
            if(array[largestIndex] < array[j]) {
                largestIndex = j
            }
        }
        val temp = array[i]
        array[i] = array[largestIndex]
        array[largestIndex] = temp
    }
    return array
}