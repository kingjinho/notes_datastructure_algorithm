import algorithms.sort.selectionSortAsc
import algorithms.sort.selectionSortDesc
import org.junit.Test

import org.junit.Assert.*

class SelectionSortKtTest {

    @Test
    fun `value at index 0 of sorted integer array of 1,4,7,9,0 in selection sort ascending returns 0`() {
        val array = intArrayOf(1,4,7,9,0)
        selectionSortAsc(array)

        assert(array[0] == 0)
    }

    @Test
    fun `value at index 0 of sorted integer array of 1,4,7,9,0 in selection sort ascending returns 9`() {
        val array = intArrayOf(1,4,7,9,0)
        selectionSortDesc(array)

        assertEquals(9, array[0])
    }
}