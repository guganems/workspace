package recursiveMessages;

public class Method {
    private static void countdown(int n) {
        if (n == 0) {
            System.out.println("Blastoff!");
        }
        else {
            System.out.println(n);
            countdown(n - 1);
        }
    }

    public static void main(String[] args) {
        countdown(3);
    }
}
