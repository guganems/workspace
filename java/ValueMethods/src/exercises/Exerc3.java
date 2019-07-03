package exercises;

public class Exerc3 {
    public static boolean isTriangle(int a, int b, int c) {
        if (a + b > c) return false;
        else if (a + c > b) return false;
        else return b + c <= a;
    }
}
