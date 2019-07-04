package generatingTables;

public class Table {
    public static void main(String[] args) {
        int i = 1;
        while (i < 10) {
            double x = i;
            System.out.println(x + "  " + Math.log(x));
            i = i + 1;
        }
    }
}
