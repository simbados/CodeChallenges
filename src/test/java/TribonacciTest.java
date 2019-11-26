import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TribonacciTest {

    @Test
    public void should_return_empty_array_when_n_0() {
        double[] expected = new double[]{};
        assertArrayEquals(expected, Xbonacci.tribonacci(new double[]{1, 1, 1}, 0));
    }

    @Test
    public void should_return_correct_array_when_input_valid() {
        double[] expected = new double[]{1, 1, 1, 3, 5, 9, 17, 31};
        assertArrayEquals(expected, Xbonacci.tribonacci(new double[]{1, 1, 1}, 8));
    }

    @Test
    public void should_return_valid_array_when_n_1() {
        double[] expected = new double[]{1};
        assertArrayEquals(expected, Xbonacci.tribonacci(new double[]{1, 1, 1}, 1));
    }

    @Test
    public void should_return_valid_array_when_n_2() {
        double[] expected = new double[]{1, 1};
        assertArrayEquals(expected, Xbonacci.tribonacci(new double[]{1, 1, 1}, 2));
    }

    @Test
    public void should_return_valid_array_when_n_3() {
        double[] expected = new double[]{1, 1, 1};
        assertArrayEquals(expected, Xbonacci.tribonacci(new double[]{1, 1, 1}, 3));
    }
}
