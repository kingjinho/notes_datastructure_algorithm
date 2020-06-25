import Sort.performMergeSort
import Sort.performSelectionSort

fun main() {
    var initialArr = intArrayOf(1,5,9,4,3,8)
    var arr = performMergeSort(initialArr, 0, initialArr.size - 1)
    for (i in arr) {
        println(i)
    }

}
