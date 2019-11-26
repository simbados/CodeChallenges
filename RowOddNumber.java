class RowOddNumber {

    public static int rowSumOddNumbers(int n) {
        if (n == 1) {
            return 1;
        }
        int counter = (n * (n-1)) + 1;
        int rowValue = counter;
        System.out.println("startvalue " + counter);
        for(int i = 1; i < n; i++) {
            rowValue += 2;
            counter = rowValue + counter;
            System.out.println("Zwischenvalue " + counter);
        }
        return counter;
    }

    public static void main(String[] args) {
        int result = RowOddNumber.rowSumOddNumbers(4);
        System.out.println(result);
    }
}
