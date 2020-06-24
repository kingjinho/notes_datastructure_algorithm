import Sort.performSelectionSort

fun main() {

    var i = 5
    var arr = performSelectionSort(arrayOf(1,5,8,5,4,3,1,7,5))
    for (i in arr) {
        println(i)
    }
}
