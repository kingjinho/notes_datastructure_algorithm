package Sort

//intArrayOf(1,5,9,4,3,8)
fun performHeapSort(arr: IntArray, arrMaxIdx: Int) {
    if (arr.size == arrMaxIdx + 1 && arr.size % 2 == 1) {
        compareNode(arr, (i - 1) / 2, i, i + 1)
    }

    for (i in arrMaxIdx downTo 0 step 2) {
        if (i % 2 == 0) {
            compareNode(arr, (i - 1) / 2, i, i + 1)
        } else {
            compareNode(arr, (i - 2) / 2, i - 1, i)
        }
    }
    val temp = arr[0]
    arr[0] = arr[arrMaxIdx]
    arr[arrMaxIdx] = temp

    performHeapSort(arr, arrMaxIdx - 1)
}

fun compareNode(arr: IntArray, idxParent: Int, idxChildLeft: Int, idxChildRight: Int) {
    val valueAtIdxParent = arr[idxParent]
    val valueAtIdxChildLeft = arr[idxChildLeft]
    val valueAtIdxChildRight = arr[idxChildRight]

    if (valueAtIdxParent < valueAtIdxChildLeft && valueAtIdxParent < valueAtIdxChildRight) {
        val temp = if (valueAtIdxChildLeft < valueAtIdxChildRight) valueAtIdxChildRight else valueAtIdxChildLeft
        arr[idxParent] = temp
        arr[if (valueAtIdxChildLeft < valueAtIdxChildRight) idxChildLeft else idxChildRight] = valueAtIdxParent

    } else if (valueAtIdxParent in valueAtIdxChildLeft until valueAtIdxChildRight) {
        arr[idxParent] = valueAtIdxChildRight
        arr[idxChildRight] = valueAtIdxParent

    } else if (valueAtIdxParent in valueAtIdxChildRight until valueAtIdxChildLeft) {
        arr[idxParent] = valueAtIdxChildLeft
        arr[idxChildRight] = valueAtIdxChildLeft
    }

}
