package section_1.oop8.encapsulation1;

/**
 * @author karamanmert
 */
public class Main {

    /*
    Kapsülleme, veriyi ve bu veriye erişen yöntemleri bir arada tutarak, verinin doğrudan dışarıdan erişimini engeller ve bu veriyi kontrol altında tutar. Bu, verilerin bütünlüğünü korur ve nesne üzerinde yapılacak değişiklikleri düzenler.
    Variables ( attribues, fields ne dersen artık ) private tanımlanır.
    Bu private değikenlere erişim de getter ve setter public methodları ile tanımlanır.
      */

    public static void main(String[] args) {
        // before encapsulation
        Car car = new Car();
        car.age = 1;
        car.brand = CarEnum.TOYOTA;

        car.age = 4;
        System.out.println(car);
        // Burada görüldüğü gibi dışardan veri manipulasyonuna uygun bir haldedir.
        //Riskler:
        //Veri Doğruluğu: Veri alanına geçersiz veya mantıksız değerler atanabilir, çünkü kontrol mekanizması yoktur.
        // Kapsülleme: Kapsülleme prensiplerine aykırıdır çünkü veri doğrudan erişilebilir ve değiştirilebilir.



        Car2 car2 = new Car2();
        car2.setAge(10);
        car2.setBrand(CarEnum.TOYOTA);
        System.out.println(car2);
    }
}

class Car {
    int age;
    CarEnum brand;

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", brand=" + brand +
                '}';
    }
}

class Car2 {
    private int age;
    private CarEnum brand;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public CarEnum getBrand() {
        return brand;
    }

    public void setBrand(CarEnum brand) {
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Car{" +
                "age=" + age +
                ", brand=" + brand +
                '}';
    }
}

enum CarEnum {
    TOYOTA
}