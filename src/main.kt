import algorithms.sort.bubbleSortAsc
import algorithms.sort.bubbleSortDesc
import algorithms.sort.bubbleSortDesc2


fun main() {
    val initialArr = intArrayOf(1,5,9,4,3,8)
    val lastIndex = initialArr.lastIndex
    bubbleSortDesc2(initialArr)
    println("result -----")
    for (i in initialArr) {
        println(i)
    }

}
