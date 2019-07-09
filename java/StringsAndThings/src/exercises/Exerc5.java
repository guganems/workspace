package exercises;

import java.util.Scanner;

public class Exerc5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(isAbecedarian(str));
    }

    private static boolean isAbecedarian(String str) {
        for (int i = 1; i < str.length(); i++) {
            if (str.charAt(i) < str.charAt(i-1)) return false;
        }
        return true;
    }
}
