package grades;

import java.util.HashMap;
import java.util.Scanner;

public class GradesApplication {

    public static void main(String[] args) {
        HashMap<String, Student> students = new HashMap<>();

        Student james = new Student("James");
        james.addGrade(77);
        james.addGrade(93);
        james.addGrade(99);

        Student craig = new Student("Craig");
        craig.addGrade(50);
        craig.addGrade(100);
        craig.addGrade(89);

        Student bridge = new Student("Bridgette");
        bridge.addGrade(100);
        bridge.addGrade(100);
        bridge.addGrade(100);

        Student jen = new Student("Jennifer");
        jen.addGrade(88);
        jen.addGrade(60);
        jen.addGrade(99);

        students.put("coolcucumber21", james);
        students.put("spottedpanda1", craig);
        students.put("yellowsubmarin3", bridge);
        students.put("laughinghyena8", jen);

        Scanner sc = new Scanner(System.in);
        boolean confirm = true;
        System.out.println("Welcome!");
        System.out.println();
        while(confirm) {
            System.out.println("Here are the GitHub usernames for our students:");
            System.out.println();
            String message = "|";
            for(String userName : students.keySet()){
                message += userName + " | ";
            }
            System.out.println(message);
            System.out.println("What student would you like to see more information on?");

            String search = sc.nextLine();

            Student result = students.get(search);

            if(result == null){
                System.out.printf("Sorry, no student found with GitHub username of %s%n",search);
            } else {
                System.out.printf("Name: %s - GitHub Username: %s%nCurrent Average : %s%n", result.getName(), search, result.getGradeAverage());
            }

            System.out.println("Would you like to see another student? [Yes/No]");
            String response = sc.nextLine();
            if(response.equalsIgnoreCase("yes")){
                confirm = true;
            } else {
                System.out.println("Goodbye, and have a wonderful day!");
                confirm = false;
            }
        }

        }
    }


