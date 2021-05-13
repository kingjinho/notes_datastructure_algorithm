package search

fun performBinarySearch(initialArr: Array<Int>, input: Int) : Int? {
    var low = 0
    var high = initialArr.size - 1

    while(low < high){
        var mid = (low + high) / 2
        var guess = initialArr[mid]
        when {
            input > guess  -> {
                low = mid + 1
            }
            input < guess -> {
                high = mid - 1
            }
            else -> {
                return mid
            }
        }
    }
    return null
}