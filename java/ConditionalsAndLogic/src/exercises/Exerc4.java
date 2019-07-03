package exercises;

import java.util.Scanner;

public class Exerc4 {
    public static void main(String[] args) {
        int a;
        int b;
        int c;
        int n;
        Scanner input = new Scanner(System.in);
        a = input.nextInt();
        b = input.nextInt();
        c = input.nextInt();
        n = input.nextInt();
        checkFermat(a, b, c, n);
    }

    private static void checkFermat(int a, int b, int c, int n) {
        if (Math.pow(a, n) + Math.pow(b, n) == Math.pow(c, n)) {
            System.out.println("Holy smokes, Fermat was wrong!");
        }
        else  {
            System.out.println("No, that doesn't work");
        }
    }
}
