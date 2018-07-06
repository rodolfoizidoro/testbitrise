package rodolfo.com.bitrise

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {
    @Test
    @Throws(Exception::class)
    fun add_isCorrect() {
        assertEquals(4, Utils.addNumbers(2, 2))
    }

    @Test
    @Throws(Exception::class)
    fun add_twodigits_isCorrect() {
        assertEquals(44, Utils.addNumbers(22, 22))
    }

    @Test
    @Throws(Exception::class)
    fun add_big_isCorrect() {
        assertEquals(4444, Utils.addNumbers(2222, 2222))
    }
}
