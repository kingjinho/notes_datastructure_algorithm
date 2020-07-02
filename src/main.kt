import Sort.performMergeSort
import Sort.performQuickSort
import Sort.performSelectionSort

fun main() {
    var initialArr = intArrayOf(1,5,9,4,3,8)
    performQuickSort(initialArr, 0, initialArr.size - 1)
    println("result -----")
   /* for (i in initialArr) {
        println(i)
    }*/

}
