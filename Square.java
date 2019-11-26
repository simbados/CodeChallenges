public class Square {

    public int squareDigits(int n) {
        String nAsString = "" + n;
        String result = "";
        for (int i = 0; i < nAsString.length(); i++) {
            char tempChar = nAsString.charAt(i);
            int square = Math.multiplyExact(Character.getNumericValue(tempChar), Character.getNumericValue(tempChar));
            result += square;
        }
        return Integer.parseInt(result);
    }
}
