package section_3.Abstract1;

public abstract class Abs2 {
    abstract public void m(); //İçerde 1 tane bile abstract method varsa class da abstract olur.
    abstract public void c();
    abstract public void n();
    public void mert(){
        //ABSTRACT CLASSLARDA ABSTRACT OLMAYAN METHODLAR BULUNABILIR.
    }
    int a;
    static void asd(){

    }


}
class x extends Abs2{
        //ABS OLMAYAN BİR CLASSTAN ABST OLAN BİR
    // CLASSI EXTENDS ALIRSAK, ABS METHODLARI IMPLEMENT EDERIZ.

    @Override
    public void m() {

    }

    @Override
    public void c() {

    }

    @Override
    public void n() {
        System.out.println(a);
    }

}
class deneme extends Abs2{

    @Override
    public void m() {

    }

    @Override
    public void c() {

    }

    @Override
    public void n() {

    }
}
abstract class Absss extends Abs2
{
    //m,c,n methodları implement edilmedi çünkü class abstract.
}
abstract class mert extends Abs2
{

    @Override
    abstract public void m();

}
/*

 */
class mertKaraman
{
   // For example, the Object class is concrete, but its subclasses, such as
   //  GeometricObject, may be abstract.
}
abstract class Karaman extends mertKaraman{
    // goruldugu gibi abstract bir class, non abstract classdan miras aldı.
}

