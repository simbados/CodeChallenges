import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PhoneNumberTest {

    @Test
    public void should_return_correct_format_when_receiving_valid_input() {
        assertEquals("(123) 456-7890", PhoneNumber.createPhoneNumber(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void should_return_empty_string_when_array_length_not_10() {
        assertEquals("", PhoneNumber.createPhoneNumber(new int[]{1, 2, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void should_return_empty_string_when_number_in_array_negativ() {
        assertEquals("", PhoneNumber.createPhoneNumber(new int[]{1, 2, -1, 4, 5, 6, 7, 8, 9, 0}));
    }

    @Test
    public void should_return_empty_string_when_number_in_array_bigger_9() {
        assertEquals("", PhoneNumber.createPhoneNumber(new int[]{1, 2, 10, 4, 5, 6, 7, 8, 9, 0}));
    }

}
