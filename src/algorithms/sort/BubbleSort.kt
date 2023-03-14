package algorithms.sort

fun bubbleSortAsc(array: IntArray): IntArray {
    for(i in array.indices) { //define how many round it should go through
        for(j in 0 until array.size - i- 1) { //actual comparison of adjacent elements
            if(array[j] > array[j+1]) {
                val temp = array[j]
                array[j] = array[j+ 1]
                array[j+1] = temp
            }
        }
    }
    return array
}

fun bubbleSortDesc(array: IntArray): IntArray {
    for (i in array.lastIndex downTo 0) {
        for (j in array.lastIndex - i downTo 1) {
            if(array[j-1] < array[j]) {
                val temp = array[j-1]
                array[j-1] = array[j]
                array[j] = temp
            }
        }
    }
    return array
}