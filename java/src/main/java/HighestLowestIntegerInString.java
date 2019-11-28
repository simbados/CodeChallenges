import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HighestLowestIntegerInString {
    public static String highAndLow(String numbers) {
        String[] splits = numbers.split("[ ]");
        List<Integer> splitList = new ArrayList<>();
        for(String split: splits) {
            splitList.add(Integer.parseInt(split));
        }
        Collections.sort(splitList);
        return "" + splitList.get(splitList.size()-1) + " " + splitList.get(0);
    }
}
