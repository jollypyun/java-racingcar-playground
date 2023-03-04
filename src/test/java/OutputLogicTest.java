import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class OutputLogicTest {
    private OutputLogic outputLogic;
    private List<Car> list = new ArrayList<>();
    @BeforeEach
    void setUp() {
        outputLogic = new OutputLogic();
        Car car1 = new Car("a", 1);
        Car car2 = new Car("b", 4);
        list.add(car1);
        list.add(car2);
    }
    @Test
    void whoWinTest() {
        List<String> winners = outputLogic.checkWinner(list);
        assertThat(winners).hasSize(1);
        assertThat(winners.get(0)).isEqualTo("b");
    }

    @Test
    void tiedFirstTest() {
        Car car3 = new Car("c", 4);
        list.add(car3);
        List<String> winners = outputLogic.checkWinner(list);
        assertThat(winners).hasSize(2);
        for(String winner : winners) {
            System.out.println("winner = " + winner);
        }
    }
}
