import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HighestLowestIntegerInStringTest {

    @Test
    public void should_return_10_and_5() {
       String testString = "6 6 5 5 10 9 8";
       assertEquals("10 5", HighestLowestIntegerInString.highAndLow(testString));
    }

    @Test
    public void should_return_1_and_1000000() {
        String testString = "1 2 5 4 1000000 99999 8";
        assertEquals("1000000 1", HighestLowestIntegerInString.highAndLow(testString));
    }

    @Test
    public void should_return_1_and_negativ_10() {
        String testString = "1 -5 -4 -3 -2 -10 -2 -3 -7";
        assertEquals("1 -10", HighestLowestIntegerInString.highAndLow(testString));
    }
}
