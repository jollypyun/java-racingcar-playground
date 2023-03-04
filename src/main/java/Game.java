import java.util.List;

public class Game {
    private final InputView inputView;
    private final OutputView outputView;
    private final Logic logic;

    public Game(InputView inputView, OutputView outputView, Logic logic) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.logic = logic;
    }

    public void game() {
        List<Car> cars = inputView.inputNames();
        Integer count = inputView.inputCount();

        for (int i = 0; i < count; i++) {
            for (Car car : cars) {
                Integer goNumber = logic.makeRandom();
                logic.forwardCheck(car, goNumber);
            }
            outputView.printProceed(cars);
        }
        outputView.printResult(cars);
    }
}
