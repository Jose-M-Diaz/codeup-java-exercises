import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Tell or ask Bob something.");
        String bob = sc.nextLine();
        if(bob.endsWith("?")) {
            System.out.println("Sure.");
        } else if(bob.endsWith("!")) {
            System.out.println("Whoa, chill out!");
        } else if(bob.equals("")) {
            System.out.println("Fine, Be that way!");
        } else if(bob.endsWith("Bye")) {
            System.out.println("Bye...");
        } else {
            System.out.println("Whatever.");
        }
    }
}
