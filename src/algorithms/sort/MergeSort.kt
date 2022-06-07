package algorithms.sort

fun mergeSort(arr: IntArray): IntArray {
    if (arr.size > 1) {
        val mid = (0 + arr.lastIndex) / 2
        val leftArr = mergeSort(arr.copyOfRange(0, mid + 1))
        val rightArr = mergeSort(arr.copyOfRange(mid + 1, arr.lastIndex + 1))

        return merge(leftArr, rightArr)
    }
    return arr
}

private fun merge(arrLeft: IntArray, arrRight: IntArray): IntArray {
    val newArray = IntArray(arrLeft.size + arrRight.size)
    var index = 0
    var leftCurIndex = 0
    var rightCurIndex = 0

    while (index < newArray.size) {
        if(leftCurIndex >= arrLeft.size) {
            newArray[index] = arrRight[rightCurIndex]
            rightCurIndex++
        } else if(rightCurIndex >= arrRight.size) {
            newArray[index] = arrLeft[leftCurIndex]
            leftCurIndex++
        } else if (arrLeft[leftCurIndex] > arrRight[rightCurIndex]) {
            newArray[index] = arrRight[rightCurIndex]
            rightCurIndex++
        } else {
            newArray[index] = arrLeft[leftCurIndex]
            leftCurIndex++
        }
        index++
    }
    return newArray
}