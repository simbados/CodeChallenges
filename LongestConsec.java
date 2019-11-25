/*
Find longest consecutive String of k strings in strarr
 */
class LongestConsec {

    public static String longestConsec(String[] strarr, int k) {
        int n = strarr.length;
        if(n == 0 || k > n || k <= 0) {
            return "";
        }
        String longestConsecutive = "";
        String toCompare = "";
        for(int i = 0; i <= n-k; i++) {
            toCompare = "";
            for(int j = 0; j < k; j++) {
                toCompare += strarr[i+j];
                if((j == k-1) && (toCompare.length() > longestConsecutive.length())) {
                    longestConsecutive = toCompare;
                }
            }
        }
        return longestConsecutive;
    }
}
