package Sort

fun performMergeSort(low: Int, high: Int) {
    if (low < high) {
        var middle = low + (high-low) / 2
        performMergeSort(low, middle)
        performMergeSort(middle + 1, high)

        merge(low, middle, high)
    }
}

fun merge(low: Int, middle: Int, high: Int) {
    for (num in low..high) {
        helper[num] = numbers[num]
    }

    var i = low
    var j = middle + 1
    var k = low

    while (i <= middle && j <= high) {
        if (helper[i] <= helper[j]) {
            numbers[k] = helper[i]
            i++;
        } else {
            numbers[k] = helper[j]
            j++
        }
        k++
    }

    while (i <= middle) {
        numbers[k] = helper[i]
        k++
        i++
    }
}