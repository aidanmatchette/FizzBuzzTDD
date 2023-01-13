import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class FizzBuzzTests {
    private FizzBuzz fb;

    @BeforeEach
    void setUp() {
        fb = new FizzBuzz();
    }

    @Test
    void numberDivisibleByThree() {
        String EXPECTED = "Fizz";
        int NUM = 3;

        String actual = fb.convert(NUM);

        assertEquals(EXPECTED, actual);

    }

    @Test
    void numberDivisibleByFive() {
        String EXPECTED = "Buzz";
        int NUM = 5;

        String actual = fb.convert(NUM);

        assertEquals(EXPECTED, actual);
    }

    @Test
    void numberDivisibleByThreeAndFive() {
        String EXPECTED = "FizzBuzz";
        int NUM = 15;

        String actual = fb.convert(NUM);

        assertEquals(EXPECTED, actual);
    }

    @Test
    void notDivisible() {
        assertEquals("7", fb.convert(7));
    }
}
