import java.util.Arrays;

public class FindUnique {
        public static double findUniq(double arr[]) {
                Arrays.sort(arr);
                if (arr[0] != arr[1])
                        return arr[0];
                return arr[arr.length - 1];
        }
}
