import java.util.Scanner;

public class HighLow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int randomNum = (int) (Math.random() * (100 -1) +1);
        boolean guess = false;
        do {
            int userNum = MethodExercises.getInteger(1,100);
            if(userNum == randomNum) {
                System.out.println("Good guess!");
                guess = true;
            }else if(userNum > randomNum) {
                System.out.println("Lower");
            } else if(userNum < randomNum) {
                System.out.println("Higher");
            } else {
                System.out.println("oops!");
            }
        } while(!guess);
    }
}
