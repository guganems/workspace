package exercises;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        double celsius;
        double farenheit;
        Scanner input = new Scanner(System.in);

        celsius = input.nextDouble();
        farenheit = celsius * (9.0 / 5.0) + 32;

        System.out.printf("%.1f C = %.1f F", celsius, farenheit);
    }
}
