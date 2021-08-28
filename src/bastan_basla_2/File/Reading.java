package bastan_basla_2.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Reading {
    public static void main(String[] args) throws FileNotFoundException {

        Scanner scan=new Scanner(new File("deneSil.txt"));
        while (scan.hasNext())
        {
            System.out.println(scan.nextLine());
        }
        scan.close(); //dosyayı kapat.


    }
}
