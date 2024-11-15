package section_1.finalAndStaticKeyword.finalK;

import java.util.HashMap;

/**
 * @author karamanmert
 */
public class FinalMain {
    public static void main(String[] args) {
        final StringBuilder sb = new StringBuilder("Hello");
        System.out.println(sb);
        sb.append(" World");
        System.out.println(sb);

        // sb = new StringBuilder("Hello"); // hata verir. çünkü sb final olarak tanımlanmıştır.
        // ***********

        // final class'lar newlenir
        FinalClass fc = new FinalClass();

        // final class'lar extend edilemez.(inherit edilemez.)
        // class FinalClass2 extends FinalClass {} // hata verir.
        // final classX extends FinalClass {} // hata verir.

        final HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "bir");
        map.put(2, "iki");
        // map = new HashMap(); // hata verir. çünkü map final olarak tanımlanmıştır.
        HashMap<Integer, String> map2;
        map2 = map;
        System.out.println(map2);

        HashMap<Integer, String> mp3 = new HashMap<>();
        mp3 = map2; // hata vermez. çünkü mp3 final olarak tanımlanmamıştır.


        // When you declare a variable as final, it means that you can't make that variable point to a different object after you've set it once. However, it doesn't mean the object itself is unchangeable. You can still modify the content of the object (like changing the text in a StringBuilder or updating values in a HashMap), but you can't swap out the entire object it's referring to. This can be useful for ensuring that some parts of your code don't accidentally change important objects, which can help make your code more predictable and less error-prone.
        // yani referansı değiştiremezsin ama içeriğini değiştirebilirsin.
        // örneğin StringBuilder'ın içeriğini değiştirebilirsin ama StringBuilder'ın referansını değiştiremezsin.
        // HashMap'in içeriğini değiştirebilirsin ama HashMap'in referansını değiştiremezsin.

    }
}

class FinalVariable {

    // FINAL KEYWORD - VARIABLE
    // ************************

    // final keyword ile tanımlanan değişkenlerin değeri değiştirilemez.
    final int a = 5;
    // a = 6; // hata verir.

    // final keyword'ü ile bir değer tanımlanabilir ve daha sonra değeri constructor içerisinde ilk değer atalabilir.
    final String b;

    // bu iki şekilde tanımlanır
    FinalVariable() {
        b = "b";
    }
    FinalVariable(String b) {
        this.b = b;
    }

    // final ile tanımlanan değer'in amacı ilerde değiştirilmemektir.
    // dolayısıyla final ile tanımlanan değişkenlerin isimleri büyük harfle yazılır.
    final double PI = 3.14;

    // final değer ststic olarak tanımlanırsa, static blok içerisinde ilk değer atanabilir.
    static final double X;

    static {
        X = 55;
    }

    // en güzel kullanımı ise static final olarak tanımlanıp, direkt olarak ilk değer atanmasıdır.
    // bu şekilde tanımlanan değişkenlerin isimleri büyük harfle yazılır.

    static final double Y = 5;

    /*
    Observation 1: When to use a final variable?
    The only difference between a normal variable and a final variable is that
    we can re-assign the value to a normal variable but we cannot change
    the value of a final variable once assigned.
    Hence final variables must be used only for the values that we want to remain
    constant throughout the execution of the program.
     */

    /*
    Observation 2: Reference final variable?
    When a final variable is a reference to an object,
    then this final variable is called the reference final variable.
    For example, a final StringBuffer variable looks defined below as follows:
    final StringBuffer sb;
    As we all know that a final variable cannot be re-assign.
    But in the case of a reference final variable,
    the internal state of the object pointed by that reference variable can be changed.
    Note that this is not re-assigning. This property of final is called non-transitivity. To understand what is meant by the internal state of the object as shown in the below example as follows:
     */

    // main method ->
}
final class FinalClass {

    // FINAL KEYWORD - CLASS
    // ********************

    // final keyword ile tanımlanan class'lar extend edilemez.

    /*
    There are two uses of a final class:
    Usage 1: One is definitely to prevent inheritance, as final classes cannot be extended.
    For example, all Wrapper Classes like Integer, Float, etc. are final classes.
    We can not extend them.
     */

    /*
    Usage 2: The other use of final with classes is to create an immutable class
    like the predefined String class. One can not make a class immutable without making it final.
     */
}

class FinalMethod {
    // FINAL KEYWORD - METHOD
    // **********************
    // final keyword ile tanımlanan methodlar override edilemez.
    final void method() {
        System.out.println("method");
    }
}

class FinalMethod2 extends FinalMethod {
    // void method() {} // hata verir.
}