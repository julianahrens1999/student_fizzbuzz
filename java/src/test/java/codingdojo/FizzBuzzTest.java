package codingdojo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FizzBuzzTest {
    @Test
    void shouldReturnHelloWorld() {
        // given

        // when
        String actualResult = Fizzbuzz.fizzbuzz();

        // then
        assertEquals("hello world", actualResult);
    }
}
