package movies;

import util.Input;
import static movies.MoviesArray.findAll;

public class MoviesApplication {

    public static void main(String[] args) {
        System.out.println("What would you like to do?");
        System.out.println("");
        System.out.println("0 - exit");
        System.out.println("1 - view all movies");
        System.out.println("2 - view movies in the animated category");
        System.out.println("3 - view movies in the drama category");
        System.out.println("4 - view movies in the horror category");
        System.out.println("5 - view movies in the scifi category");
        System.out.println("");
        System.out.println("Enter your choice: ");
        Input input = new Input();
        String userInput = input.getString();

        if (userInput.equals("0")) {
            System.out.println("Have a nice day!");
        } else if (userInput.equals("1")) {
            Movie[] list = findAll();
            for (Movie movies : list) {
                System.out.println("\n" + movies.getName() + "--" + movies.getCategory());
            }
        } else if (userInput.equals("2")) {
            Movie[] list = findAll();
            for (Movie movies : list) {
                if (movies.getCategory().equals("animated")) {
                    System.out.println("\n" + movies.getName() + "--" + movies.getCategory());
                } else {
                    continue;
                }
            }
        } else if (userInput.equals("3")) {
            Movie[] list = findAll();
            for (Movie movies : list) {
                if (movies.getCategory().equals("drama")) {
                    System.out.println("\n" + movies.getName() + "--" + movies.getCategory());
                } else {
                    continue;
                }
            }
        } else if (userInput.equals("4")) {
            Movie[] list = findAll();
            for (Movie movies : list) {
                if (movies.getCategory().equals("horror")) {
                    System.out.println("\n" + movies.getName() + "--" + movies.getCategory());
                } else {
                    continue;
                }
            }
        } else if (userInput.equals("5")) {
            Movie[] list = findAll();
            for (Movie movies : list) {
                if (movies.getCategory().equals("scifi")) {
                    System.out.println("\n" + movies.getName() + "--" + movies.getCategory());
                } else {
                    continue;
                }
            }
        }
    }
}
