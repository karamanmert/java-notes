package bastan_Basla_2.Exception1;

import java.util.Scanner;
//BU ÖRNEKTE EXCEPTION METHODDAN FIRLATILDI.
public class MethodEx1 {
    //methodun başlıgında exception fırlatılacagı belirtilmeliydi ama unchecked oldugu için gerek yok.
    public static int quotient(int number1, int number2) {
        if (number2 == 0)
            throw new ArithmeticException("Divisor cannot be zero");
        return number1 / number2;
    }


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Prompt the user to enter two integers
        System.out.print("Enter two integers: ");
        int number1 = input.nextInt();
        int number2 = input.nextInt();
        quotient(number1,number2);

    }
}
/*
//BAŞLIKTA BELİRTİLDİ. BELİRTİLMESE DE OLURDU. BU UNCHECKED.
public void setRadius(double newRadius) throws IllegalArgumentException {
if (newRadius >= 0)
radius = newRadius;
else
throw new IllegalArgumentException("Radius cannot be negative");
}
 */