package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner = new Scanner(System.in);


    public String getString() {
        System.out.println("Enter something.");
        String userResponse = scanner.nextLine();
        System.out.printf("String entered is: %s", userResponse);
        return userResponse;
    }

    public boolean yesNo() {
        System.out.println("Would you like to continue?");
        String userInput = scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt(int min, int max) {
        System.out.printf("enter number between %d and %d%n", min,max);
        int userNum = this.scanner.nextInt();
        if (userNum > max || userNum < min) {
            return getInt(min, max);
        }
        return userNum;
    }

    public int getInt() {
        String userInput = getString("Please enter a whole number.");
        int userNum;
        try {
            userNum = Integer.valueOf(userInput);
        } catch (NumberFormatException nfe) {
            nfe.printStackTrace();
            return getInt();
        }
        System.out.printf("You chose %d: ", userNum);
        return userNum;
    }

    public double getDouble(double min, double max) {
        System.out.printf("enter number between %f and %f%n", min,max);
        double userDouble = this.scanner.nextDouble();
        if (userDouble > max || userDouble < min) {
            return getDouble(min, max);
        }
        return userDouble;
    }

    public double getDouble() {
        System.out.println("Please enter a number.");
        double userNum = scanner.nextDouble();
        System.out.printf("You chose %f: ", userNum);
        return userNum;
    }
}
