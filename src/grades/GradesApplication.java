package grades;

import java.util.HashMap;
import util.Input;

public class GradesApplication {
        static HashMap<String, Student> records;

        static void init() {
            records = new HashMap<>();
            Student daniel = new Student("Daniel");
            daniel.addGrade(42);
            records.put("danielfryar", daniel);

            Student james = new Student("James");
            james.addGrade(85);
            records.put("james.kevin.a.young", james);

            Student brittany = new Student("Brittany");
            brittany.addGrade(87);
            records.put("githubmonster", brittany);

            Student william = new Student("William");
            william.addGrade(78);
            records.put("redneckgit", william);
        }
    public static void main(String[] args) {
        init();
        System.out.println("Welcome!");
        System.out.println();
        System.out.println("Here are the github usernames of our students: ");
        System.out.println();
        for(String githubhandle: records.keySet())
            System.out.print("|" + githubhandle + "|  ");
        Input input = new Input();
        String githubhandle;
        String answer = "yes";
        do {
            System.out.println();
            githubhandle = input.getString("What student would you like to see more information on?\n>");
            System.out.println();
            if (records.containsKey(githubhandle)) {
                Student student = records.get(githubhandle);
                System.out.println("Name: " + student.getName() + " - Github Username: " + githubhandle + "\n" +
                        "Current Average: " + student.getGradeAverage());

            } else {
                System.out.println("Sorry, no student found with the gihub username of \"" + githubhandle + "\".");
            }
            System.out.println("Would you like to see another student?\n>");
            answer = input.getString();

        } while (!answer.toLowerCase().contains("n"));




    }
}
