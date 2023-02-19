import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringAddCalculatorTest {
    @Test
    void splitAndSumNullAndEmpty() {
        int result = StringAddCalculator.splitAndSum("");
        assertThat(result).isZero();

        result = StringAddCalculator.splitAndSum(null);
        assertThat(result).isZero();
    }

    @Test
    void splitAndSumOneNumber() {
        int result = StringAddCalculator.splitAndSum("1");
        assertThat(result).isEqualTo(1);
    }

    @Test
    void splitAndSumDelimiterComma() {
        int result = StringAddCalculator.splitAndSum("1,2");
        assertThat(result).isEqualTo(3);
    }

    @Test
    void splitAndSumDelimiterCommaAndColumn() {
        int result = StringAddCalculator.splitAndSum("1,2:3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void splitAndSumCustomDelimiter() {
        int result = StringAddCalculator.splitAndSum("//;\n1;2;3");
        assertThat(result).isEqualTo(6);
    }

    @Test
    void splitAndSumCustomAndDefaultDelimiter() {
        int result = StringAddCalculator.splitAndSum("//;\n1,2:3;4");
        assertThat(result).isEqualTo(10);
    }

    @Test
    void splitAndSumMultipleCustomDelimiter() {
        int result = StringAddCalculator.splitAndSum("//;a\n1;2a3");
        assertThat(result).isEqualTo(6);
    }
}
