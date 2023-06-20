package algorithms.sort

fun quickSort(arr: IntArray, left: Int, right: Int) {
    if (right > left) {
        val idxPivot = partition(arr, left, right)
        quickSort(arr, left, idxPivot - 1)
        quickSort(arr, idxPivot + 1, right)
    }
}

private fun partition(arr: IntArray, left: Int, right: Int): Int {
    var i = left - 1
    val pivot = arr[right]
    for (num in left..right) {
        if (arr[num] < pivot) {
            i++
            val temp = arr[num]
            arr[num] = arr[i]
            arr[i] = temp
        }
    }

    i++
    val temp = arr[right]
    arr[right] = arr[i]
    arr[i] = temp
    return i
}


fun quickSortNew(arr: IntArray, left: Int, right: Int) {
    if (right > left) {
        val idxPivot = partition(arr, left, right)
        partitionNew(arr, left, idxPivot - 1)
        partitionNew(arr, idxPivot + 1, right)
    }
}

private fun partitionNew(arr: IntArray, left: Int, right: Int): Int {
    var leftPointer = left
    var rightPointer = right -1
    val pivot = arr[right]

    while (true) {
        while (arr[leftPointer] < pivot) {
            leftPointer++
        }

        while (arr[rightPointer] > pivot) {
            rightPointer--
        }

        if(leftPointer >= rightPointer) {
            break
        } else {
            val temp = arr[leftPointer]
            arr[leftPointer] = arr[rightPointer]
            arr[rightPointer] = temp
            leftPointer++
        }
    }

    val temp = arr[leftPointer]
    arr[leftPointer] = pivot
    arr[right] = temp

    return leftPointer
}
