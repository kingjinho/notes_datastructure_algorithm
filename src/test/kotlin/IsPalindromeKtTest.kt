import algorithms.problem.isPalindrome
import com.google.common.truth.Truth.assertThat
import org.junit.Test

class IsPalindromeKtTest {

    @Test
    fun`string deified is a palindrome`() {
        assertThat(isPalindrome("deified")).isTrue()
    }

    @Test
    fun`string racecar is a palindrome`() {
        assertThat(isPalindrome("racecar")).isTrue()
    }

    @Test
    fun`string kayak is a palindrome`() {
        assertThat(isPalindrome("kayak")).isTrue()
    }

    @Test
    fun`empty string is not a palindrome`() {
        assertThat(isPalindrome("")).isFalse()
    }


}