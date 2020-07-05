package Sort

import kotlin.random.Random

//intArrayOf(1,5,9,4,3,8)
fun performQuickSort(arr: IntArray, idxLow: Int, idxHigh: Int) {
    if (idxHigh > idxLow) {
        val idxPivot = getLastPivotIndex(arr, idxLow, idxHigh)
        performQuickSort(arr, idxLow, idxPivot - 1)
        performQuickSort(arr, idxPivot + 1, idxHigh)
    }
}

private fun getLastPivotIndex(arr: IntArray, idxLow: Int, idxHigh: Int): Int {
    var lastIdxSmallerThanPivot = idxLow - 1
    if (idxHigh > idxLow) {
        val idxPivot = Random.nextInt(idxLow, idxHigh + 1)
        val valueAtIdxPivot = arr[idxPivot]
        arr[idxPivot] = arr[idxHigh]
        arr[idxHigh] = valueAtIdxPivot
        for (num in idxLow..idxHigh) {
            if (arr[num] <= valueAtIdxPivot) {
                lastIdxSmallerThanPivot++
                val temp = arr[num]
                arr[num] = arr[lastIdxSmallerThanPivot]
                arr[lastIdxSmallerThanPivot] = temp
            }
        }
        return lastIdxSmallerThanPivot ++
    }
    return 0
}