package bastan_basla_5.dependency_injection;

//tighly coupled
//without DIP
public class FirstC {
    public static void main(String[] args) {
        Car c = new Car();
    }
}
//Car class depends on GasEngine class.
class Car{
    public Car(){
        GasEngine engine = new GasEngine();
        engine.start();
    }
}
class GasEngine{
    public void start(){
        System.out.println("I USE GAS!");
    }
}