package com.mycompany.Errors;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Errors {
    private static final Logger LOGGER = Logger.getLogger(Errors.class.getName());

    public static void main(String[] args) {
        Scanner input = null;
        int userInt = -1;
        boolean isFinished = false;

        try {
            input = new Scanner(System.in);

            while (!isFinished) {
                System.out.println("Enter a integer number:");
                try {
                    userInt = input.nextInt();
                    System.out.println("Your integer number is: " + userInt);
                    isFinished = true;
                } catch (InputMismatchException | NumberFormatException e) {
                    LOGGER.log(Level.SEVERE, "Must introduce a valid integer number");
                    input.next(); // Consume el carácter no numérico
                }
            }

        } finally {
            if (input != null) {
                input.close();
                System.out.println("Goodbye!");
            }
        }
    }
}
