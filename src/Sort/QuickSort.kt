package Sort

import kotlin.random.Random

fun performQuickSort(arr: IntArray, idxLow: Int, idxHigh: Int) {

    if (idxHigh > idxLow) {
        val idxPivot = getLastPivotIndex(arr, idxLow, idxHigh)
        performQuickSort(arr, 0, idxPivot - 1)
        performQuickSort(arr, idxPivot + 1, arr.size - 1)
    }
}

private fun getLastPivotIndex(arr: IntArray, idxLow: Int, idxHigh: Int): Int {
    val pivot = arr.random()
    var lastIdxSmallerThanPivot = -1
    if (idxHigh > idxLow) {
        for (num in idxLow..idxHigh) {
            if (arr[num] < pivot) {
                lastIdxSmallerThanPivot++
                var temp = arr[num]
                arr[num] = arr[lastIdxSmallerThanPivot]
                arr[lastIdxSmallerThanPivot] = temp
            }
        }
    }
    return arr.indexOf(pivot)
}