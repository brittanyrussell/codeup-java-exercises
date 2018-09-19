import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner input=new Scanner(System.in);

        int grade;

        System.out.printf("Entered the numbered grade you received");
        grade=input.nextInt();


        if (grade >= 90) {
            System.out.println("You received an A");
        } else if (grade >= 80) {
            System.out.println("You received a B");
        } else if (grade >= 70) {
            System.out.println("You received a C");
        } else if (grade >= 60) {
            System.out.println("You received a D");
        } else {
            System.out.println("You received an F");
        }

    }

}


