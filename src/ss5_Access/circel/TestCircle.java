package ss5_Access.circel;

public class TestCircle {
    public static void main(String[] args) {
        Circle cir = new Circle();
        System.out.println("Radius of circle is: " + cir.g etRadius());
        System.out.println("Area of circle is: " + cir.getArea());

        Circle cir2 = new Circle();
        System.out.println("Radius of circle 2 is: " + cir2.getRadius());
        System.out.println("Area of circle 2 is: " + cir2.getArea());
    }
}
