package binaryNumbers;

public class Number {
    private static void countup(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        }
        else {
            countup(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        countup(3);
    }
}
