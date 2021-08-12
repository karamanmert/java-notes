package BastanBasla.StaticVsInstance3;
public class Main {

    public static void main(String[] args) {
        Student mert=new Student();
        System.out.println(mert.getName());
        System.out.println(mert.kilo);//INSTANCE METHOD, STATIC VE INSTANCE ALANLARA ERİŞİM SAĞLADI.
    }
}
class Student {
    //bu örnekte static değişken ve method + instance method ve değişken kullanıldı.
    //static alanlardan sadece staticlere erişim sağlanırken
    //instance method ve variable den staticlere ve instancelere erişim sağlandı.
    static int kilo;
    String name;
    static void deneme()
    {
        //CLASSDA STATIC OLARAK TANIMLANMAYAN BIR DEĞİŞKENE BURADNA ERİŞEMEZSİN.
        //name e erişilemez.
        System.out.println("deneme"+kilo);
    }
    public String getName()
    {
        this.kilo=12;
        System.out.println(name);
        deneme();
        return "mert";
    }
}
