import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

class InputLogicTest {
    private InputLogic inputLogic;

    @BeforeEach
    void setUp() {
        inputLogic = new InputLogic();
    }

    @Test
    void checkCarNameTest() {
        String firstCarName = "blemish";
        String secondCarName = "max";

        assertThat(inputLogic.checkNameLength(firstCarName)).isFalse();
        assertThat(inputLogic.checkNameLength(secondCarName)).isTrue();
    }

    @Test
    void checkCarSplitTest() {
        String carNames = "pobi, xcatter, limp";
        List<Car> list = inputLogic.checkCarSplit(carNames);
        assertThat(list).isEmpty();
        carNames = "se,loi";
        list = inputLogic.checkCarSplit(carNames);
        assertThat(list).hasSize(2);
    }
}
