package inheritance;

@SuppressWarnings("ALL")
public class Car {

    private CarType type;

    public void setPrice(double price) {
        this.price = price;
    }

    private double price;

    public Car(CarType type) {
        this.type = type;
    }

    public CarType getType() {
        return type;
    }
}
