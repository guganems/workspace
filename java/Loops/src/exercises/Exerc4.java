package exercises;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(factorial(n));
    }

    private static int factorial (int n) {
        int fact = 1;
        for (int i = 1; i <= n; i ++) {
            fact *= i;
        }
        return fact;
    }
}
