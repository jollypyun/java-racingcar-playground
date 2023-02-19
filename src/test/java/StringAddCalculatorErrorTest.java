import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThatThrownBy;

public class StringAddCalculatorErrorTest {
    @Test
    void splitAndSumOneWrongLetter() {
        assertThatThrownBy(() -> StringAddCalculator.splitAndSum("*"))
                .isInstanceOf(NumberFormatException.class);
    }

    @Test
    void splitAndSumNotStartNumber() {
        assertThatThrownBy(() -> StringAddCalculator.splitAndSum(":9,2"))
                .isInstanceOf(RuntimeException.class).hasMessageContaining("식이 완벽하지 않습니다.");
    }

    @Test
    void splitAndSumNotEndNumber() {
        assertThatThrownBy(() -> StringAddCalculator.splitAndSum("9,2:"))
                .isInstanceOf(RuntimeException.class).hasMessageContaining("식이 완벽하지 않습니다.");
    }

    @Test
    void splitAndSumNotDelimiter() {
        assertThatThrownBy(() -> StringAddCalculator.splitAndSum("9,2*8"))
                .isInstanceOf(NumberFormatException.class);
    }

    @Test
    void splitAndSumNegative() {
        assertThatThrownBy(() -> StringAddCalculator.splitAndSum("-1,2"))
                .isInstanceOf(RuntimeException.class).hasMessageContaining("음수입니다.");
    }

//    @Test
//    void splitAndSum
}
