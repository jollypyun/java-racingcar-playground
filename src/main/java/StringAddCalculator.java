import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.util.regex.Pattern.compile;

public class StringAddCalculator {
    private static String DELIMITER = ",|:";
    public static int splitAndSum(String text) {
        if (text == null || text.isEmpty()){
            return 0;
        }
        return splitNotZero(text);
    }

    private static int splitNotZero(String text) {
        Matcher m = compile("//(.*)\n(.*)").matcher(text);
        if (m.find()) {
            addDelimiter(m.group(1));
            text = m.group(2);
        }
        checkEquation(text);
        return checkTokens(text);
    }

    private static void checkEquation(String text) {
        if(!text.matches("[0-9-].*") || !text.matches(".*[0-9-]")) {
            throw new RuntimeException("불완전식");
        }
    }

    private static int checkTokens(String text) {
        int result = 0;
        String[] tokens = text.split(DELIMITER);
        for (String s : tokens) {
            int num = checkNumber(s);
            result += num;
        }
        return result;
    }

    private static int checkNumber(String s) {
        int number = Integer.parseInt(s);
        if (number < 0) {
            throw new RuntimeException("음수입니다.");
        }
        return number;
    }

    private static void addDelimiter(String customDelimiter) {
        String[] custom = customDelimiter.split("");
        for (String s : custom) {
            DELIMITER += "|" + s;
        }
    }
}
