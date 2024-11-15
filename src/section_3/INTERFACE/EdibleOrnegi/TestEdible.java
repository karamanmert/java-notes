package section_3.INTERFACE.EdibleOrnegi;

//SORU
/*
The Animal class defines the sound method. It is an abstract
method and will be implemented by a concrete animal class.
2. The Chicken class implements Edible to specify that chickens
are edible. So, it implements the howToEat method.
3. The Chicken class also extends Animal (an abstract class) to
implement the sound method.
4. The Fruit class implements Edible. Since it does not
implement the howToEat method, Fruit must be denoted as
abstract
5. The concrete subclasses of Fruit must implement the
howToEat method. The Apple and Orange classes
implement the howToEat method.
 */

/*
import week4.week4Ex.Edible;

public class TestEdible{

}

abstract class Animal
{
    public abstract void sound();
}
class Chicken extends Animal implements Edible
{


    @Override
    public void sound() {

    }

    @Override
    public void howToEat() {

    }
}
abstract class Fruit implements Edible
{
// Data fields, constructors, and methods omitted here

}
class Apple extends Fruit{

    @Override
    public void howToEat() {

    }
}
class Orange extends Fruit
{

    @Override
    public void howToEat() {

    }
}*/