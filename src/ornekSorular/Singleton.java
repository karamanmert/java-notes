package ornekSorular;

class Single {
    public static void main(String[] args) {
        Singleton instance = Singleton.getInstance();
        instance.voice();
    }
}

public class Singleton {

    private static final Singleton instance = new Singleton();

    private Singleton() {

    }

    public static Singleton getInstance() {
        return instance;
    }

    public void voice() {
        System.out.println("hello from singleton class!");
    }
}