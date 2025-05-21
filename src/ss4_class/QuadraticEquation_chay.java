package ss4_class;

import java.util.Scanner;

public class QuadraticEquation_chay{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Nhập a: ");
        double a = sc.nextDouble();

        System.out.print("Nhập b: ");
        double b = sc.nextDouble();

        System.out.print("Nhập c: ");
        double c = sc.nextDouble();

        if (a == 0) {
            System.out.println("Không phải phương trình bậc hai (a phải khác 0).");
            return;
        }

        QuadraticEquation equation = new QuadraticEquation(a, b, c);
        System.out.println("Phương trình: " + equation);

        if (equation.hasTwoRoots()) {
            System.out.println("Phương trình có 2 nghiệm:");
            System.out.println("x1 = " + equation.getRoot1());
            System.out.println("x2 = " + equation.getRoot2());
        } else if (equation.hasOneRoot()) {
            System.out.println("Phương trình có nghiệm kép:");
            System.out.println("x = " + equation.getRoot1());
        } else {
            System.out.println("Phương trình vô nghiệm thực.");
        }
    }
}
