import algorithms.sort.*
import org.junit.Test
import kotlin.random.Random
import kotlin.test.assertEquals

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
        array = quickSort(array,0, array.size -1)
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
        val array = IntArray(10) {
            Random.nextInt(1, 10)
        }
        val newArray = IntArray(10)
        val sortedArray = array.sortedArray()
        mergeSortNew(array, newArray, 0, array.lastIndex)
        assert(sortedArray[0] == newArray[0])
        assert(sortedArray[1] == newArray[1])
        assert(sortedArray[2] == newArray[2])
        assert(sortedArray[3] == newArray[3])
        assert(sortedArray[4] == newArray[4])
        assert(sortedArray[5] == newArray[5])
        assert(sortedArray[6] == newArray[6])
        assert(sortedArray[7] == newArray[7])
        assert(sortedArray[8] == newArray[8])
        assert(sortedArray[9] == newArray[9])

    }

    @Test
    fun `sorted of array of 4,2,7,1,3 with selection sort in ascending order returns 7 at index 4`() {

        val arr = intArrayOf(4,2,7,1,3)
        insertionSortAsc(arr)
        assertEquals(7, arr[4])

    }

    @Test
    fun `sorted of array of 4,2,7,1,3 with selection sort descending order returns 7 at index 4`() {

        val arr = intArrayOf(4,2,7,1,3)
        insertionSortDesc(arr)
        assertEquals(7, arr[4])

    }

}