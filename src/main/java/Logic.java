public class Logic {
    public Boolean checkNameLength(String carName) {
        return carName.length() <= 5;
    }

    public void checkCarSplit(String text) {
        String[] cars = text.split(",");
        for (String car : cars) {
            checkNameLength(car);
        }
    }
}
