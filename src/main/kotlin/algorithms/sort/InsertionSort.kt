package algorithms.sort

fun insertionSortAsc(arr: IntArray): IntArray {
    return if (arr.size == 1 || arr.isEmpty()) {
        arr
    } else {

//        1
//        for (i in 1..arr.lastIndex) {
//            var indexToReplace = -1
//            val valueToCompare = arr[i]
//
//            for (j in i - 1 downTo -1) {
//                if (j == -1 || arr[j] <= valueToCompare) {
//                    break
//                } else {
//                    arr[j + 1] = arr[j]
//                    indexToReplace = j
//                }
//            }
//            if (indexToReplace != -1) {
//                arr[indexToReplace] = valueToCompare
//            }
//        }

        //2
        for (i in 1..arr.lastIndex) {

            val valueToCompare = arr[i]
            var position = i - 1

            while (position >= 0) {
                if(arr[position] > valueToCompare) {
                    arr[position + 1] = arr[position]
                    position -= 1
                } else {
                    break
                }
            }

            arr[position + 1] = valueToCompare
        }
        arr
    }
}

fun insertionSortDesc(arr: IntArray): IntArray {
    return if (arr.size == 1 || arr.isEmpty()) {
        arr
    } else {
        for (i in arr.lastIndex - 1 downTo 0) {
            val valueToCompare = arr[i]
            var position = i + 1

            while(position <= arr.lastIndex) {
                if(arr[position] > valueToCompare) {
                    arr[position - 1] = arr[position]
                    position += 1
                } else {
                    break
                }
            }
            arr[position - 1] = valueToCompare
        }

        arr
    }
}