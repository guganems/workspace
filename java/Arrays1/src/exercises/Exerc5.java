package exercises;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        System.out.println(Arrays.toString(sieve(n)));
    }

    private static boolean[] sieve(int n) {
        boolean[] sieveArr = new boolean[n];
        for (int i = 3; i < n; i++) {
            sieveArr[i] = isPrime(i);
        }
        return sieveArr;
    }

    private static boolean isPrime(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}
