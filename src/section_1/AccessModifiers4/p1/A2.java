package section_1.AccessModifiers4.p1;

/**
 * @author karamanmert
 */
public class A2 {
    public static void main(String[] args) {
        A aaa = new A();
        System.out.println(aaa.a);
        System.out.println(aaa.i);
        aaa.m();
        // aaa.b private
    }
}
