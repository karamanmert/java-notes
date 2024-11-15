package section_1.oop8.inheritance2;

/**
 * @author karamanmert
 */

/*
Tekli Miras: Java, tekli mirası destekler, yani bir sınıf sadece bir üst sınıftan miras alabilir.
Çoklu Miras: Java'da çoklu mirası (bir sınıfın birden fazla sınıftan miras alması) desteklenmez. Ancak, bu sınıflar arası ilişkiyi arayüzler (interfaces) kullanarak dolaylı yoldan sağlayabilirsiniz.
Method Overriding (Geçersiz Kılma): Alt sınıflar, üst sınıftan miras alınan yöntemleri geçersiz kılabilir ve kendi özel uygulamalarını sağlayabilir.
 */
public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.age = 10;
        dog.color = "Yellow";
        dog.isCarnivor = true;
        System.out.println(dog);
        //------
    }
}


class Animal {
    int age;
    String color;

    void sound() {
        System.out.println("Animal's general sound");
    }
}

class Dog extends Animal {
    boolean isCarnivor;

    @Override
    void sound() {
        System.out.println("Dog's bark");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "isCarnivor=" + isCarnivor +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}

class  A {

}

class B extends A {

}

class C extends B { // böyle miras ok fakat birden fazla aynı anda veremeyiz.

}

// class D extends A,B {} gibi.