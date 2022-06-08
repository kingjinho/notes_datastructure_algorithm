package algorithms.sort


fun mergeSortOld(arr: IntArray): IntArray {
    if (arr.size > 1) {
        val mid = (0 + arr.lastIndex) / 2
        val leftArr = mergeSortOld(arr.copyOfRange(0, mid + 1))
        val rightArr = mergeSortOld(arr.copyOfRange(mid + 1, arr.lastIndex + 1))

        return mergeOld(leftArr, rightArr)
    }
    return arr
}

private fun mergeOld(arrLeft: IntArray, arrRight: IntArray): IntArray {
    val newArray = IntArray(arrLeft.size + arrRight.size)
    var leftCurIndex = 0
    var rightCurIndex = 0

    for(i in newArray.indices) {
        if(leftCurIndex >= arrLeft.size) {
            newArray[i] = arrRight[rightCurIndex]
            rightCurIndex++
        } else if(rightCurIndex >= arrRight.size) {
            newArray[i] = arrLeft[leftCurIndex]
            leftCurIndex++
        } else if (arrLeft[leftCurIndex] > arrRight[rightCurIndex]) {
            newArray[i] = arrRight[rightCurIndex]
            rightCurIndex++
        } else {
            newArray[i] = arrLeft[leftCurIndex]
            leftCurIndex++
        }
    }

    return newArray
}