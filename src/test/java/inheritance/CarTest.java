package inheritance;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * User: Daniel Senften <daniel@senften.org>
 * Date: 2019-03-19, 12:45
 */
class CarTest {

    private Car car;

    @BeforeEach
    void setUp() {
        car = new Car(CarType.BMW);
    }

    @Test
    void getType() {
        assertEquals(CarType.BMW, car.getType());
    }
}

