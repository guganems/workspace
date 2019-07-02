package exercises;

import java.util.Scanner;

public class Exerc1 {
    public static void main(String[] args) {
        int x;
        Scanner input = new Scanner(System.in);
        x = input.nextInt();
        if (x > 0 && x < 10) {
            System.out.println("Positive single digit number.");
        }
    }
}
