package bastan_basla.Visibility4.p2;

import bastan_basla.Visibility4.p1.A;

public class B  extends A {
    public void main(String []args) {
        // System.out.println(i); //i default olduğu için farklı paketten erişilmez.
         System.out.println(a); //a public her yerden erişilir.
        //System.out.println(b); // b private sadece oldugu classtan erişilir.
        m();
    }
}
