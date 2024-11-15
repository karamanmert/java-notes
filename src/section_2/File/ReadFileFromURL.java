package section_2.File;


import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class ReadFileFromURL {
    public static void main(String[] args) throws IOException {
        //urlden dolayı IOExp fırlatılmak zorunda kalındı.
        URL url = new URL("http://www.oracle.com/");
        Scanner input = new Scanner(url.openStream());
        int max = 0;
        while (input.hasNext()) {
            if (max < input.nextInt())// verilen sitedei max sayıyı bulduk.
                max = input.nextInt();
        }
        System.out.println(max);


    }

}
