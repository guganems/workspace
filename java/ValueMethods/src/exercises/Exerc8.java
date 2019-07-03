package exercises;

public class Exerc8 {
    public static void main(String[] args) {
        System.out.println(ack(3, 12));
    }

    private static int ack(int m, int n) {
        if (m == 0) return n + 1;
        if (m > 0 && n == 0) return ack(m-1, 1);
        if (m > 0 && n > 0) return ack(m-1, ack(m, n-1));
        else return 0;
    }
}
