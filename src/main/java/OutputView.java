import java.util.List;

public class OutputView {
    private final OutputLogic outputLogic;

    public OutputView(OutputLogic outputLogic) {
        this.outputLogic = outputLogic;
    }

    public void printProceed(List<Car> cars) {
        System.out.println("실행 결과");
        for (Car car : cars) {
            System.out.println(car.getName() + " : " + "-".repeat(car.getPosition()));
        }
        System.out.printf("\n");
    }

    public void printResult(List<Car> cars) {
        List<String> winners = outputLogic.checkWinner(cars);
        for (int i = 0; i < winners.size()-1; i++) {
            System.out.print(winners.get(i)+ ", ");
        }
        System.out.print(winners.get(winners.size()-1));
        System.out.println(" 가 최종 우승했습니다.");
    }
}
