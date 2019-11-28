import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.DoubleStream;

public class Xbonacci {
    public static double[] tribonacci(double[] s, int n) {
        if (n == 0) {
            return new double[]{};
        }
        if(n < 3) {
            double[] edgeCase = new double[n];
            for(int counter = 0; counter < n; counter++) {
                edgeCase[counter] = s[counter];
            }
            return edgeCase;
        }
        List<Double> result = DoubleStream.of(s).boxed().collect(Collectors.toList());
        for(int i = 0; i < n-3; i++) {
            result.add(result.get(i) + result.get(i+1)+ result.get(i+2));
        }
        return result.stream().mapToDouble(Double::doubleValue).toArray();
    }
}
