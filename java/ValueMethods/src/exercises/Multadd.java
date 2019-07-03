package exercises;

public class Multadd {
    public static void main(String[] args) {
        System.out.println(multadd(1.0, 2.0, 3.0));
        System.out.println(multadd(Math.sin(Math.PI / 4), Math.cos(Math.PI / 4) / 2,
                Math.log(10) + Math.log(20)));
        System.out.println(expSum(4));
    }

    private static double multadd(double a, double b, double c) {
        return a * b + c;
    }
    public static double expSum(double x) {
        return multadd(x, Math.exp(-x), Math.sqrt(1-Math.exp(-x)));
    }
}
