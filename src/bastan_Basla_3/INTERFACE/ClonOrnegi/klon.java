package bastan_Basla_3.INTERFACE.ClonOrnegi;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class klon {
    // burada görüyoruz ki = bi boka yaramaz. klonlamak için clone() kullanmalıyız.
    public static void main(String[] args) {
        Calendar calendar = new GregorianCalendar(2003, 2, 1);
        Calendar calendar1 = calendar;
        Calendar calendar2 = (Calendar)calendar.clone();
        System.out.println("calendar == calendar1 is " +
                (calendar == calendar1));
        System.out.println("calendar == calendar2 is " +
                (calendar == calendar2));
        System.out.println("calendar.equals(calendar2) is " +
                calendar.equals(calendar2));
    }
}
