package shapes;

public class ShapesTest {
    public static void main(String[] args) {
        Quadrilateral myShape = new Square(9);
        System.out.println(myShape.getArea());
        System.out.println(myShape.getPerimeter());
        myShape = new Rectangle(3,7);
        System.out.println(myShape.getPerimeter());
        System.out.println(myShape.getArea());

        System.out.println(myShape.getLength());
        System.out.println(myShape.getWidth());
        System.out.println(myShape.getWidth());
        System.out.println(myShape.getLength());
    }
}
