package ss5_Access.circel;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle();
        System.out.println("Radius of Circle is: " + cir.getRadius());
        System.out.println("Area of Circle is: " + cir.getArea());

        Circle cir2 = new Circle();
        System.out.println("Radius of Circle 2 is: " + cir2.getRadius());
        System.out.println("Area of Circle 2 is: " + cir2.getArea());
    }
}
