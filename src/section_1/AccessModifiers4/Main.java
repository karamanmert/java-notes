package section_1.AccessModifiers4;

import section_1.AccessModifiers4.p1.A;

public class Main {

    public static void main(String[] args) {
        A xx = new A();
        System.out.println(xx.a); // public erişimi sağlandı
        // private sadece aynı classtan erişim var direkt elendi.
        // default aynı paketten erişim var elendi.
        // protected ise aynı class değil, aynı paket değil, alt sınıf da değil gene elendi
    }
    /*
    ERİŞİLEBİLİRLİK
    public : Aynı class :+ Aynı Paket:+ Alt classa farklı paketten erişim: + Farklı paketten erişim:+
    protected : Aynı class :+ Aynı Paket:+ Alt classa farklı paketten erişim: + Farklı paketten erişim:-
    default(no modifier):Aynı class :+ Aynı Paket:+ Alt classa farklı paketten erişim: - Farklı paketten erişim:-
    private: Sadece aynı class+

     */

    /*

    ERİŞİLEBİLİRLİK

+----------------------------+-----------+-----------+-----------+-----------+
|                            |   Aynı    |   Aynı    |  Alt class |  Farklı   |
|                            |  class    |  paket    | (farklı p.)|  paket    |
+----------------------------+-----------+-----------+-----------+-----------+
| public                     |     ✓     |     ✓     |     ✓     |     ✓     |
+----------------------------+-----------+-----------+-----------+-----------+
| protected                  |     ✓     |     ✓     |     ✓     |     -     |
+----------------------------+-----------+-----------+-----------+-----------+
| default (no modifier)      |     ✓     |     ✓     |     -     |     -     |
+----------------------------+-----------+-----------+-----------+-----------+
| private                    |     ✓     |     -     |     -     |     -     |
+----------------------------+-----------+-----------+-----------+-----------+

     */

}
