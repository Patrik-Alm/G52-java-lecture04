package io.github.patrikalm;

public class TestRandomSequence {

    public static void testRandomSequence () {

        int counter = 0;
        int fiveHundred = 0;
        int zero = 0;

        while (counter < 10000) {

            int randomNumber = NumberGenerator.setRandomNumber();

            if (randomNumber == 500) {
                fiveHundred++;
            } else if (randomNumber == 0) {
                zero++;
            }
            counter++;

        }
        System.out.println("500 generated " + fiveHundred + " times.");
        System.out.println("0 generated " + zero + " times.");

    }
}