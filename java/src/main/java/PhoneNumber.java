public class PhoneNumber {
    public static String createPhoneNumber(int[] numbers) {
        if (numbers.length != 10) {
            return "";
        }
        for(int number: numbers) {
            if (number > 9 || number < 0) {
                return "";
            }
        }
        return buildString(numbers);
    }

    public static String buildString(int[] numbers) {
        String resultString = "(" +
                numbers[0] + numbers[1] + numbers[2] +
                ") " +
                numbers[3] + numbers[4] + numbers[5] +
                "-" +
                numbers[6] + numbers[7] + numbers[8] + numbers[9];
        return resultString;
    }
}
