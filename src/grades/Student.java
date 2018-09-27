package grades;
import java.util.Scanner;
import java.util.ArrayList;

public class Student {


    private String name;
    private ArrayList<Integer> grades;
    static int numberOfStudents = 0;

    public Student(String name) {
        this.name = name;
        grades = new ArrayList<>();
        Student.numberOfStudents++;
    }
    public String getName() {
        return this.name;
    }

    public void addGrade(int grade) {
        this.grades.add(grade);

    }


    public double getGradeAverage() {
        double gradesTotal = 0;
        for (int grade:this.grades) gradesTotal += grade;
        return gradesTotal/ this.grades.size();

    }

//    @Override
//    public String toString() {
//        return "Name: " + this.name + "\n" +
//                "Grades Average: " + this.getGradeAverage() + "\n";
//
//    }

    public static void main(String[] args) {
        Student student1 = new Student("Brittany");
        student1.addGrade(87);
        student1.addGrade(60);
        student1.addGrade(92);
        System.out.println(student1.name);
        System.out.println(student1.getGradeAverage());
        System.out.println(Student.numberOfStudents);

        Student student2 = new Student("Gary");
        student2.addGrade(55);
        student2.addGrade(65);
        student2.addGrade(75);
        System.out.println(student2.name);
        System.out.println(student2.getGradeAverage());
        System.out.println(Student.numberOfStudents);

        Student student3 = new Student("John");
        student3.addGrade(89);
        student3.addGrade(96);
        student3.addGrade(92);
        System.out.println(student3.name);
        System.out.println(student3.getGradeAverage());
        System.out.println(Student.numberOfStudents);

        Student student4 = new Student("Cindy");
        student4.addGrade(94);
        student4.addGrade(75);
        student4.addGrade(86);
        System.out.println(student4.name);
        System.out.println(student4.getGradeAverage());
        System.out.println(Student.numberOfStudents);


    }

}
