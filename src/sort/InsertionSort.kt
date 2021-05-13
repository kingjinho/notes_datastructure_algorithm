package sort

fun performInsertionSort(arr: IntArray) {
    for (i in 1 until arr.size) {
        for (j in (i - 1) downTo 1) {
            if (arr[j - 1] > arr[j]) {
                val temp = arr[j - 1]
                arr[j - 1] = arr[j]
                arr[j] = temp
            } else
                continue
        }
    }
}