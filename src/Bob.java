import java.util.Scanner;
public class Bob {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean confirm = true;
        while (confirm) {
            System.out.println("Talk to bob: ");
            String userInput = scanner.nextLine();
            String bob1 = "Sure.";
            String bob2 = "Whoa, chill out!";
            String bob3 = "Fine. Be that way!";
            String bob4 = "Whatever.";
            if (userInput.endsWith("?")) {
                System.out.println(bob1);
            } else if (userInput.endsWith("!")) {
                System.out.println(bob2);
            } else if (userInput.endsWith(" ")) {
                System.out.println(bob3);
            } else {
                System.out.println(bob4);
            }
            System.out.println("Do you want to continue?");
            Scanner input2 = new Scanner(System.in);
            String answer = input2.nextLine();
            if (!answer.toLowerCase().contains("y")) {
                confirm = false;

            }

        }
    }
}
