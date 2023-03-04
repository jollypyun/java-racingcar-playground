import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class InputLogic {
    public Boolean checkNameLength(String carName) {
        return carName.length() <= 5;
    }

    public List<Car> checkCarSplit(String text) {
        String[] cars = text.split(",");
        List<Car> list = new ArrayList<>();
        for (String car : cars) {
            if (Boolean.FALSE.equals(checkNameLength(car))) {
                return Collections.emptyList();
            }
            list.add(new Car(car, 0));
        }
        return list;
    }
}
