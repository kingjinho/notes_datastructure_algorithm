package algorithms.sort

import kotlin.random.Random

fun performQuickSortOld(arr: IntArray, left: Int, right: Int): IntArray {
    if (right > left) {
        val idxPivot = partitionLast(arr, left, right)
        performQuickSortOld(arr, left, idxPivot - 1)
        performQuickSortOld(arr, idxPivot + 1, right)
    }
    return arr
}

private fun partitionLast(arr: IntArray, left: Int, right: Int): Int {
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
