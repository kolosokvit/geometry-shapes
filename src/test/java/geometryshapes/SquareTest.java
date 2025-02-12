package geometryshapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SquareTest {

    @Test
    void shouldCalculateArea() {
        Square square = new Square("A", 1);
        assertEquals(1.0, square.calculateArea(), 0.01);
    }

    @Test
    void shouldCalculatePerimeter() {
        Square square = new Square("A", 1);
        assertEquals(4.0, square.calculatePerimeter(), 0.01);
    }

}
