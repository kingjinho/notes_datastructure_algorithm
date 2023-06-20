package algorithms.sort

fun bubbleSortAsc(array: IntArray): IntArray {

    for (i in array.indices) { //define how many round it should go through
        for (j in 0 until array.lastIndex - i) { //actual comparison of adjacent elements
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp
            }
        }
    }
    return array
}

fun bubbleSortAsc1(array: IntArray): IntArray {
    var sorted = false
    var index = array.lastIndex
    while (!sorted) {

        sorted = true

        for (i in 0 until index) {
            if (array[i] > array[i + 1]) {
                val temp = array[i]
                array[i] = array[i + 1]
                array[i + 1] = temp
                sorted = false
            }
        }
        index -= 1
    }

    return array
}

fun bubbleSortDesc(array: IntArray): IntArray {
    for (i in array.lastIndex downTo 1) {
        for (j in array.lastIndex downTo array.lastIndex - i + 1) {
            if (array[j] > array[j - 1]) {
                val temp = array[j - 1]
                array[j - 1] = array[j]
                array[j] = temp
            }
        }
    }
    return array
}

fun bubbleSortDesc2(array: IntArray): IntArray {

    var sorted = false
    var index = 1

    while (!sorted) {

        sorted = true

        for (i in array.lastIndex downTo index) {
            if (array[i] > array[i - 1]) {
                val temp = array[i]
                array[i] = array[i - 1]
                array[i - 1] = temp
                sorted = false
            }
        }
        index += 1
    }


    return array
}