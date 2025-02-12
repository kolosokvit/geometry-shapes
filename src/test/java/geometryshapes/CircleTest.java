package geometryshapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CircleTest {

    @Test
    void shouldCalculateArea() {
        Circle circle = new Circle("A", 1);
        assertEquals(3.14, circle.calculateArea(), 0.01);
    }

    @Test
    void shouldCalculatePerimeter() {
        Circle circle = new Circle("A", 1);
        assertEquals(6.28, circle.calculatePerimeter(), 0.01);
    }

}