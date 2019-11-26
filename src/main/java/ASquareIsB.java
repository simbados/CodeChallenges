import java.lang.Integer;
import java.lang.Math;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ASquareIsB {

    public static boolean comp(int[] a, int[] b) {
        if(a.length == 0 && b.length == 0) return true;
        if(a.length == 0 || b.length == 0 || a == null || b == null || a.length != b.length) {
            return false;
        }
        List<Integer> squaredAsList = Arrays.stream(b).boxed().collect(Collectors.toList());

        for(int i = 0; i < a.length; i++) {
            int squared = Math.multiplyExact(a[i], a[i]);
            if(squaredAsList.remove((Integer) squared) == false) {
                return false;
            }
        }
        return true;
    }
}

