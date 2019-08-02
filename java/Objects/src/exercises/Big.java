package exercises;

import java.math.BigInteger;

public class Big {
    public static void main(String[] args) {
        for (int i = 0; i <= 3000; i++) {
            System.out.println(i + "    " + factorial(i));
        }

        BigInteger small = BigInteger.valueOf(17);
        BigInteger big = BigInteger.valueOf(1700000000);
        BigInteger product = small.multiply(big);
        BigInteger pow = small.pow(170000);
        System.out.println(product);
        System.out.println(pow);
        System.out.println("END");
    }
    private static BigInteger factorial(double n) {
        BigInteger fact = BigInteger.valueOf(1);
        for (int i = 1; i <= n; i ++) {
            fact = fact.multiply(BigInteger.valueOf(i));
        }
        return fact;
    }
}
