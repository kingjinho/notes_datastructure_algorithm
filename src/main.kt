import Sort.performHeapSort
import Sort.performMergeSort
import Sort.performQuickSort
import Sort.performSelectionSort

fun main() {
    var initialArr = intArrayOf(1,5,9,4,3,8)
    val lastIndex = initialArr.lastIndex
    performHeapSort(initialArr, if(lastIndex % 2 == 1) lastIndex else lastIndex - 1)
    println("result -----")
    for (i in initialArr) {
        println(i)
    }

}
