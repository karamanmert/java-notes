package bastan_basla_2.Exception1;

//StudentIdNotFound bir custom exception yani UNCHECKED değil  demek oluyor ki methodda throws yazılması gerekiyor.
////1 - methodda sign belirtmek. 2- try catch kullanmak
import java.util.Scanner;

public class CustomExp3 {
    public static void main(String[] args)  // throws StudentIdNotFound //1- SIGN BELIRTILDI
    {
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        Student s = new Student(input);

        if (s.id == 51) {
            System.out.println("bulundu.");
        } else {
            //throw new StudentIdNotFound(); // 1- SIGN BELIRT

            //2- try catch içine al( sign belirtmene gerek kalmaz , olursa da zarar olmaz.)
            try {
                throw new StudentIdNotFound();
            } catch (StudentIdNotFound e) {
                e.printStackTrace();
            }
        }
    }
}

class Student {
    public int id;

    public Student(int id) {
        this.id = id;
    }
}

class StudentIdNotFound extends Exception {
    public StudentIdNotFound() {
        System.out.println("***Student id bulunamadı.***");
    }
}