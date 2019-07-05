package exercises;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double x = input.nextDouble();
        int n = input.nextInt();
        System.out.println(power(x, n));
    }

    private static double power (double x, int n) {
        double tempX = x;
        if (n == 0) return 1;
        else {
            for (int i = 2; i <= n; i++) {
                tempX *= x;
            }
            return tempX;
        }
    }
}
