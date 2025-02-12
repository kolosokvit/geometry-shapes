package geometryshapes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class RectangleTest {

    @Test
    void shouldCalculateArea() {
        Rectangle rectangle = new Rectangle("A", 1.0, 2.0);
        assertEquals(2.0, rectangle.calculateArea(), 0.01);
    }

    @Test
    void shouldCalculatePerimeter() {
        Rectangle rectangle = new Rectangle("A", 1.0, 2.0);
        assertEquals(6.0, rectangle.calculatePerimeter(), 0.01);
    }

}
