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
            printRow(i, rows);
            i = i + 1;
        }
    }
    private static void printRow(int n, int cols) {
        int i = 1;
        while(i <= cols) {
            System.out.printf("%4d", n * i);
            i = i + 1;
        }
        System.out.println();
    }
}
