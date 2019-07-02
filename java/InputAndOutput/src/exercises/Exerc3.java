package exercises;

import java.util.Scanner;

public class Exerc3 {
    public static void main(String[] args) {
        int seconds;
        int hours;
        int minutes;
        int remSeconds;
        Scanner input = new Scanner(System.in);

        seconds = input.nextInt();
        hours = seconds / 3600;
        minutes = (seconds - (hours * 3600)) / 60;
        remSeconds = seconds - ((hours * 3600) + (minutes * 60));

        System.out.printf("%d seconds = %d hours, %d minutes and %d seconds", seconds,
                hours, minutes, remSeconds);
    }
}
