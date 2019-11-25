import java.util.Locale;
import java.util.regex.Pattern;
/*
    return true iff occurences x == o (case insensitive)
    and true iff no occurences
 */
public class XO {

    public static boolean getXO(String str) {
        String lowerCaseStr = str.toLowerCase();
        if (!lowerCaseStr.contains("x") && !lowerCaseStr.contains("o")) {
            return true;
        }
        long countX = lowerCaseStr.chars().filter(character -> character == 'x').count();
        long countY = lowerCaseStr.chars().filter(character -> character == 'o').count();
        return countX == countY;
    }
    public static void main(String[] args) {
        System.out.println(XO.getXO("xxOoxo"));
    }
}
