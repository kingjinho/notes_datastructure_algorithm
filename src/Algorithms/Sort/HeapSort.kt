package Algorithms.Sort

//intArrayOf(1,5,9,4,3,8)
fun performHeapSort(arr: IntArray, arrMaxIdx: Int) {

    if (arr.size - 1 == arrMaxIdx || arrMaxIdx == 1) {
        val idxParent = (arrMaxIdx - 1) / 2
        if (arr[arrMaxIdx] > arr[idxParent]) {
            val temp = arr[arrMaxIdx]
            arr[arrMaxIdx] = arr[idxParent]
            arr[idxParent] = temp
        }
    }

    for (i in arrMaxIdx - 2 downTo 1 step 2)
        compareAndSwapNode(arr, (i - 1) / 2, i, i + 1)

    val temp = arr[0]
    arr[0] = arr[arrMaxIdx]
    arr[arrMaxIdx] = temp

    if (arrMaxIdx >= 2)
        performHeapSort(arr, arrMaxIdx - 1)
}

fun compareAndSwapNode(arr: IntArray, idxParent: Int, idxLeftChild: Int, idxRightChild: Int) {
    val valueAtParent = arr[idxParent]
    val valueAtLeftChild = arr[idxLeftChild]
    val valueAtRightChild = arr[idxRightChild]

    if (valueAtParent < valueAtLeftChild && valueAtParent < valueAtRightChild) {
        val tempLarger = if (valueAtLeftChild < valueAtRightChild) valueAtRightChild else valueAtLeftChild
        arr[if (valueAtLeftChild < valueAtRightChild) idxRightChild else idxLeftChild] = valueAtParent
        arr[idxParent] = tempLarger

    } else if (valueAtParent in valueAtLeftChild..valueAtRightChild) {
        arr[idxParent] = valueAtRightChild
        arr[idxRightChild] = valueAtParent

    } else if (valueAtParent in valueAtRightChild..valueAtLeftChild) {
        arr[idxParent] = valueAtLeftChild
        arr[idxLeftChild] = valueAtParent
    }

}
