import java.util.Scanner;

public class InputView {
    public void print() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("경주할 자동차 이름을 입력하세요(이름은 쉼표(,)를 기준으로 구분).");
        String name = scanner.next();
        System.out.println("시도할 회수는 몇회인가요?");
        Integer count = scanner.nextInt();
    }
}
