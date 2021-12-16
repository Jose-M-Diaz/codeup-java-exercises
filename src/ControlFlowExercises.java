import java.sql.SQLOutput;
import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        //1a.
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }

        //1b.
//        int i = 105;
//        do {
//            System.out.println(i -= 5);
//        }while(i > -10);
//        long i = 2;
//        do {
//            System.out.println(i);
//            i *= i;
//        }while(i < 1000000);

        //1c.
//        for(int i = 5; i <= 15; i++) {
//            System.out.println(i + "");
//        }
//        for(long i = 2; i < 1000000; i *= i) {
//            System.out.println(i);
//        }

        //2.
//        for(int i = 1; i <= 100; i++) {
//            if(i % 5 == 0 && i % 3 == 0) {
//                System.out.println("FizzBuzz");
//            }else if(i % 5 == 0) {
//                System.out.println("Buzz");
//            }else if(i % 3 == 0) {
//                System.out.println("Fizz");
//            }else {
//                System.out.println(i);
//            }
//        }

        //3.
//        Scanner sc = new Scanner(System.in);
//        System.out.println("What number would you like to go up to? ");
//        int number = sc.nextInt();
//        System.out.println("Are you sure?[Y/n] ");
//        String input = sc.next();
//        boolean confirmation = input.equalsIgnoreCase("y");
//        System.out.println("Here is your table!");
//        System.out.println("Number | Squared | Cubed");
//        System.out.println("------ | ------- | -----");
//        for(int i = 1; i <= number; i++) {
//            System.out.println(i + "      |" + (i * i) + "        |" + (i * i * i));
//        }

        //4.
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 0-100 to get your letter grade:");
        int num = sc.nextInt();
        System.out.println("Are you sure?[y/n]");
        String userInput = sc.next();
        boolean confirm = userInput.equalsIgnoreCase("y");
        if(num >= 97 && num <= 100 ) {
                System.out.println("A+");
            }else if(num >= 93 && num <= 96) {
                System.out.println("A");
            }else if(num >= 90 && num <= 92) {
                System.out.println("A-");
            }else if(num >= 87 && num <= 89) {
                System.out.println("B+");
            }else if(num >= 83 && num <= 86) {
                System.out.println("B");
            }else if(num >= 80 && num <= 82) {
                System.out.println("B-");
            }else if(num >= 77 && num <= 79) {
                System.out.println("C+");
            }else if(num >= 73 && num <= 76) {
                System.out.println("C");
            }else if(num >= 70 && num <= 72) {
                System.out.println("C-");
            }else if(num >= 67 && num <= 69) {
                System.out.println("D+");
            }else if(num >= 65 && num <= 66) {
                System.out.println("D");
            }else {
                System.out.println("F");
            }
    }
}
