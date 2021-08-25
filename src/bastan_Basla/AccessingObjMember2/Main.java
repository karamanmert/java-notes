package bastan_Basla.AccessingObjMember2;
public class Main {
    public static void main(String[] args) {
        //bir başla sınıfın elemanlarının ilk halleri böyledir. erişebiliriz.
        Access a=new Access();

        System.out.println(a.name+"-"+a.age+"-"+a.isScienceMajor+"-"+a.gender+"-");
        //ama aynı sınıfsa initialize etmemiz gerekir.
        int b;
        String s;
        //System.out.println(b+"-"+s); //hata verir. başlangıç değeri ata der.
    }
}

class Access
{
    //
    String name; // name has default value null
    int age; // age has default value 0
    boolean isScienceMajor; // isScienceMajor has default value false
    char gender; // c has default value '\u0000'

}
