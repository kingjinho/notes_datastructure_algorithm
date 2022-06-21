package algorithms.sort

//intArrayOf(1,5,9,4,3,8)
fun heapSort(arr: IntArray) {
    val length = arr.size

    for (i in length / 2 - 1 downTo 0)
        heapify(arr, length, i)

    for (i in arr.lastIndex downTo 1) {
        val temp = arr[0]
        arr[0] = arr[i]
        arr[i] = temp
        heapify(arr, i, 0)
    }
}

fun heapify(arr: IntArray, length: Int, idxParent: Int) {

    var largest = idxParent
    val left = (idxParent * 2) + 1
    val right = (idxParent * 2) + 2

    if (left < length && arr[left] > arr[largest]) {
        largest = left
    }
    if (right < length && arr[right] > arr[largest]) {
        largest = right
    }

    if (largest != idxParent) {
        val temp = arr[idxParent]
        arr[idxParent] = arr[largest]
        arr[largest] = temp

        heapify(arr, length, largest) // top-down if changed
    }
}
