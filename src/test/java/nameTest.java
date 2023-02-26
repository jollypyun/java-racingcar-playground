import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class nameTest {
    private Logic logic;

    @BeforeEach
    void setUp() {
        logic = new Logic();
    }

    @Test
    void checkCarNameTest() {
        String firstCarName = "blemish";
        String secondCarName = "max";

        assertThat(logic.checkNameLength(firstCarName)).isFalse();
        assertThat(logic.checkNameLength(secondCarName)).isTrue();
    }

    @Test
    void checkCarSplitTest() {
        String carNames = "";
        logic.checkCarSplit(carNames);
    }
}
