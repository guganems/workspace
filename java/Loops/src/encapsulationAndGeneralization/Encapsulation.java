package encapsulationAndGeneralization;

public class Encapsulation {
    public static void main(String[] args) {
        printRow(4);
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
