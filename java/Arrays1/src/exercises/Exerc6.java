package exercises;

public class Exerc6 {
    public static void main(String[] args) {
        int[] a = {2, 4, 16};
        int n = 16;
        System.out.println(areFactors(n, a));
    }

    private static boolean areFactors(int n, int[] a) {
        for (int value : a) {
            if (n % value != 0) return false;
        }
        return true;
    }
}
