package Sort

fun performMergeSort(arr: IntArray, low: Int, high: Int): IntArray {
    if (low < high && high - low > 0) {
        var middle = low + (high - low) / 2
        var arrLow = performMergeSort(arr.copyOfRange(low, middle + 1), 0, middle)
        var arrHigh = performMergeSort(arr.copyOfRange(middle + 1, high + 1), 0, high - middle - 1)

        return merge(arrLow, arrHigh)
    }
    return arr
}

fun merge(arrLow: IntArray, arrHigh: IntArray): IntArray {
    var curIdxForArrLow = 0
    var curIdxForArrHigh = 0
    var curIdxForArrResult = 0

    var arrResult = IntArray(arrLow.size + arrHigh.size)

    while (curIdxForArrLow < arrLow.size && curIdxForArrHigh < arrHigh.size) {
        if (arrLow[curIdxForArrLow] < arrHigh[curIdxForArrHigh]) {
            arrResult[curIdxForArrResult] = arrLow[curIdxForArrLow]
            curIdxForArrLow++
        } else {
            arrResult[curIdxForArrResult] = arrLow[curIdxForArrHigh]
            curIdxForArrHigh++
        }
        curIdxForArrResult++
    }

    if (curIdxForArrLow == arrLow.size) {
        for (num in curIdxForArrHigh until arrHigh.size) {
            arrResult[curIdxForArrResult] = arrHigh[curIdxForArrHigh]
            curIdxForArrResult++
        }
    } else if (curIdxForArrHigh == arrLow.size) {
        for (num in curIdxForArrLow until arrLow.size) {
            arrResult[curIdxForArrResult] = arrHigh[curIdxForArrLow]
            curIdxForArrResult++
        }
    }
    return arrResult
}