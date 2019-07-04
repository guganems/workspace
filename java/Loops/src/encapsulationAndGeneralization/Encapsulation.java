package encapsulationAndGeneralization;

import java.util.Scanner;

public class Encapsulation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        printTable(rows);
    }

    private static void printTable(int rows) {
        int i = 1;
        while (i <= rows) {
            printRow(i);
            i = i + 1;
        }
    }
    private static void printRow(int n) {
        int i = 1;
        while(i <= 6) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }
}
