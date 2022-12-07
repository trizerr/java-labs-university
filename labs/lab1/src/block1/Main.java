package block1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("ax + b = 0");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a: ");
        double a = scanner.nextDouble();
        System.out.print("Enter b: ");
        double b = scanner.nextDouble();
        final double EPS = 1e-12;
        if (Math.abs(a) < EPS) { // a = 0
            if (Math.abs(b) < EPS) { // b = 0
                System.out.println("х є R");
            } else {
                System.out.println("No roots");
            }
        } else {
            double x = -b / a;
            System.out.println("x = " + x);
        }
    }
}
