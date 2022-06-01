package algorithms.sort

import org.junit.Test

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
}