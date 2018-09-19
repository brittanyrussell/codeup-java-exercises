import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

        System.out.println("Welcome to the Squares and Cubes Table");
        System.out.println();

        Scanner sc = new Scanner(System.in);
        String choice = "y";

        while(choice.equalsIgnoreCase("y"))
        {
            // get the input from the user
            System.out.println("Enter an Integer: ");
            int integerNext = sc.nextInt();

            System.out.println("Number" + "  " + "Squared" + "  " + "Cubed");
            System.out.println("======" + "  " + "======" + "  " + "======");

            for(int i = 1; i <= integerNext; i++)
            {
                i = integerNext;
                int numberSquared = (int) Math.pow(i, 2);
                int numberCubed = (int) Math.pow (i, 3);

                String message = "\n" + i + "       " + numberSquared + "       " + numberCubed;

                System.out.println(message);
                System.out.println();

                // see if the user wants to continue
                System.out.print("Continue? (y/n): ");
                choice = sc.next();
                System.out.println();
            }
        }


    }

    }


