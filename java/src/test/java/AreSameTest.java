import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AreSameTest {

        @Test
        public void should_be_true_when_a_squared_equals_b() {
            int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
            int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
            assertEquals(true, ASquareIsB.comp(a, b));
        }

        @Test
        public void shoud_return_false_when_a_is_empty() {
            int[] a = new int[]{};
            int[] b = new int[]{12, 13, 15, 16};
            assertEquals(false, ASquareIsB.comp(a, b));
        }
}
