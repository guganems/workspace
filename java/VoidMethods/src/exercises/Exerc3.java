package exercises;

public class Exerc3 {
    private static void printAmerican(String day, String date, String month, String year) {
        System.out.println(day + ", " + month + " " + date + ", " + year);
    }

    private static void printEuropean(String day, String date, String month,
                                      String year) {
        System.out.println(day + " " + month + " " + date + " " + year);
    }

    public static void main(String[] args) {
        String day = "Tuesday";
        String month = "July";
        String date = "02";
        String year = "2019";

        printAmerican(day, month, date, year);
        printEuropean(day, month, date, year);
    }
}
