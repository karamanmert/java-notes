package bastan_basla_7.singleton;



public class SingletonDesignPattern {
    public static void main(String[] args) {
        A.getA().doSomething();
    }

}
//early
class A {
    private static final A obj = new A();//Early, instance will be created at load time

    private A(){

    }

    public static A getA(){
        return obj;
    }

    public void doSomething(){
        //write your code
        System.out.println("Singleton! Early");
    }
}
//Lazy
/*
class B{
    private static B obj;
    private B(){}

    public static B getA(){
        if (obj == null){
            synchronized(Singleton.class){
                if (obj == null){
                    obj = new Singleton();//instance will be created at request time
                }
            }
        }
        return obj;
    }

    public void doSomething(){
        //write your code
        System.out.println("Singleton! Lazy");
    }
}

class B implements Serializable {
    //your code of singleton
    protected Object readResolve() {
        return getB();
    }

}*/