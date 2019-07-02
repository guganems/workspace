package exercises;

public class Time {
    public static void main(String[] args) {
        double hour = 12;
        double minute = 6;
        double second = 34;
        System.out.println("percentage of passed seconds:");
        System.out.println((hour * 3600 + minute * 60 + second) / 86400);
        System.out.println("Seconds remaining in the day:");
        System.out.println(86400 - (hour * 3600 + minute * 60 + second));
    }
}
