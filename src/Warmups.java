import java.util.Scanner;

public class Warmups {
    public static void main(String[] args) {
//        String difference = "Java is statically typed, while Javascript is dynamically typed";
//        System.out.println(difference);

        Scanner scanner = new Scanner(System.in);
        System.out.println("What did you have for breakfast? ");
        String userBreakfast = scanner.nextLine();
        System.out.printf("%s, ah yes the breakfast of CHAMPIONS!", userBreakfast);
    }
}
