package exercises;

import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        System.out.println(isDoubloon(str));
    }

    private static boolean isDoubloon (String str ) {
        for (int i = 0; i < str.length(); i++) {
            int count = 0;
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j)) count++;
//                System.out.println(str.charAt(i) + " " + str.charAt(j));
            }
            if (count != 2) return false;
        }
        return true;
    }
}
