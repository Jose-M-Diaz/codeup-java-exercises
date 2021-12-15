import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
        //1.
//        double pi = 3.14159;
//        System.out.printf("The value of pi is approximately: %f", pi);

        //2.
        Scanner in = new Scanner(System.in);
//        System.out.println("Enter an Integer: ");
//        int userInput = in.nextInt();
//        System.out.printf("You entered: %d", userInput);

        //3.
//        System.out.print("Enter Three Words: "); //with less words keeps trying to process
//        String word1 = in.nextLine();               //with more words only takes 1st 3 words
//        String word2 = in.nextLine();
//        String word3 = in.nextLine();
//        System.out.printf("You entered:%n%s%n%s%n%s", word1,word2,word3);

        //4.
//        System.out.println("Write out a sentence: "); //next method captures 1st word
//        String sentence = in.nextLine();              //nextLine captures the whole sentence
//        System.out.println(sentence);

        //PERIMETER AND AREA
        //1.
        System.out.println("What is the length of your room and the width of your room? ");
        String length = in.nextLine();
        int l = Integer.parseInt(length);
        String width = in.nextLine();
        int w = Integer.parseInt(width);
        System.out.printf("You entered: %s for length and %s for width", l, w);
        System.out.println("\nThe area of the room is: " + l * w);
        System.out.println("The perimeter of the room is: " + (l*2 + w*2));


    }
}
