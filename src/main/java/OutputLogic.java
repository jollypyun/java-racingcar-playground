import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OutputLogic {
    public List<String> checkWinner(List<Car> list) {
        list.sort(new CarComparator());
        List<String> winners = new ArrayList<>();
        winners.add(list.get(0).getName());
        Integer max = list.get(0).getPosition();

        for(int i = 1; i < list.size(); i++) {
            if (list.get(i).getPosition() < max) {
                break;
            }
            winners.add(list.get(i).getName());
        }
        return winners;
    }
}
