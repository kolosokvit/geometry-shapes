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
}
