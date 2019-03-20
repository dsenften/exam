package simulation;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import javax.swing.*;

import static org.junit.jupiter.api.Assertions.*;

class PositionTest {
    private static final int row = 12;
    private static final int column = 13;

    private Position position;

    @BeforeEach
    void setup(){
        position= new Position(row, column);
    }

    @Test
    void equals() {
        Position otherPosition = new Position(row,column);
        assertEquals(position, otherPosition);
    }

    @Test
    void testToString() {
        String expected =row +","+column;
        assertEquals(expected, position.toString());
    }

    @Test
    void testHashCode() {
        //String expected =return (row << 16) + column;
        int expected = (row << 16) + column;
        assertEquals(expected, position.hashCode());
    }

    @Test
    void getRow() {
        assertEquals(row, position.getRow());

    }

    @Test
    void getColumn() {
        assertEquals(column,position.getColumn());

    }
}