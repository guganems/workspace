package randomNumbers;

import java.util.Random;

public class Numbers {
    public static void main(String[] args) {
        int numValues = 8;
        int[] array = randomArray(numValues);
        printArray(array);
    }

    private static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }

    private static int[] randomArray(int size) {
        Random random = new Random();
        int[] a = new int[size];
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(100);
        }
        return a;
    }
}
