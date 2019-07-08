package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(Arrays.toString(letterHist(str)));
    }

    private static int[] letterHist(String str) {
        int[] hist = new int[26];
        for (int i = 0; i < str.length(); i++) {
            hist[(int)str.charAt(i)-65]++;
        }
        return hist;
    }
}
