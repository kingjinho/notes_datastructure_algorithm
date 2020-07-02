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
        val pivot = arr.copyOfRange(idxLow, idxHigh + 1).random()
        println("pivot : $pivot")
        for (num in idxLow..idxHigh) {
            if (arr[num] < pivot) {
                lastIdxSmallerThanPivot++
                var temp = arr[num]
                arr[num] = arr[lastIdxSmallerThanPivot]
                arr[lastIdxSmallerThanPivot] = temp
            }
            print("$num  ")
        }
        println()
        println("indexLow : $idxLow, indexHigh : $idxHigh, lastIdxSmallerThanPivot: $lastIdxSmallerThanPivot,")
        for (i in arr) {
            print("$i  " )
        }
        println("recur--------------")
        return arr.indexOf(pivot)
    }
    return 0
}