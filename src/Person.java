import java.util.Scanner;
public class Person {
    private String name;



    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello, " + this.name);
    }

    public static void main(String[] args) {
//        Person bill = new Person();
//        bill.setName("Bill");
//        System.out.println(bill.getName());
//        bill.sayHello();

//        Person person1 = new Person();
//        Person person2 = new Person();
//        person1.setName("John");
//        person2.setName("John");
//        System.out.println(person1.getName().equals(person2.getName())); //true
//        System.out.println(person1 == person2); // false

//        Person person1 = new Person();
//        person1.setName("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2); // true

        Person person1 = new Person();
        person1.setName("John");
        Person person2 = person1;
        System.out.println(person1.getName());
        System.out.println(person2.getName());
        person2.setName("Jane");
        System.out.println(person1.getName());
        System.out.println(person2.getName());
    }
}


