package BastanBasla5;

public class DepInjv2 {
    public static void main(String[] args) {
        Carr cc = new Carr(new GasEngine1());
        cc.run();
        System.out.println("*****");
        Carr cc2= new Carr(new ElectricityEngine());
        cc2.run();
    }
}

interface IEngine {
    void start();
}

class Carr {
    private IEngine engine;

    public Carr(IEngine engine) {
        this.engine = engine;
    }

    public void run(){
        engine.start();
    }
}

class GasEngine1 implements IEngine {

    @Override
    public void start() {
        System.out.println("I USE GAS!");
    }
}

class ElectricityEngine implements IEngine {

    @Override
    public void start() {
        System.out.println("I USE ELECT..");
    }
}