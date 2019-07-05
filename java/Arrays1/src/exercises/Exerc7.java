package exercises;

public class Exerc7 {
    public static void main(String[] args) {
        int n = 3 * 5 * 7;
        int[] a = {3, 5, 7};
        System.out.println(arePrimeFactors(n, a));
    }

    private static boolean arePrimeFactors(int n, int[] a) {
        int product = 1;
        for (int value : a) {
            if (isPrime(value)) product *= value;
            else return false;
        }
        return n == product;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
