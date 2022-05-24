package algorithms.sort

//1,5,8,5,4,3,1,7,5
fun performSelectionSort1(inputArr: Array<Int>): Array<Int> {

    var resultArr = IntArray(inputArr.size)
    //Method 1 - Using new Array
    for (i in inputArr.indices) {
        //key
        var smallestIndex = i
        var smallestNumber = inputArr[i]

        for (j in i until inputArr.size) {
            if (inputArr[j] < smallestNumber) {
                smallestIndex = j
                smallestNumber = inputArr[j]
            }
        }
        resultArr[i] = smallestNumber
    }
    return inputArr
}

fun performSelectionSort2(inputArr: Array<Int>): Array<Int> {
    //method 2
    for (i in inputArr.indices) {
        var smallestIndex = i
        var smallestNumber = inputArr[i]
        for (j in i until inputArr.size) {
            if (inputArr[j] < smallestNumber) {
                smallestIndex = j
                smallestNumber = inputArr[j]
            }
        }
        var temp = inputArr[i]
        inputArr[i] = smallestNumber
        inputArr[smallestIndex] = temp
    }

    return inputArr
}