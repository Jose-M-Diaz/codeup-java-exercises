import java.util.Scanner;
public class MethodExercises {
    public static int getAddition(int num1, int num2){
        return num1 + num2;
    }
    public static int getSubtraction(int num1, int num2){
        return num1 - num2;
    }
    public static int getMultiplication(int num1, int num2){
        return num1 * num2;
    }
    public static int getDivision(int num1, int num2){
        return num1 / num2;
    }

    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10");
        do{
            int input = sc.nextInt();
        }while(getInteger(1, 10));
    }

    public static void main(String[] args) {
        System.out.println(getAddition(3, 2));
        System.out.println(getSubtraction(2, 4));
        System.out.println(getMultiplication(5, 5));
        System.out.println(getDivision(18, 2));
        System.out.println(getInteger());
    }
}
