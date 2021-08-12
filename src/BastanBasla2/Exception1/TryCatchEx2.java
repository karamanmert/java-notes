package BastanBasla2.Exception1;

import java.util.Scanner;
//try catch ile exception yapıldı.
public class TryCatchEx2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        try {

            System.out.println(number1 + " / " + number2 + " is "
                    + number1/number2);

        }
        catch (ArithmeticException ex) {
            System.out.println("Exception: an integer " +
                    "cannot be divided by zero ");
            //ex.getMessage();
        }

        System.out.println("Execution continues ...");
    }
}