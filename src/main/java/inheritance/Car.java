package inheritance;

@SuppressWarnings("ALL")
public class Car {

    public static final double MAX_PRICE = 15_000;

    private CarType type;
    private double price;

    public Car(CarType type) {
        this.type = type;
    }

    public CarType getType() {
        return type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
