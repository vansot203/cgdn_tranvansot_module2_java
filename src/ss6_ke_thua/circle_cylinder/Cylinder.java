package ss6_ke_thua.circle_cylinder;

public class Cylinder extends Circle {
    private double height;
    public Cylinder() {
        super(); // gọi constructor của Circle
        this.height = 1.0;
    }
    public Cylinder(double radius) {
        super();
        this.height = 1.0;
    }
    public Cylinder(double radius, double height) {
        super();
        this.height = height;
    }
    public Cylinder(double radius, double height, String color) {
        super(radius, color);
        this.height = height;
    }
    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double getVolume() {
        return getArea() * height;
    }
    @Override
    public String toString() {
        return "Cylinder[radius=" + getRadius() +
                ", height=" + height +
                ", color=" + getColor() +
                ", area=" + getArea() +
                ", volume=" + getVolume() + "]";
    }
}