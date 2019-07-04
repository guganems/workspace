package generatingTables;

public class Table {
    public static void main(String[] args) {
        final double LOG2 = Math.log(2);
        int i = 1;
        while (i < 100) {
            double x = i;
            System.out.println(x + "  " + Math.log(x) / LOG2);
            i = i * 2;
        }
    }
}
