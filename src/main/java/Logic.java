import java.util.List;

public class Logic {

    public Car forwardCheck(Car car, Integer number) {
        Integer position = car.getPosition();
        if(number >= 4) {
            position += 1;
            car.setPosition(position);
            return car;
        }
        return car;
    }

    public Integer makeRandom() {
        return (int)(Math.random() * 10);
    }
}
