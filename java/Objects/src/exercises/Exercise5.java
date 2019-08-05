package exercises;

import java.math.BigInteger;

public class Exercise5 {
    private static BigInteger pow(BigInteger x, int n) {
        if (n == 0) return BigInteger.valueOf(1);

        BigInteger t = pow (x, n / 2);

        if (n % 2 == 0) {
            return t.multiply(t);
        } else {
            return t.multiply(t).multiply(x);
        }
    }

    public static void main(String[] args) {
        System.out.println(pow(BigInteger.valueOf(523422123), 44));
    }
}
