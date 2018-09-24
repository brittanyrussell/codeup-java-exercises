import java.util.Scanner;
public class ControlFlowExercises {
    public static void main(String[] args) {

//        FIVE THROUGH FIFTHTEEN WHILE
        int i = 5;
        while (i <= 15) {
            System.out.print(i + " ");
            i++;
        }


//        COUNT BY 2S WHILE

        int j = 0;
        do {
            System.out.println(i);
            j +=2;
        } while (j <= 100);

//        MINUS 5 FROM 100 WHILE
        int k = 100;

        do {
            System.out.println(i);
            k-=5;
        }
        while (k >= -10);


//        2 SQUARED
        long l = 2;
        do {
            System.out.println(i);
        l = (long)Math.pow((double)l, 2);
           l *= l;
       } while(l < 1000000);

//            2 SQUARED FOR LOOP
      for (long m = 2; m <= 1000000; m*=m) {
            System.out.println(m);

        }
//            MINUS 5 FROM 100 FOR LOOP
        for (int n  = 100; n >= 5; n-=5) {
            System.out.println(n);
        }


//        FIZZBUZZ

        for (int o = 1; o<=100; o++) {
            boolean fizzOrBuzz = false;
            if (o % 3 == 0) {
                System.out.print("Fizz");
                fizzOrBuzz = true;
            }
            if (o % 5 == 0) {
                System.out.print("Buzz");
                fizzOrBuzz = true;
            }

            if (fizzOrBuzz) {
                System.out.println();
            } else {
                System.out.println(String.valueOf(o));
            }
        }


//        TABLE OF POWERS
        Scanner scanner = new Scanner(System.in);
        System.out.print("What number would you like to go up to?");
        int userInt = scanner.nextInt();
        System.out.println("Here is your table!");
        System.out.println();
        System.out.println(" number | squared | cubed");
        System.out.println("------- | ------- | ----- ");
        for (long n = 1; n <= userInt; n++) {
            System.out.format("%-7s | %-7s | %-7s%n", n, n * n, n * n * n);
        }


//        INPUT NUMBER GRADE
        Scanner input=new Scanner(System.in);
        boolean confirm = true;
        while (confirm) {
            int grade;
            System.out.println("Entered the numbered grade you received: ");
            grade = input.nextInt();
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

            System.out.println("Do you want to continue?");
            Scanner input2 = new Scanner(System.in);
                String answer = input2.nextLine();
            if (!answer.toLowerCase().contains("y")) {
                confirm = false;

            }
        }
    }

}


