package bastan_Basla_5;
//tighly coupled
//without DIP
public class DependencyInjection {
    public static void main(String[] args) {
        Car c = new Car();
    }
}

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