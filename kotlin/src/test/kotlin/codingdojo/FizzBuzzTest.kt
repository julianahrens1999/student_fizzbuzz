package codingdojo;

import org.junit.Test
import kotlin.test.assertEquals

class FizzBuzzTest {
    @Test
    fun `should return hello world`() {
        // given

        // when
        val actualResult = fizzbuzz()

        // then
        assertEquals("hello world", actualResult)
    }
}
