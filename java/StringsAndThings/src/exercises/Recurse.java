package exercises;

import java.util.Scanner;

public class Recurse {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();

        System.out.println(first("HELLO"));
        System.out.println(rest("HELLO"));
        System.out.println(middle("HELLO"));
        System.out.println(length("HELLO"));
        printString(str);
        printBackward(str);
    }

    private static char first(String s) {
        return s.charAt(0);
    }
    private static String rest(String s) {
        return s.substring(1);
    }
    private static String middle(String s) {
        return s.substring(1, s.length()-1);
    }
    private static int length(String s) {
        return s.length();
    }
    private static void printString(String str) {
        System.out.println(first(str));
        String rest = rest(str);
        for (int i = 1; i < length(str); i++) {
            System.out.println(first(rest));
            rest = rest(rest);
        }
    }
    private static void printBackward(String str) {
        String rest = rest(str);
        char first = first(str);
        String firstStr = "" + first;
        for (int i = length(str)-1; i >= 0; i--) {
            rest = rest(middle((firstStr + rest)));
            String remaining = rest;
            for (int j = 0; j < length(rest); j++) {
                if (j == length(str)-1) {
                    System.out.println(remaining);
                }
                else remaining = rest(remaining);
            }
        }
        System.out.println(first);
    }
}
