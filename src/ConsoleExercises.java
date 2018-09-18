import java.util.Scanner;
public class ConsoleExercises {
    public static void main(String[] args) {

//       PRINT PI WITH 2 DECIMALS
        double pi = 3.14159;
        System.out.format("The value of pi is approximately %.2f.\n", pi);

//        ENTER A NUMBER
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a interger: ");
        int val1 = scanner.nextInt();
        System.out.format("You entered %d\n", val1);

//          ENTER 3 WORDS
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Enter 3 words: ");
        String s1 = scanner1.next();
        String s2 = scanner1.next();
        String s3 = scanner1.next();
        System.out.format("%s%n%s%n%s%n", s1, s2, s3);

//        ENTER A SENTENCE
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner2.nextLine();
        System.out.println(sentence);

//        CALCULATE AREA
        Scanner userInput = new Scanner(System.in);
        System.out.println("Enter length and width" + "(Press Enter after each):");
        double a1, a2, a3;
        a1 = userInput.nextDouble();
        a2 = userInput.nextDouble();
        a3 = a1 * a2;
        System.out.println("Area = " + a3);

//        CALCULATE PERIMETER
        Scanner userInput2 = new Scanner(System.in);
        System.out.println("Enter length and width" + "(Press Enter after each):");
        double p1, p2, p3;
        p1 = userInput2.nextDouble();
        p2 = userInput2.nextDouble();
        p3 = 2 * p1 + 2 * p2;
        System.out.println("Perimeter = " + p3);
    }
}
