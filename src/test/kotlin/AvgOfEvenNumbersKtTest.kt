import algorithms.problem.getAvgOfEvenNumbers
import com.google.common.truth.Truth.assertThat
import org.junit.jupiter.api.Test

class AvgOfEvenNumbersKtTest {
    @Test
    fun `avg of even numbers in a given array of 1,2,3,4,5,6,7,8,9 is equal to 5`() {
        val array = intArrayOf(1,2,3,4,5,6,7,8,9)
        val avg = getAvgOfEvenNumbers(array)
        assertThat(avg).isEqualTo(5.0)
    }

    @Test
    fun `avg of even numbers in a given array of 1,3,5,7,9 is equal to POSITIVE_INTIFINITY`() {
        val array = intArrayOf(1,3,5,7,9)
        val avg = getAvgOfEvenNumbers(array)
        assertThat(avg).isEqualTo(Double.POSITIVE_INFINITY)
    }

    @Test
    fun `avg of even numbers in a given array of 1,3,5,7,9 is equal to five tenth`() {
        val array = intArrayOf(-2, 0, 2, 4)
        val avg = getAvgOfEvenNumbers(array)
        assertThat(avg).isEqualTo(1.0)
    }

}