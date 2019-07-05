package exercises;

import java.util.Random;

public class Exerc4 {
    public static void main(String[] args) {
        Random random = new Random();
        int[] a = new int[100];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        System.out.println(indexOfMax(a));
    }

    private static int indexOfMax(int[] a) {
        int max = Integer.MIN_VALUE;
        int maxIndex = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }
        }
        return maxIndex;
    }
}
