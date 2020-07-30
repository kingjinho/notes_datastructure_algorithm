package Sort

fun performShellSort(arr: IntArray, distance: Int) {

    if (distance > 0) {
        for (i in arr.indices step distance) {
            if (i + distance <= arr.size - 1) {
                if (arr[i] > arr[i + distance]) {
                    val temp = arr[i]
                    arr[i] = arr[i + distance]
                    arr[i + distance] = temp
                }
            }
        }
        performShellSort(arr, (distance / 2))
    }
}