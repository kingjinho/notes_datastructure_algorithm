package sort

import kotlin.random.Random

//1,2,3,4,5,6,7,8,9
fun performSumWithDivideAndConquer(arr: IntArray): Int {
    return if (arr.size == 1) {
        arr[0]
    } else {
        arr[0] + performSumWithDivideAndConquer(arr.copyOfRange(1, arr.size))
    }
}

fun performArraySizeWithDivideAndConquer(arr: IntArray): Int {
    return if (arr.size == 1) {
        1
    } else {
        1 + performArraySizeWithDivideAndConquer(arr.copyOfRange(1, arr.size))
    }
}
//find a maximum number in a list


//intArrayOf(1,5,9,4,3,8)
fun performQuickSortOld(arr: IntArray, idxLow: Int, idxHigh: Int) {
    if (idxHigh > idxLow) {
        val idxPivot = getLastPivotIndex(arr, idxLow, idxHigh)
        performQuickSortOld(arr, idxLow, idxPivot - 1)
        performQuickSortOld(arr, idxPivot + 1, idxHigh)
    }
}

private fun getLastPivotIndex(arr: IntArray, idxLow: Int, idxHigh: Int): Int {
    var lastIdxSmallerThanPivot = idxLow - 1
    if (idxHigh > idxLow) {
        val idxPivot = Random.nextInt(idxLow, idxHigh + 1)
        val valueAtPivotIdx = arr[idxPivot]
        arr[idxPivot] = arr[idxHigh]
        arr[idxHigh] = valueAtPivotIdx
        for (num in idxLow..idxHigh) {
            if (arr[num] <= valueAtPivotIdx) {
                lastIdxSmallerThanPivot++
                val temp = arr[num]
                arr[num] = arr[lastIdxSmallerThanPivot]
                arr[lastIdxSmallerThanPivot] = temp
            }
        }
        return lastIdxSmallerThanPivot++
    }
    return 0
}

fun performQuicksortNew(arr: IntArray): IntArray {
    if (arr.size >= 2) {
        val pivotIndex = Random.nextInt(0, arr.size)
        val lt = arr.filter { x -> arr.indexOf(x) != pivotIndex && x < arr[pivotIndex] }.toIntArray()
        val gte = arr.filter { x -> arr.indexOf(x) != pivotIndex && x >= arr[pivotIndex] }.toIntArray()
        val pivot = arr.filter { x -> arr.indexOf(x) == pivotIndex }.toIntArray()
        return performQuicksortNew(lt) + pivot + performQuicksortNew(gte)
    }
    return arr

}
