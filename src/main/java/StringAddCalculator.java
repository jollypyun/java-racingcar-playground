import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringAddCalculator {
    private static String DELIMITER = ",|:";
    public static int splitAndSum(String text) {
        int result = 0;

        if (text == null || text.isEmpty()){
            return result;
        }

        Matcher m = Pattern.compile("//(.*)\n(.*)").matcher(text);
        if (m.find()) {
            addDelimiter(m.group(1));
            text = m.group(2);
        }

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
