import java.util.Comparator;

public class CarComparator implements Comparator<Car> {
    @Override
    public int compare(Car c1, Car c2) {
        if(c1.getPosition() >= c2.getPosition()) {
            return -1;
        }
        return 1;
    }
}
