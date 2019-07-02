package formattingOutput;

public class Output {
    public static void main(String[] args) {
        final double CM_PER_INCH = 2.54;
        System.out.println(4.0 / 3.0);
        int inch = 100;
        double cm = inch * CM_PER_INCH;
        System.out.printf("%d in = %f cm\n", inch, cm);
    }
}
