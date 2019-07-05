package displayingArrays;

public class Array {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        printArray(a);
    }

    private static void printArray(int[] a) {
        System.out.print("{" + a[0]);
        for (int i = 1; i < a.length; i++) {
            System.out.print(", " + a[i]);
        }
        System.out.println("}");
    }
}
