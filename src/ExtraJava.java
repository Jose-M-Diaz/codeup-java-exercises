import java.util.Scanner;
public class ExtraJava {
    public static void main(String[] args) {
        int sum = 0;
        double avg = 0;
        for(int i = 1; i <= 10; i+= 1) {
            sum += i;
            avg = sum/i;
        }
        System.out.println(sum);
        System.out.println(avg);

        Scanner sc = new Scanner(System.in);
        System.out.println("Give me an Integer");
        int num = sc.nextInt();
        int cubed;
        cubed = num * num * num;
        System.out.println("Number is : "+num + " and cube of the "+num+" is :"+cubed);



    }
}
