package exercises;

import java.util.Random;
import java.util.Scanner;

public class GuessStarter {
    public static void main(String[] args) {
        int userInput;
        int computerChoice;
        Scanner input = new Scanner(System.in);
        Random random = new Random();

        computerChoice = random.nextInt(100) + 1;
        System.out.println("I'm thinking of a number between 1 and 100");
        System.out.println("(Including both). Can you guess what it is?");
        System.out.print("Type a number: ");
        userInput = input.nextInt();
        System.out.println("Your guess is: " + userInput);
        System.out.println("The number I was thinking of is: " + computerChoice);
        System.out.println("You were off by: " + (userInput - computerChoice));
    }
}
