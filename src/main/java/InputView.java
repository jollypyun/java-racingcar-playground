import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class InputView {
    private final InputLogic inputLogic;
    public InputView(InputLogic inputLogic) {
        this.inputLogic = inputLogic;
    }

    public List<Car> inputNames() {
        List<Car> list = new ArrayList<>();
        while(list.isEmpty()) {
            System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
            Scanner scanner = new Scanner(System.in);
            String name = scanner.next();
            list = inputLogic.checkCarSplit(name);
            if (list.isEmpty()) {
                System.out.println("다시 시도하세요");
            }
        }
        return list;
    }

    public Integer inputCount() {
        Integer count = 0;
        while(count <= 0) {
            System.out.println("시도할 회수는 몇회인가요?");
            Scanner scanner = new Scanner(System.in);
            count = Integer.valueOf(scanner.next());
            if (count <= 0) {
                System.out.println("다시 시도하세요");
            }
        }
        return count;
    }
}
