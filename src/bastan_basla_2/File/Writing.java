package bastan_basla_2.File;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class Writing {
    public static void main(String[] args) throws FileNotFoundException {
/*
        File file=new File("mert.txt");
        PrintWriter pw=new PrintWriter(file);
        pw.print("mert");
        pw.print("karaman\n");
        pw.println("mertttt");
        pw.close();
*/



        File file=new File("src/bastan_basla_2/File/texts/deneSil.txt");
        if (file.exists())
            System.out.println("already exists.");

        PrintWriter pw=new PrintWriter(file);//dosya yoksa diye excp. fırtlattı. try catch e de alınabilirdi.
        pw.print("John T Smith ");
        pw.println(90);
        pw.print("Eric K Jones ");
        pw.println(85);
        pw.close(); //Kapatmayı unutma


    }
}
