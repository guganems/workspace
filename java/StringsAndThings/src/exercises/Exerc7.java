package exercises;

import java.util.Arrays;
import java.util.Scanner;

public class Exerc7 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str1 = input.nextLine();
        System.out.println();
        String str2 = input.nextLine();

        char[] string1 = str1.toCharArray();
        char[] string2 = str2.toCharArray();

        System.out.println(areAnagram(string1, string2));
    }

    private static boolean areAnagram(char[] str1, char[] str2) {
        int NO_OF_CHARS = 256;
        int[] count1 = new int[NO_OF_CHARS];
        Arrays.fill(count1, 0);
        int[] count2 = new int[NO_OF_CHARS];
        Arrays.fill(count2, 0);
        int i;

        for (i = 0; i < str1.length && i < str2.length; i++) {
            count1[str1[i]]++;
            count2[str2[i]]++;
        }

        if (str1.length != str2.length) return false;

        for (i = 0; i < NO_OF_CHARS; i++) {
            if (count1[i] != count2[i]) return false;
        }

        return true;
    }
}
