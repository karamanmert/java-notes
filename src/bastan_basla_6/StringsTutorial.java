package bastan_basla_6;

public class StringsTutorial {
    public static void main(String[] args) {

        char[] ch = {'m','e','r','t'};
        String s = new String(ch);
        System.out.println(s); //char , stringe dönüştü

        String s2= "mert";
        String s3 = "mert";
        String s4 = new String("mert");
        System.out.println(s2==s3); //aynı adres doğru
        System.out.println(s3==s4); //farklı adres yanlış
        System.out.println(s3.equals(s4)); //aynı içerik doğru.

        //STRING OBJECTS ARE IMMUTABLE ( DEĞİŞMEZ. FARKLI BİR DEĞİŞKENE EŞİTLEMEZSEN
        //VEYA REFERANSI DEĞİŞTİRMEZSEN
        // str = "deneme" dersen eğer
        //str, pool içinde deneme adlı bir alanı gösterir.
        // str="deneme5211" dersen , str nin referansı değişir. yukarda bir deneme stringli kalır, str ise aşağıda deneme5211 i gösterir.
        // bu durumda değişiyor gibi gözüküyor ama str deneme içeriği değişmez. strnin gösterdiği adres değişir.
        // str.toUpperCase() -> dersen, strnin gösterdiği adrese gidip oradaki karakterleri büyük yapmaya çalışır.
        // strnin adresi sabit ve orası bir string old. için dğeişmez.
        //PNG YE BAK
        String str = "deneme";
        str.toUpperCase();
        System.out.println(str); // output : deneme

        //s = str.toUpperCase() -> deseydin s nin adresi , toUpperCasein oluşturduğu stringi gösterirdi ve sonuç değişirdi.




        /*
        String s1="java";//creating string by Java string literal
        char ch[]={'s','t','r','i','n','g','s'};
        String s2=new String(ch);//converting char array to string
        String s3=new String("example");//creating Java string by new keyword
        System.out.println(s1+" "+s1.getClass());
        System.out.println(s2+" "+s2.getClass());
        System.out.println(s3+" "+s3.getClass());
         */

        /*
        String a="    Hello    "; //Pool'da "    Hello    " oluşturdu. a -> bu alanı refer eder.
        System.out.println(a);

        a= a.trim();              // "Hello" adlı başka bir string oluştu. Farklı bir adrese sahip. a artık bunu refer eder.
        System.out.println(a);  //trim() baştan sonran boşluk siler.

        String b = a.concat("World");  //"HelloWorld" adlı yeni bir string oluştu ve farklı bir adrese sahip. b HelloWorld stringini refer eder.
        System.out.println(b);      //concat. stringin sonuna string ekler.

        String c = a+"World";//c stringili "HelloWorld" stringi oluşturup
        // orayı refer etmek istedi fakat daha önceden b değişkeni o stringi oluşturup poola atmıştı.
        // dolayısıyla c değişkeni, b nin oluşturduğu "HelloWorld" stringinin adresini refer eder.
        System.out.println(c);

        String d = b.toLowerCase(); //"helloworld" adlı yeni bir string oluşup poola atıldı.
        System.out.println(d);
*/

    }
}
