import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BackwardsPrimeTest {

    @Test
    public void should_return_correct_backward_prime_string_when_given_valid_input() {
        String expectedOutput = "13 17 31 37 71 73 79 97";
        assertEquals(expectedOutput, BackwardsPrime.backwardsPrime(12, 98));
    }

    @Test
    public void should_return_empty_string_when_given_range_without_valid_backward_prime() {
        String expectedOutput = "";
        assertEquals(expectedOutput, BackwardsPrime.backwardsPrime(18, 30));
    }
}
