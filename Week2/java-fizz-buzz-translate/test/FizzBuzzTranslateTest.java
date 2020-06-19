import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FizzBuzzTest {

    @Test
    @DisplayName("Test less than 0")
    void processNegative() {
        int input = -3;
        String expected = "Out of Range!";
        FizzBuzz app = new FizzBuzz();
        String actual = app.process(input);
        assertEquals(expected,actual);
    }
    @Test
    @DisplayName("Test divide by 3")
    void processDevideBy3() {
        int input = 3;
        String expected = "Fizz";
        FizzBuzz app = new FizzBuzz();
        String actual = app.process(input);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test divide by 5")
    void processDevideBy5() {
        int input = 5;
        String expected = "Buzz";
        FizzBuzz app = new FizzBuzz();
        String actual = app.process(input);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test divide by 5 and 3")
    void processDevideBy15() {
        int input = 15;
        String expected = "FizzBuzz";
        FizzBuzz app = new FizzBuzz();
        String actual = app.process(input);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test divide by none")
    void processDevideByNone() {
        int input = 13;
        String expected = "13";
        FizzBuzz app = new FizzBuzz();
        String actual = app.process(input);
        assertEquals(expected,actual);
    }

    @Test
    @DisplayName("Test divide by none")
    void processDevideBy99() {
        int input = 99;
        String expected = "Fizz";
        FizzBuzz app = new FizzBuzz();
        String actual = app.process(input);
        assertEquals(expected,actual);
    }
}