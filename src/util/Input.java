package util;
import java.util.Scanner;
public class Input {
    private Scanner scan;

    // constructor runs whenever we see "new Input()"

    public Input() {
        scan = new Scanner(System.in).useDelimiter("\n");
    }

    public String getString() {
        return scan.next();
    }

    public String getString(String prompt) {
        System.out.println(prompt);
        return getString();
    }

    public int getInt() {

        String userInput = this.getString("Give me a number");
        int number;

        try {
            number = Integer.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid number");
            number = getInt();
        }
        return number;
//        return scan.nextInt();
}

    public int getInt(int min, int max) {
        System.out.println("Please input an integer between " + min + " and " + max);
        return getInt();
    }

    public double getDouble() {
        String userInput = this.getString("Give me a decimal number");
        double number;

        try {
            number = Double.valueOf(userInput);
        } catch (NumberFormatException e) {
            System.out.println("This is not a valid decimal number");
            number = getDouble();
        }
        return number;
//        return scan.nextDouble();
    }

    public double getDouble(double min, double max) {

        System.out.println("Please input an integer between " + min + " and " + max);
        return getDouble();
    }

    public boolean yesNo() {

        System.out.println("Please input yes or y to continue");
        String userInput = getString();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getBinary() {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter a binary number:");
        int n= input.nextInt();
        int decimal=0,p=0;
        while(n!=0) {
            decimal +=((n%10)*Math.pow(2,p));
            n=n/10;
            p++;
        }
        return decimal;

    }

//    public int getHex() {
//
//        int number;
//
//        void getValue()
//        {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Please enter hexadecimal to convert: ");
//            number = Integer.parseInt(sc.nextLine(), 16);
//            sc.close();
//        }
//
//        void toConvert()
//        {
//            String decimal = Integer.toString(number);
//            System.out.println("The Decimal value is : " + decimal);
//        }
//        public static void main(String[] args)
//        {
//            HexaToDecimal htd = new HexaToDecimal();
//            htd.getValue();
//            htd.toConvert();
//        }
//    }

}
