package algorithms.sort

fun insertionSortAsc(arr: IntArray): IntArray {
//    for (i in 1 until arr.size) {
// method 1
//        for (j in i downTo 1) {
//            if (arr[j] >= arr[j - 1]) {
//                break
//            }
//            val temp = arr[j]
//            arr[j] = arr[j - 1]
//            arr[j - 1] = temp
//        }
// method 2
//        var j: Int = i
//
//        while(j >= 1) {
//            if(arr[j] >= arr[j -1]) {
//                break
//            }
//            val temp = arr[j]
//            arr[j] = arr[j - 1]
//            arr[j - 1] = temp
//            j--
//        }
//    }

//method 3
    for (i in arr.indices) {
        val key = arr[i]
        var j: Int = i - 1

        while (j >= 0 && arr[j] > key) {
            arr[j + 1] = arr[j]
            j--
        }
        arr[j + 1] = key
    }
    return arr
}

fun insertionSortDesc(arr: IntArray): IntArray {
    for (i in arr.indices) {
//        for (j in i downTo 1) {
//            if (arr[j] <= arr[j - 1]) {
//                break
//            }
//            val temp = arr[j]
//            arr[j] = arr[j - 1]
//            arr[j - 1] = temp
//        }
        var j: Int = i
        while (j >= 1) {
            if (arr[j] <= arr[j - 1]) {
                break
            }
            val temp = arr[j]
            arr[j] = arr[j - 1]
            arr[j - 1] = temp
            j--
        }
    }
    return arr
}