package exercises;

public class Exerc7 {
    public static void main(String[] args) {
        System.out.println(oddSum(3));
    }

    private static int oddSum (int n) {
        if (n % 2 == 0) {
            return oddSum(n-1);
        }
        else if (n > 0) {
            return n + oddSum(n-1);
        }
        else return 0;
    }
}
