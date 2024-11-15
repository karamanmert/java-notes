package section_3.Abstract1;
/*
GORULDUGU UZERE ABSTRACT METHOD OLUNCA CLASSDA ABSTRACT OLDU.
Circle ve Rectangle ise Geo'yu miras aldıgı için içerdeki abstract methodları
implement etmek durumunda kaldı.
Geometric object in new ile nesnesini yaratamayız ama
GeometricObject geoObject1 = new Circle(5);
GeometricObject geoObject1 = new Rectangle(5,3); gibi değerler verebiliriz.
Burada declare type: GeometricObject, actual type: circle olur.
 */
public abstract class GeometricObject {
    /** Abstract method getArea */
    public abstract double getArea();

    /** Abstract method getPerimeter */
    public abstract double getPerimeter();

}
class Circle extends GeometricObject
{
    public  int r;
    public Circle(int r)
    {
        this.r=r;
    }
    @Override
    public double getArea() {
        return Math.PI*r*r;
    }

    @Override
    public double getPerimeter() {
        return 2*Math.PI*r;
    }
}

class Rectangle extends GeometricObject
{
    public int a,b;
    public Rectangle(int a,int b)
    {
        this.a=a;
        this.b=b;
    }
    @Override
    public double getArea() {
        return a*b;
    }

    @Override
    public double getPerimeter() {
        return 2*b*a;
    }
}