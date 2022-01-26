import java.util.Scanner;
public class MethodsExercises {
    public static int getAddition(int num1, int num2){
        return num1 + num2;
    }
    public static int getSubtraction(int num1, int num2){
        if(num1 < num2) {
            return getSubtraction(num2, num1);
        }else {
            return num1 - num2;
        }
    }
    public static int getMultiplication(int num1, int num2){
        return num1 * num2;
    }
    public static int getDivision(int num1, int num2){
        return num1 / num2;
    }
//part 2
    public static int getInteger(int min, int max) {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        System.out.printf("enter number between %d and %d%n", min,max);
        int userInput = sc.nextInt();
        if (userInput > max || userInput < min) {
            return getInteger(min, max);
        }
        return userInput;
    }
//part 3 factorial
    public static void factorial() {
        Scanner sc = new Scanner(System.in).useDelimiter("\n");

        String willContinue;

        do {
            long userFactorial = 1;
            int userNum = getInteger(1, 10);
            System.out.printf("you chose %d!\n", userNum);
            for (int i = 1; i <= userNum; i++) {
                userFactorial *= i;
            }
            System.out.println(userFactorial);
            System.out.println("Would you like to continue? [yes/no]");
            willContinue = sc.nextLine();
        } while (willContinue.equalsIgnoreCase("yes"));
    }

    //part 4 dice roll
    public static void rollDice(int num) {
        int dice1 = (int) (Math.random() * (num -1) +1);
        int dice2 = (int) (Math.random() * (num -1) +1);
        System.out.printf("dice 1 rolled %d, dice 2 rolled %d%n", dice1, dice2);
    }







    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        System.out.println(getAddition(3, 2));
//        System.out.println(getSubtraction(2, 4));
//        System.out.println(getMultiplication(5, 5));
//        System.out.println(getDivision(18, 2));
//        System.out.println(getInteger(1,10));
//
//        //getInteger(1,10);
//        factorial();

        boolean confirm = true;
        while (confirm) {
            System.out.println("How many sides?");
            int sides = sc.nextInt();
            rollDice(sides);
            System.out.println("Would you like to go again? (yes/no?)");
            String userConfirm = sc.next();
            confirm = userConfirm.equalsIgnoreCase("yes");
        }
    }
}
