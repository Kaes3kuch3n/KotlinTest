public class Main {

    public static void main(String[] args) {
        Shape triangle = new Shape();
        Shape rectangle = new Shape(5, 3, 6, 2);
        System.out.println(triangle.simpleDesc());
        triangle.listSides();
        System.out.println(rectangle.simpleDesc());
        rectangle.listSides();
    }

}
