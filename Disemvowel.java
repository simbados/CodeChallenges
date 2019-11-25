/*
Class for disemvowel a string
best solution:
str.replaceAll("(?i)[aeiou]", "");
 */

public class Disemvowel {
    public static String disemvowel(String str) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            if (!isVowel(temp)) {
                String charAsString = "" + temp;
                result = result.concat(charAsString);
            }
        }
        return result;
    }

    private static boolean isVowel(char s) {
        if (s == 'a' || s == 'e' || s == 'i' || s == 'o' || s == 'u'
                || s == 'A' || s == 'E' || s == 'I' || s == 'o' || s == 'U') {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(Troll.disemvowel("This is a test"));
    }
}

