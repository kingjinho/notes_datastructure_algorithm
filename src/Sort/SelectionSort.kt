package Sort

//1,5,8,5,4,3,1,7,5
fun performSelectionSort(arr: Array<Int>): Array<Int> {
    for (i in arr.indices) {
        var idxMin = i
        for (j in i + 1 until arr.size) {
            if (arr[idxMin] > arr[j]) {
                idxMin = j
            }
        }
        var temp = arr[i]
        arr[i] = arr[idxMin]
        arr[idxMin] = temp
    }
    return arr
}