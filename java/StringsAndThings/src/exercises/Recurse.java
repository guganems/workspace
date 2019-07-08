package exercises;

import java.util.Scanner;

public class Recurse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(first("HELLO"));
        System.out.println(rest("HELLO"));
        System.out.println(middle("HELLO"));
        System.out.println(length("HELLO"));
    }

    public static char first(String s) {
        return s.charAt(0);
    }
    public static String rest(String s) {
        return s.substring(1);
    }
    public static String middle(String s) {
        return s.substring(1, s.length()-1);
    }
    public static int length(String s) {
        return s.length();
    }
    public static void printString(String str) {
        System.out.println(first(str));
        String rest = rest(str);
        for (int i = 1; i < length(str); i++) {
            System.out.println(first(rest));
            rest = rest(str);
        }
    }
}
