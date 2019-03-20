package simulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CounterTest {

    // Ein Name für den Akteurstyp in dieser Simulation
    private String name;

    // Wie viele von diesem Typ existieren in der Simulation.
    private int counter;

    private Counter c;

    @BeforeEach
    void setUp() {
        c = new Counter(name);

    }

    @Test
    void getName() {
        assertEquals(name,c.getName());
    }

    @Test
    void getCounter() {
        assertEquals(counter,c.getCounter());

    @Test
    void increase() {
    }

    @Test
    void reset() {
    }
}