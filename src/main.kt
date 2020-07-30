import Algorithms.Sort.*
import kotlin.random.Random

fun main() {
    var initialArr = intArrayOf(1,5,9,4,3,8)
    performShellSort(initialArr, Random.nextInt(2, initialArr.size -1))
    println("result -----")
    for (i in initialArr) {
        println(i)
    }

}
