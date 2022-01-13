import java.util.Arrays;

public class ArraysExercises {
    public static Person[] addPerson(Person[] array, Person newPerson) {
        Person[] people = Arrays.copyOf(array, array.length + 1);
        people[array.length] = newPerson; // people[people.length - 1] also works
        return people;
    }
    public static void main(String[] args) {
//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));
        Person[] people = new Person[3];
        people[0] = new Person("Jill");
        people[1] = new Person("Tim");
        people[2] = new Person("Jake");
        for (Person person : people) {
            System.out.println(person.getName());
        }
        System.out.println("---------");
        Person blake = new Person("Blake");
        people = addPerson(people, blake);
        for (Person person : people) {
            System.out.println(person.getName());
        }
    }
}
