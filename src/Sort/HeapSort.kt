package Sort

//intArrayOf(1,5,9,4,3,8)
fun performHeapSort(arr: IntArray, arrMaxIdx: Int) {

    if (arr.size - 1 == arrMaxIdx) {
        if (arr[arrMaxIdx] > arr[(arrMaxIdx - 1) / 2]) {
            val temp = arr[arrMaxIdx]
            arr[arrMaxIdx] = arr[(arrMaxIdx - 1) / 2]
            arr[(arrMaxIdx - 1) / 2] = temp
        }
    }

    for (i in arrMaxIdx - 2 downTo 1 step 2)
        compareAndSwapNode(arr, (i - 1) / 2, i, i + 1)

    val temp = arr[0]
    arr[0] = arr[arrMaxIdx]
    arr[arrMaxIdx] = temp

    if (arrMaxIdx >= 3)
        performHeapSort(arr, arrMaxIdx - 1)
}

fun compareAndSwapNode(arr: IntArray, idxParent: Int, idxChildLeft: Int, idxChildRight: Int) {
    val valueAtIdxParent = arr[idxParent]
    val valueAtIdxChildLeft = arr[idxChildLeft]
    val valueAtIdxChildRight = arr[idxChildRight]

    if (valueAtIdxParent < valueAtIdxChildLeft && valueAtIdxParent < valueAtIdxChildRight) {
        val tempLarger = if (valueAtIdxChildLeft < valueAtIdxChildRight) valueAtIdxChildRight else valueAtIdxChildLeft
        arr[if (valueAtIdxChildLeft < valueAtIdxChildRight) idxChildRight else idxChildLeft] = valueAtIdxParent
        arr[idxParent] = tempLarger

    } else if (valueAtIdxParent in valueAtIdxChildLeft until valueAtIdxChildRight) {
        arr[idxParent] = valueAtIdxChildRight
        arr[idxChildRight] = valueAtIdxParent

    } else if (valueAtIdxParent in valueAtIdxChildRight until valueAtIdxChildLeft) {
        arr[idxParent] = valueAtIdxChildLeft
        arr[idxChildRight] = valueAtIdxChildLeft
    }

}
