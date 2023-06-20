package algorithms.search

fun binarySearchWhile(arr: Array<Int>, value: Int): Int {
    var low = 0
    var high = arr.size - 1

    while (low < high) {
        val mid = (low + high) / 2
        val valueAtMid = arr[mid]
        when {
            value > valueAtMid -> {
                low = mid + 1
            }
            value < valueAtMid -> {
                high = mid - 1
            }
            else -> {
                return mid
            }
        }
    }
    return -1
}

fun binarySearchRecursive(arr: Array<Int>, left: Int, right: Int, value: Int): Int {
    val mid = (left + right) / 2
    return when {
        left > right -> {
            -1
        }
        arr[mid] > value -> {
            binarySearchRecursive(arr, left, mid - 1, value)
        }
        arr[mid] < value -> {
            binarySearchRecursive(arr, mid + 1, right, value)
        }
        arr[mid] == value -> {
            mid
        }
        else -> {
            -1
        }
    }
}

fun binarySearchCircularArray(arr: Array<Int>, left: Int, right: Int, value: Int): Int {
    val mid = (left + right) / 2

    return when {
        left > right -> {
            -1
        }
        arr[mid] == value -> {
            mid
        }
        arr[left] < arr[mid] -> {
           if(value >= arr[left] && value <= arr[mid]) {
               binarySearchCircularArray(arr, left, mid -1, value)
           } else {
               binarySearchCircularArray(arr, mid + 1, right, value)
           }
        }
        arr[mid] < arr[right] -> {
            if(value >= arr[mid] && value <= arr[right]) {
                binarySearchCircularArray(arr, mid + 1, right, value)
            } else {
                binarySearchCircularArray(arr, left, mid -1, value)
            }
        }
        else -> {
            -1
        }
    }
}

