import algorithms.sort.performHeapSort

fun main() {
    val initialArr = intArrayOf(1,5,9,4,3,8)
    val lastIndex = initialArr.lastIndex
    performHeapSort(initialArr, if(lastIndex % 2 == 1) lastIndex else lastIndex - 1)
    println("result -----")
    for (i in initialArr) {
        println(i)
    }

}
