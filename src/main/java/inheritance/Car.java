package inheritance;

@SuppressWarnings("ALL")
public class Car {

    private CarType type;
    private  double preis;

    public Car(CarType type) {
        this.type = type;
    }

    public CarType getType() {
        return type;
    }
}
