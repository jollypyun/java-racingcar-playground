import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

class LogicTest {
    private Car car1 = new Car("a", 0);
    private Car car2 = new Car("b", 0);
    private Logic logic;

    @BeforeEach
    void setUp() {
        logic = new Logic();
    }
    @Test
    void forwardTest() {
        int num1 = 3;
        int num2 = 4;

        car1 = logic.forwardCheck(car1, num1);
        car2 = logic.forwardCheck(car2, num2);

        assertThat(car1.getPosition()).isZero();
        assertThat(car2.getPosition()).isEqualTo(1);
    }
}
