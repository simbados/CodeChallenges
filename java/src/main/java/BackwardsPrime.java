public class BackwardsPrime {
    public static String backwardsPrime(long start, long end) {
        if (start > end) return "";
        StringBuilder backwardPrimes = new StringBuilder();
        for(long i = start; i <= end; i++) {
            if (i > 10 && isPrime(i) && isBackwardPrime(i)) {
                backwardPrimes.append(i);
                backwardPrimes.append(" ");
            }
        }
        return backwardPrimes.toString().equals("") ? "" : backwardPrimes.substring(0, backwardPrimes.length()-1);
    }

    private static boolean isBackwardPrime(long input) {
        long reversed = 0;
        long remainder = input;
        while(remainder > 0) {
           long digit = remainder % 10;
           reversed = reversed * 10 + digit;
           remainder /= 10;
        }
        if(reversed == input) {
            return false;
        }
        return isPrime(reversed);
    }

    private static boolean isPrime(long n) {
        if(n <= 1 || n % 2 == 0) {
            return false;
        }
        for(int i = 3; i <= n/2; i += 2) {
            if(n%i == 0) {
               return false;
            }
        }
        return true;
    }
}
