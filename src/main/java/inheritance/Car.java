package inheritance;

@SuppressWarnings("ALL")
public class Car {

    private int price;
    private CarType type;

    public Car(CarType type) {
        this.type = type;
    }

    public CarType getType() {
        return type;
    }
}
