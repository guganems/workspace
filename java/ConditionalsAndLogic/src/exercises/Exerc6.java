package exercises;

import java.util.Random;
import java.util.Scanner;

public class Exerc6 {
    public static void main(String[] args) {
        Random random = new Random();
        int randNumber = random.nextInt(100) + 1;
        guessNumber(randNumber);
    }

    private static void guessNumber (int number) {
        Scanner input = new Scanner(System.in);
        int userInput = input.nextInt();
        if (userInput == number) {
            System.out.println("You were right!");
        }
        else {
            if (userInput > number) {
                System.out.println("too high. try again: ");
                guessNumber(number);
            }
            else {
                System.out.println("too low. Try again: ");
                guessNumber(number);
            }
        }
    }
}
