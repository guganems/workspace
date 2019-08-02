package exercises;

public class Big {
    public static void main(String[] args) {
        for (int i = 0; i <= 30; i++) {
            System.out.println(i + "    " + factorial(i));
        }
    }
    private static int factorial(double n) {
        int fact = 1;
        for (int i = 1; i <= n; i ++) {
            fact *= i;
        }
        return fact;
    }
}
