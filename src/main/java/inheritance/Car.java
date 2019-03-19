package inheritance;

@SuppressWarnings("ALL")
public class Car {

    private CarType type;
    private double price;

    public Car(CarType type) {
        this.type = type;
    }

    public CarType getType() {
        return type;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getPrice() {
        return price;
    }
}
