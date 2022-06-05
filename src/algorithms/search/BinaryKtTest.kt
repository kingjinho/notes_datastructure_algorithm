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
        val indexOfOne = binarySearchCircularArray(array, 0, array.size - 1, 1)
        val indexOfTwo = binarySearchCircularArray(array, 0, array.size - 1, 2)
        val indexOfThree = binarySearchCircularArray(array, 0, array.size - 1, 3)
        val indexOfFour = binarySearchCircularArray(array, 0, array.size - 1, 4)
        val indexOfFive = binarySearchCircularArray(array, 0, array.size - 1, 5)
        val indexOfSix = binarySearchCircularArray(array, 0, array.size - 1, 6)
        val indexOfSeven = binarySearchCircularArray(array, 0, array.size - 1, 7)
        val indexOfEight = binarySearchCircularArray(array, 0, array.size - 1, 8)
        assert(indexOfOne == 5)
        assert(indexOfTwo == 6)
        assert(indexOfThree == 7)
        assert(indexOfFour == 0)
        assert(indexOfFive == 1)
        assert(indexOfSix == 2)
        assert(indexOfSeven == 3)
        assert(indexOfEight == 4)

    }
}