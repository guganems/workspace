package exercises;

import java.util.Arrays;
import java.util.Random;

public class Exerc1 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        Random random = new Random();
        int[] b = new int[100];
        for (int i = 0; i < b.length; i++) {
            b[i] = random.nextInt(100);
        }
        powArray(a);
        System.out.println();
        System.out.println(Arrays.toString(histogram(b)));
    }

    private static void powArray(int[] a) {
        for (int value : a) {
            System.out.print((value * value) + " ");
        }
    }

    private static int[] histogram(int[] a) {
        int[] hist = new int[a.length];
        for (int value : a) {
            hist[value]++;
        }
        return hist;
    }
}
