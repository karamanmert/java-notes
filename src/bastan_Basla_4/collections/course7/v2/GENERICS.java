package bastan_Basla_4.collections.course7.v2;

import java.util.ArrayList;
import java.util.List;

public class GENERICS {
    public static void main(String[] args) {
        //GENERICS
        //TYPE-SAFE..
        //Hataları compile time da bulabiliriz. Run time da değil.
        //Objectler ile çalışır. Immutable ile çalışmaz..

        List<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(11);
        System.out.println(integers);

        Container<Double> c = new Container<>();
        c.value=5.5D;
        c.show();
        c.demo(new ArrayList<>()); // Type Number olmalı.. Double ondan

        Container<Number> c2 = new Container<>();//Type Number olmalı(double, int, float ..)
        c2.value=5.5D;
        c2.show();
        c2.demo(new ArrayList<Integer>());  //Burada da Number olanı özellikle Integer diye belirtiyoruz.
    }
}

//T sadece int, double tarzı number olsun dersekk..
class Container<T extends Number> {
    T value;
    public void show() {
        System.out.println("type of the element is:-->>> "+this.value.getClass().getName());
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public void demo(ArrayList <? extends Number> obj){ // extends dediğimiz anda ? ile Number arasında miras ilişkisi var. ?, Numberdan miras alır.
        // ? super Number dersek-> ? classı daha number classının parentlerinden biri olur. Number, ?'dan miras alır.

    }
}

/*
class Container<T> {
    T value;
    public void show() {
        System.out.println("type of the element is:-->>> "+this.value.getClass().getName());
    }
}
*/
