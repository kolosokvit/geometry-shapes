package geometryshapes;

import java.util.Random;

public class ShapeUtil {
    private final Random random = new Random();
    public Circle createRandomCircle() {
        return new Circle("Circle", random.nextDouble(10));
    }

    public Square createRandomSquare() {
        return new Square("Square", random.nextDouble(10));
    }

    public Rectangle createRandomRectangle() {
        return new Rectangle("Rectangle", random.nextDouble(10), random.nextDouble(10));
    }

    public Shape createRandomShape() {
        int shapeIndex = random.nextInt(3);
        if (shapeIndex == 0) {
            return createRandomSquare();
        } else if (shapeIndex == 1) {
            return createRandomRectangle();
        } else {
            return createRandomCircle();
        }
    }

    public double calculateArea(Shape[] shapes) {
        double totalArea = 0;
        for (Shape shape : shapes) {
            totalArea += shape.calculateArea();
        }
        return totalArea;
    }

    public double calculatePerimeter(Shape[] shapes) {
        double totalPerimeter = 0;
        for (Shape shape : shapes) {
            totalPerimeter += shape.calculatePerimeter();
        }
        return totalPerimeter;
    }

    public double calculateArea(Shape shape) {
        return shape.calculateArea();
    }

    public double calculatePerimeter(Shape shape) {
        return shape.calculatePerimeter();
    }
}
