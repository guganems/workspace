package exercises;

import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        double x = input.nextDouble();
        int n = input.nextInt();
        for (double i = 0.1; i <= 100.0; i *= 10) {
            check(i, n);
        }

        for (double i = -0.1; i >= -100.0; i *= 10) {
            check(i, n);
        }
    }

    private static double myexp(double x, int n) {
        double exp = 1 + x;
        double fact = 1.0;
        for (int i = 2; i < n; i++) {
            exp += (x * x / (fact * i));
            x *= x;
            fact *= i;
//            System.out.println(exp);
        }
        return exp;
    }
    private static void check(double x, int n) {
        System.out.println(x + "\t" + myexp(x, n) + "\t" + Math.exp(x));
    }
}
