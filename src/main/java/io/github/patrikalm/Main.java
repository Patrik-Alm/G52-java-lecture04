package io.github.patrikalm;

public class Main {
    public static void main(String[] args) {

        System.out.println();
        System.out.print("Guess a number between 0 and 500: ");

        int counter = 0;
        int theNumber = NumberGenerator.setRandomNumber();
        int guessedNumber = GettingUserNumber.setGettingUserNumber();
        System.out.println();

        while (theNumber != guessedNumber) {

            if (guessedNumber < theNumber) {
                System.out.println("Your guess is too low");
            } else {
                System.out.println("Your guess too high");
            }
            System.out.println();
            System.out.print("Guess again: ");
            guessedNumber = GettingUserNumber.setGettingUserNumber();
            counter++;
            System.out.println();
        }
        System.out.println("You guessed the right number!!!");
        System.out.println("It only took you " + counter + " guesses...");
    }
}