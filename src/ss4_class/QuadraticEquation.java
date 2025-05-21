package ss4_class;
public class QuadraticEquation {
    private double a;
    private double b;
    private double c;

    public QuadraticEquation(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return this.a;
    }

    public double getB() {
        return this.b;
    }

    public double getC() {
        return this.c;
    }

    public double getDiscriminant() {
        return b * b - 4 * a * c;
    }
    public double getRoot1() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b + Math.sqrt(delta)) / (2 * a);
        } else {
            return Double.NaN;
        }
    }
    public double getRoot2() {
        double delta = getDiscriminant();
        if (delta >= 0) {
            return (-b - Math.sqrt(delta)) / (2 * a);
        } else {
            return Double.NaN;
        }
    }

    public boolean hasTwoRoots() {
        return getDiscriminant() > 0;
    }

    public boolean hasOneRoot() {
        return getDiscriminant() == 0;
    }

    public boolean hasNoRealRoot() {
        return getDiscriminant() < 0;
    }
    @Override
    public String toString() {
        return a + "x² + " + b + "x + " + c + " = 0";
    }
}