import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        boolean confirmation = true;
        Scanner sc = new Scanner(System.in);

        do {
            String bob = sc.nextLine();
            if (bob.endsWith("?")) {
                System.out.println("Sure.");
            } else if (bob.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (bob.equals("")) {
                System.out.println("Fine, Be that way!");
            } else if (bob.endsWith("Bye")) {
                System.out.println("Bye...");
                confirmation = false;
            } else {
                System.out.println("Whatever.");
            }
        }while(confirmation);
    }
}
