public class Car {
    private String name;
    private Integer position;

    public Car(String name, Integer position) {
        this.name = name;
        this.position = position;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPosition(Integer position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public Integer getPosition() {
        return position;
    }
}
