package algorithms.sort

fun insertionSortAsc(arr: IntArray): IntArray {
    for (i in arr.indices) {
        inner@ for (j in i downTo 1) {
            if (arr[j] >= arr[j - 1]) {
                break@inner
            }
            val temp = arr[j]
            arr[j] = arr[j - 1]
            arr[j - 1] = temp
        }
    }
    return arr
}

fun insertionSortDesc(arr: IntArray): IntArray{
    for (i in arr.indices) {
        inner@ for (j in i downTo 1) {
            if (arr[j] <= arr[j - 1]) {
                break@inner
            }
            val temp = arr[j]
            arr[j] = arr[j - 1]
            arr[j - 1] = temp
        }
    }
    return arr
}