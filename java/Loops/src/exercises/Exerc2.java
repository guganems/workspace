package exercises;

import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        double x0 = x / 2;
        double root;
        double diff;
        root = squareRoot(x, x0);
        do {
            diff = root - squareRoot(x, root);
            root = squareRoot(x, root);
            System.out.println(diff);
        } while(diff > 0.0001);
        System.out.println(root);
    }

    private static double squareRoot(double x, double x0) {
        return ((x0) + x / x0) / 2;
    }
}
