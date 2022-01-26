package grades;

import java.util.ArrayList;

public class Student {
    private String name;
    ArrayList<Integer> grades;

    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }

    // returns the student's name
    public String getName(){
        return this.name;
    }
    // adds the given grade to the grades property
    public void addGrade(int grade){
        this.grades.add(grade);
    }
    // returns the average of the students grades
    public double getGradeAverage(){
        double sum = 0;
        for(int grade : this.grades){
            sum += grade;
        }
        return sum / this.grades.size();
    }

    public static void main(String[] args) {
        Student billy = new Student ("billy");
        billy.addGrade(88);
        billy.addGrade(90);
        billy.addGrade(100);

        System.out.println(billy.getName() + " average grade score is " + billy.getGradeAverage());
    }
}
