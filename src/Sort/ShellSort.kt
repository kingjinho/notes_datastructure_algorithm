package Sort

fun performShellSort(arr: IntArray, distance: Int) {

    if (distance > 0) {
        for (i in arr.indices) {
            for (j in i downTo 1 step distance) {
                if (j - distance >= 0 && arr[j - distance] > arr[j]) {
                    val temp = arr[j - distance]
                    arr[j - distance] = arr[j]
                    arr[j] = temp
                } else
                    continue
            }
        }
        performShellSort(arr, (distance / 2))
    }
}