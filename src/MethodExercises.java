import java.util.Scanner;

public class MethodExercises {

    static Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(getInt(1,10));
        System.out.println(add(2, 3));
        System.out.println(subtract(6, 3));
        System.out.println(multiply(4, 3));
        System.out.println(multiplyWithoutOperator(4, 5));
        System.out.println(divide(8, 2));
        System.out.println(remainder(10, 2));
        System.out.println(quotient(2, 4));
//        System.out.println(songThatNeverEnds();
    }

    public static long factorial(int a) {
        long factorial = 1;

        while(a > 1) {
            factorial *= a;
            a--;
        }

        return factorial;

    }

    public static int getInt() {
        int number = scan.nextInt();
        return number;
    }

    public static int getInt(int min, int max) {
        System.out.println("Please input a number between " + min + " and " + max);
        int number = getInt();
        // if the number is in the range of the min and max, then return it.
        if(number >= min && number <= max) {
            return number;
        } else {
            // otherwise, inform the user that their input was outside the range...
            System.out.println(number + " is outside of the range of " + min + " and " + max);
            // and return a call to getInt(min, max)
            // a process defined in terms of itself is "recursive"
            return getInt(min, max);
        }
    }


    /*
     * "Method Overloading" is when we author methods of the same name, but with differing method signatures.
     * Example: If our add method needs to work for int, double, and long data types
     * Then we need to define 3 separate methods that take in those data types and then return the appropriate type.
     * Flexibility in methods for Java is accomplished through "Method Overloading"
     */

    // this add method will run if the arguments sent are long data types


    public static double add(double a, double b) {
        return a + b;
    }

    public static int subtract(int a, int b) {
        return a - b;
    }

    public static int multiply(int a, int b) {
        return a * b;
    }



    // multiplyWithoutOperator(5, 2)
    // 5 + 5
    // multiplyWithoutOperator(7, 3)
    // 7 + 7 + 7
    // multiplyWithoutOperator(3, 7)
    // 3 + 3 + 3 + 3 + 3+ 3
    public static int multiplyWithoutOperator(int a, int numberOfTimes) {
        if(a == 0 || numberOfTimes == 0) {
            return 0;
        }

        int product = 0;
        // the following runs when both a and numberOfTimes are positive
        // if you ever feel like the code needs to "read your mind"
        // try using a conditional so the code can read the value behind a variable
        // figure out the state under which those lines need to run
        // then, formalize the state into a conditional
        if(a > 0 && numberOfTimes > 0) {
            while(numberOfTimes > 0) {
                product += a;
                numberOfTimes--;
            }
        } else if(a < 0 && numberOfTimes < 0) {
            while(numberOfTimes < 0) {
                product -= a;
                numberOfTimes++;
            }
        } else {
            if(a < numberOfTimes) {
                while(numberOfTimes > 0) {
                    product += a;
                    numberOfTimes--;
                }
            } else {
                while(numberOfTimes < 0) {
                    product -= a;
                    numberOfTimes++;
                }
            }
        }

        return product;
    }

    public static double divide(int numerator, int denominator) {
        return numerator / denominator;
    }

    // If I could rename modulus, then I'd call it "remainder" since it returns the remainder.
    public static int modulus(int a, int b) {
        return a % b;
    }

    // one method may call another
    public static int remainder(int a, int b) {
        return modulus(a, b);
    }

    public static int quotient(int a, int b) {
        return a / b;
    }


    // recursion from kindergarden songs
//    public static void songThatNeverEnds() {
//        System.out.println("This is the song that never ends.");
//        System.out.println("It goes on and on my friends!");
//        System.out.println("Some people started singing it not knowing what it was");
//        System.out.println("And now they keep on singing it forever just because...");
//        songThatNeverEnds();
//    }



}







//import java.util.Scanner;
//public class MethodExercises {
//
//    public static void addition(int i, int j) {
//        System.out.println(i + j);
//    }
//
//    public static void subtraction(int i, int j) {
//        System.out.println(i - j);
//    }
//
//    public static void multiplication(int i, int j) {
//        System.out.println(i * j);
//    }
//
//    public static void division(int i, int j) {
//        System.out.println(i / j);
//    }
//    public static void modulus(int i, int j) {
//        System.out.println(i%j);
//    }
//    public static int getInteger(int min, int max) {
//        Scanner scanner = new Scanner(System.in);
//        scanner.nextLine();
//        System.out.print("Enter a number between 1 and 10: ");
//        int userInput = getInteger(1, 10);
//        if (userInput <= 10) {
//            scanner.nextLine();
//            System.out.print("Enter a number between 1 and 10: ");
//
//            return getInteger(1, 10);
//        }
//    }
//
//    public static int multiplyWithoutOperator(int a, int numberOfTimes) {
//        if(a == 0 || numberOfTimes == 0) {
//            return 0;
//        }
//
////    public static void main(String[] args) {
//add(3, 4);
//subtraction(7, 4);
//multiplication(5,4);
//        division(8, 2); modulus(9,2);
//       getInteger(1, 10);
//       multiplyWithoutOperator(1, 6);




