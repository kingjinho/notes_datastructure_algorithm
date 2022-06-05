package algorithms.search

import org.junit.After
import org.junit.Assert.*
import org.junit.Before
import org.junit.Test

class BinaryKtTest {

    private lateinit var array: Array<Int>

    @Before
    fun setup() {
        array = arrayOf(4,5,6,7,8,1,2,3)
    }

    @Test
    fun binarySearchTest() {
        val indexOfFive = binarySearchRecursive(array, 0, array.size - 1, 5)
        assert(indexOfFive == 4)
    }


    @Test
    fun circularBinarySearchTest() {
        val indexOfFive = binarySearchCircularArray(array, 0, array.size - 1, 5)
        assert(indexOfFive == 2)
    }
}