package util;

import java.util.Scanner;

public class InputTest {
    public static void main(String[] args) {
//        Input input = new Input();
//        boolean confirm = true;
//        while (confirm) {
//            System.out.println(input.getInt());
//            System.out.println("Continue working");
//
//        System.out.println("yes or no");
//        Scanner input2 = new Scanner(System.in);
//        String answer = input2.nextLine();
//        if (!answer.toLowerCase().contains("y")) {
//            confirm = false;
//        }
//        }
//        Input input = new Input();
//        boolean confirm = true;
//        while (confirm) {
//            System.out.println(input.getDouble());
//            System.out.println("Continue working");
//
//        System.out.println("yes or no");
//        Scanner input2 = new Scanner(System.in);
//        String answer = input2.nextLine();
//        if (!answer.toLowerCase().contains("y")) {
//            confirm = false;
//        }
//        }

        Input input = new Input();
        boolean confirm = true;
        while (confirm) {
            System.out.println(input.getBinary());
            System.out.println("Continue working");

        System.out.println("yes or no");
        Scanner input2 = new Scanner(System.in);
        String answer = input2.nextLine();
        if (!answer.toLowerCase().contains("y")) {
            confirm = false;
        }
        }



//        Input input = new Input();
//        System.out.println("Would you like to input a double?");
//
//        if(input.yesNo()) {
//            double someDouble = input.getDouble();
//            System.out.println("You entered: " + someDouble);
//
//        } else {
//            System.out.println("Ok.");
//        }
//
//        System.out.println("Would you like to input an integer?");
//        if(input.yesNo()) {
//            int userInt = input.getInt();
//            System.out.println("You entered: " + userInt);
//        } else {
//            System.out.println("ok");
//        }

    }
}

