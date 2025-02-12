package geometryshapes;

public class ShapeUtilDemo {
    public static void main(String[] args) {
        ShapeUtil shapeUtil = new ShapeUtil();
        Square square = shapeUtil.createRandomSquare();
        System.out.println(shapeUtil.calculateArea(square));
        System.out.println(shapeUtil.calculatePerimeter(square));
    }
}
