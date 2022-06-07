package algorithms.sort

import org.junit.Test
import kotlin.random.Random

class SortTest {


    @Test
    fun `bubble sort in ascending`() {
        var array = intArrayOf(3,5,7,9,1,6)
        array = bubbleSortAsc(array)
        assert(array[0] == 1)
        assert(array[1] == 3)
        assert(array[2] == 5)
        assert(array[3] == 6)
        assert(array[4] == 7)
        assert(array[5] == 9)
    }

    @Test
    fun `bubble sort in descending`() {
        var array = intArrayOf(3,5,7,9,1,6)
        array = bubbleSortDesc(array)
        assert(array[0] == 9)
        assert(array[1] == 7)
        assert(array[2] == 6)
        assert(array[3] == 5)
        assert(array[4] == 3)
        assert(array[5] == 1)
    }

    @Test
    fun `selection sort in ascending`() {
        var array = intArrayOf(3,6,4,7,8,9,1)
        array = selectionSortAsc(array)
        assert(array[0] == 1)
        assert(array[1] == 3)
        assert(array[2] == 4)
        assert(array[3] == 6)
        assert(array[4] == 7)
        assert(array[5] == 8)
        assert(array[6] == 9)
    }

    @Test
    fun `selection sort in descending`() {
        var array = intArrayOf(3,6,4,7,8,9,1)
        array = selectionSortDesc(array)
        assert(array[0] == 9)
        assert(array[1] == 8)
        assert(array[2] == 7)
        assert(array[3] == 6)
        assert(array[4] == 4)
        assert(array[5] == 3)
        assert(array[6] == 1)
    }

    @Test
    fun `insertion sort in ascending`() {
        var array = intArrayOf(3,6,4,7,8,9,1)
        array = insertionSortAsc(array)
        assert(array[0] == 1)
        assert(array[1] == 3)
        assert(array[2] == 4)
        assert(array[3] == 6)
        assert(array[4] == 7)
        assert(array[5] == 8)
        assert(array[6] == 9)
    }

    @Test
    fun `insertion sort in descending`() {
        var array = intArrayOf(3,6,4,7,8,9,1)
        array = insertionSortDesc(array)
        assert(array[0] == 9)
        assert(array[1] == 8)
        assert(array[2] == 7)
        assert(array[3] == 6)
        assert(array[4] == 4)
        assert(array[5] == 3)
        assert(array[6] == 1)
    }

    @Test
    fun `quick sort in descending`() {
        var array = IntArray(10) {
            Random.nextInt(1, 10)
        }
        //var array = intArrayOf(3,6,4,7,8,9,1)
        array = performQuickSortOld(array,0, array.size -1)
        assert(array[0] == 1)
        assert(array[1] == 3)
        assert(array[2] == 4)
        assert(array[3] == 6)
        assert(array[4] == 7)
        assert(array[5] == 8)
        assert(array[6] == 9)
    }

    @Test
    fun `merge sort in descending`() {
        var array = IntArray(10) {
            Random.nextInt(1, 10)
        }
        val copiedArray = array.copyOf().sortedArray()
        //var array = intArrayOf(3,6,4,7,8,9,1)
        array = mergeSort(array)
        assert(array[0] == copiedArray[0])
        assert(array[1] == copiedArray[1])
        assert(array[2] == copiedArray[2])
        assert(array[3] == copiedArray[3])
        assert(array[4] == copiedArray[4])
        assert(array[5] == copiedArray[5])
        assert(array[6] == copiedArray[6])
        assert(array[7] == copiedArray[7])
        assert(array[8] == copiedArray[8])
        assert(array[9] == copiedArray[9])

    }
}