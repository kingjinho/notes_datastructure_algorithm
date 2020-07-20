package Sort

fun performShellSort(arr: IntArray, distance: Int) {

    if (distance == 1)
        performInsertionSort(arr)
    else {
        for (i in arr.indices step distance) {
            if (i - distance < 0 || i + distance <= arr.size - 1) {
                if (arr[i] > arr[i + distance]) {
                    val temp = arr[i]
                    arr[i] = arr[i + distance]
                    arr[i + distance] = temp
                }
            }
        }
        performShellSort(arr, (distance / 2) + 1)
    }
}