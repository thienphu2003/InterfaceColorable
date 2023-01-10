public class Main {
    public static void main(String[] args) {
        Shape shape =new Rectangle(3,4,"blue",false);
        System.out.println(shape.getColor());
        System.out.println(shape.isFilled());
        System.out.println(shape);
        Rectangle r = (Rectangle) shape;
        System.out.println(r.getArea());
        System.out.println(r.getPerimeter());
        System.out.println(r.getLength());
        System.out.println(r.getWidth());
        r.howToColor();
    }
}