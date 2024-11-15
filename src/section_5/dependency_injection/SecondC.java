package section_5.dependency_injection;

//WITH DIP
//loose coupling
public class SecondC {
    public static void main(String[] args) {
        Carr cc = new Carr(new GasEngine1());
        cc.run();
        System.out.println("*****");
        Carr cc2= new Carr(new ElectricityEngine());
        cc2.run();
    }
}

interface Engine {
    void start();
}

class Carr {
    private final Engine engine;

    public Carr(Engine engine) {
        this.engine = engine;
    }

    public void run(){
        engine.start();
    }
}

class GasEngine1 implements Engine {

    @Override
    public void start() {
        System.out.println("I USE GAS!");
    }
}

class ElectricityEngine implements Engine {

    @Override
    public void start() {
        System.out.println("I USE ELECT..");
    }
}