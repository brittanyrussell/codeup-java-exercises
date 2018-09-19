import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

//        FIVE THROUGH FIFTHTEEN WHILE
//        int i = 5;
//        while (i <= 15) {
//            System.out.print(i + " ");
//            i++;
//        }


//        COUNT BY 2S WHILE

//        int i = 0;
//        do {
//            System.out.println(i);
//            i +=2;
//        } while (i <= 100);

//        MINUS 5 FROM 100 WHILE
//        int i = 100;
//
//        do {
//            System.out.println(i);
//            i-=5;
//        }
//        while (i >= -10);


//        2 SQUARED
//        long i = 2;
//        do {
//            System.out.println(i);
//        i = (long)Math.pow((double)i, 2);
//           i *= i;
//       } while(i < 1000000);

//            2 SQUARED FOR LOOP
//      for (long i = 2; i <= 1000000; i*=i) {
//            System.out.println(i);
//
//        }
//            MINUS 5 FROM 100 FOR LOOP
//        for (int i  = 100; i >= 5; i-=5) {
//            System.out.println(i);
//        }


//        FIZZBUZZ

//        for (int i = 1; i <= 100; i++) {
//            boolean fizzOrBuzz = false;
//            if (i % 3 == 0) {
//                System.out.print("Fizz");
//                fizzOrBuzz = true;
//            }
//            if (i % 5 == 0) {
//                System.out.print("Buzz");
//                fizzOrBuzz = true;
//            }
//
//            if (fizzOrBuzz) {
//                System.out.println();
//            } else {
//                System.out.println(String.valueOf(i));
//            }
//        }


//        TABLE OF POWERS
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to?");
        int userInt = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println(" number | squared | cubed");
        System.out.println("------- | ------- | ----- ");
        for (long i = 1; i <= userInt; i++) {
            System.out.format("%-7s | %-7s | %-7s%n", i, i * i, i * i * i);
      }


//        INPUT NUMBER GRADE
//         Scanner input=new Scanner(System.in);
//
//        int grade;
//
//        System.out.printf("Entered the numbered grade you received");
//        grade=input.nextInt();
//
//
//        if (grade >= 90) {
//            System.out.println("You received an A");
//        } else if (grade >= 80) {
//            System.out.println("You received a B");
//        } else if (grade >= 70) {
//            System.out.println("You received a C");
//        } else if (grade >= 60) {
//            System.out.println("You received a D");
//        } else {
//            System.out.println("You received an F");
//        }

    }

}


