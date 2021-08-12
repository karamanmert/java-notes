/*
--ABSTRACT--
superclass: daha üstte, daha genel, subclass: altta ve daha özel

super class, sub classlarının ortak özelliklerini içermeli.

**Bazen superclassın instanceının yaratılmamasını isteriz.
Bu gibi durumlarda abstract classları kullanırız.(new ile yaratılamazlar.)

Örneğin bizim bir GeometricObject classımız var ve bundan circle ve rectangle
miras alıyor. GeometricObjectlerin alan ve çevre hesapları vardır ama tüm hepsinde
farklı hesap yapılır. Bu yüzden bu alan ve çevre abstract tanımlanır.
methodu abstract tanımlarsak, classta otomatik abstract olur çünkü;
abstract method içeren bir class abstract olmalıdır.
(ornekli Abs2 e bak)

method abstract ise, class da abstracttır demiştik.
Eğer süperclassımız abstractsa ve biz methodlarını implement etmek istemiyorsak
Classımızı abstract tanımlarız.(Ornek Absss classı.)
Yani abstract classtan miras alıyorsak, ve alt classımız abstract değilse
Mecburen abstract olanları implement edecek.

**Abstract classlarda, abstract olmayan methodlar olabilir(orn abs2)

**Abstract classlar, subclasslar için base görevi görürler.

Abstract classtan miras aldıgımız bir methodu sonradan abstract yapabiliriz.
Çok nadir görülür bu kullanım.
Neden kullanılır. Ust classdaki methodu implement edecez mecburen, ama alt classda
işe yaramıyor.. abstract yaparız bizde. subclassta invalid olur.(mert.java)

Abstract bir class, Concrete(somut)(abstract olmayan) bir classtan miras alabilir.(orn abs2)
For example, the Object class is concrete, but its subclasses, such as
GeometricObject, may be abstract.

Abstract classın new ile instance'ını yaratamıyoruz.
Ama abstract class data type olarak kullanılabilir.
Yani GeometricObject[] geo = new GeometricObject[10]; gibi bir şey yapabiliyoruz.
Tüm elemanları geometricObject olan bir array yarattık.
GeometricObject(abstracttı unutma)
Böylelikle GeometricObject'in instanceını oluşturup referans olarak arrayi gösteriyoruz.
GeometricObject geo[]=new GeometricObject[3];
geo[0]=new Circle(5);( ORNEK m classında denendi)

**Abstract methodlar static olamaz.
Normalde compiler abstract classın nesnesini üretemediğin için çağırıldığı zaman
implemantation'ı garanti eder.
Ama static methodlar doğrudan çağırıldığı için(ClassAdı. Method adı = Math.PI),
abstract yapılması demek, tanımsız bir methodu çağırabileceğiz anlamına geliyor.
(abstract methodlarda body yok. eğer static olarak da tanımlanırsa ve erişilmeye çalışılırsa,
bodysiz bir alana erilmeye çalışıacak Bu yüzden olmaz. tanımyalamayız.)
abstract class Foo {
abstract static void bar();
}
// Calling a method with no body!
Foo.bar();

Number numeric wrapper classlar(Double, Integer, Float) ve BigDecimal, BigInteger için
bir abstract superclasstır.
Eğer Number classında doubleValue() methodu tanımlı olmasaydı, farklı türden sayıları
karşılaştıramazdık.(örnek en büyük sayıyı bulacaz ve karşılaştırmak istiyoruz)
(ORNEK LargestNuumberENSONCLASS a bak.)


--INTERFACE--

Interface  bir referans tipidir.
Sabit değerleri, abstract methodların method signaturelarını,
default ve static methodları içerir.(ORN Interface1.java, SadiHoca Interface'i)

Methodda body sadece static ve defaultlarda vardır.

Interfaceler instantiated(örneklendirilemezler) yani new ile yaratılamazlar.
Classlar tarafından impelement edilebilir veya
Başka interfaceler tarafından extends edilebilirler.(ORN Interface1.java)
Eğer bir class bir Interfacei implement ederse, içindeki
methodları da implement eder.

Interfaceler Javada özel bir class gibi ele alınırlar.

Bir çok yoldan Interfaceler, abstract classlara benzeler.
Ama interface'in amacı related yada unrelated(ilgili, ilgisiz) classların
nesneleri için ortak amaç belirtmektir.(common behavior)
Örneğin nesnelerin comparable, edible, cloneable olup olmadıklarını
uygun bir interface kullanarak söyleyebilirsin.

Tüm interfaceler ayrı ayrı bytecodelarda derlenirler.(normal bir class gibi)

Interfaceler de abstract classlarda olduğu gibi instance ı oluşturulamaz.(new ile)
(Constructorları yoktur.)

Interfaceler çoğu zaman Abstract classlar gibi kullanılırlar.
Örneğin Interfaceleri data type olarak kullanabiliriz.

Interfacler 1 den fazla interface i extend edebilirler(ORN interface1.java interface i3)

Default methodlar default, static methodlar static olarak tanımlanır.
default void mert() {} static void mert(){} gibi.

Interface'de tüm  abstract, default, and static methodlar dolaylı yoldan PUBLICtir.
Yani public yazmamız gerekmez.
Tüm data fieldslar public static finaldır.(Resim ekledim png)
Tüm abstract methodlar public abstracttır. Yani bunlar içerde yazılmazlar.
void mert() aslında = public abstract void mert()tir ama modifier ihmal edilir.
(ORN SadiHoca)

Interface içindeki sabitlere InterfaceAdı.CONST_NAME olarak erişebiliriz.
(ORN interface1.java) ör:SadiHoca.K

class Chicken extends Animal implements Edible( hem exteds hem implements varsa sıralama)

-Edible için örnek package var.Orada çözdüm.

Yeni bir interface tanımladıgımızda, yeni bir referans data type tanımlıyoruz.
Referans tipi interface olan bir değişken yaratırken, interface tipindeki değişkene atadığımız
tüm objeler o Interface i implement etmek zorundadır.

public Object findLargest(Object o1, Object o2) {
Relatable obj1=(Relatable)o1;
Relatable obj2=(Relatable)o2;
if ((obj1).isLargerThan(obj2)>0
return o1;
else
return o2;
}
Bu o1 ve o2 objeleri Relatable ı implement etmek zorunda.(ORN interface1.java da main metodunda)
Örneğin bu örnege bakarsak Interface tipindeki obj1 ve obj2 den o1 ve o2 yaratıldı.
SadiHoca sh= (SadiHoca) new Object();
        //sh. dediğimiz an  ınterfacein tüm özellikleri gelir.
Bu method objelerin daha önceden bir inheritance alıp almadığıba bakmadan tüm relatable objeleri için çalışır
Obje Relatable i implement ettiğinde artık hem kendi class tipinde hemde relatable tipindedir.
Bu multi inheritancein avantajlarındandır.

Eğer bir class bir interface i impelement ederse, interface de superclass gibi davranır.
Suppose that c is an instance of Class2. c is also an instance of Object, Class1,
Interface1, Interface1_1, Interface1_2, Interface2_1, and Interface2_2.
(ORN FOTOGRAF)(int2)

**Eğer bir interface i değiştirmek istersek, onu implement eden tüm classlarda bozulma olacaktır.
Eğer bir method eklemek istersek;
Yeni bir interface tanımlayıp eski interfacei extedns ederiz. Böylece kullanıcılar
update gelen interfacei yada eskisini, yani neyi kullanmak isterse onu seçer.
Yada methodları default olarak tanımlarız. Nasıl olsa default methodları implement etmek zorunda değildik.
Böylece o methodu kullanmak isteyen ayrıca ekler.
(Eklenebilir ama zorunluluk yok.)

Comparable Interface: compareTo() methodu ile objeleri karşılaştırabiliriz.
Örneğin aynı türdeki generic iki objenin büyüğünü bulmak istiyoruz. bunları karşılaktırmamız lazım Burada kullanırız.

public interface Comparable<E> {
public int compareTo(E o);
}
Üstteki compareTo methoduna bakalım E tipinde bir o gelmiş.
Biz o ile kendi classımızın objesini karşılaştıracağız. Eğer objemiz, o dan büyükse 1, eşitse 0, o dan küçükse -1 döner.

Comparable bir generic interfacedir.

Byte, Short, Integer, Long, Float, Double,
Character, BigInteger, BigDecimal, Calendar, String, and
Date classları Comparable'ı implement ederler.
Or: public class Integer extends Number implements Comparable<Integer> gibi.
Bundan dolayı sayılar, stringler, hatta tarihler comparabledir.

System.out.println(new Integer(3).compareTo(new Integer(5))); //-1
java.util.Date date1 = new java.util.Date(2013, 1, 1);
java.util.Date date2 = new java.util.Date(2012, 1, 1);
System.out.println(date1.compareTo(date2));             //1

Örneğin
n bir Integer objesi olsun. s String. d ise Date.
o zaman;
n instanceof Integer, n instanceof Object, n instanceof Comparabledır.
s ve d ye de aynı şey geçerli. herşey bir objedir. ve bunlar comparableden impl. alır.


Clonable Interface: bir objeyi klonlanabilir yapar.
Bu interfacein içi boştur. Bu boş interfacelere marker interface denir.
Bir marker interface sabitler veya yöntemler içermez.
Bir sınıfın istenen bazı özelliklere sahip olduğunu belirtmek için kullanılır.

Clonable ı implement eden bir class, Clonable olarak işaretlenir.(marked)
Ve bu classın objeleri Object sınıfının clone() Methodu kullanılarak klonlanabilir.
(ORN ClonOrnegı Package-> klon.java)
or: 2 obje var. 1yi 2.nin aynısına atamak istersek, = işe yaramaz.
obje2=obje1.clone() dememiz gerekir.

Eğer bir class Clonable ı implement ederse, clone() u override etmek zorunda
bunu elle ekliyoruz. (ORN clonOrnegi -> House)


//--//
Interface vs Abstract
İkisinide new ile yaratamayız. İkisinde de methodlar bulunabilir.
Farkları;
1-Abstract classlarda: Static ve Final olmayan data field ekleyebiliyoruz.
Ayrıca  public, protected, and private concrete methods ekleyebiliyoruz.
Interfacede ise:Tüm sabitler otomatik olarak public, static ve finaldır.
Tüm methodlar ise publictir.(body si olsun olmasın. yani abstract, default, static -> method varsa public)

2-abstract olup olmamasına bakmazsızın 1 class extend edilebilirken,
sınırsız interface implement edebilirsin.
3-Interfaceler classlara  göre daha esnektir.Çünkü her şeyi tek bir sınıfa sığdırmak
gerekmez.(Edible(düzenlenebilir) de oldugu gibi)

Strong is-a relationship: classlar arasındaki parent-child modellemesidir.
weak is-a relationship: interfaceler ile modellenir.
(bilgi olsun diye önemli değil)

---Ne zaman Interface ne zaman Abstract??
Abstract:
Kodu birbiriyle yakından ilişkili birkaç sınıf arasında paylaşmak istiyorsak kullanabiliriz.
Sınıfı genişletecekken ( extends yada implement ) methodların publicten başka modifier
almasını istiyorsak kullanabiliriz.
(Cunku interface de methodlar public olur.)
Static olmayan veya final olmayan data field(const) tanımlamak istersek kullanabiliriz.

Interface:
Birbiritle alakası olmayan classları implement etmek istersek kullanabiliriz.
(Örn , the interfaces Comparable and Cloneable are implemented by many unrelated classes.)
Belli bir özelliği eklemek istiyoruz ama sahibiyle ilgilenmiyoruz o zaman kullanılabilir.
Multiple inheritance den yararlanmak istediğimizde kullanabiliriz.

Sikik özellikler:
Class tek bir amaca hizmet etmeli.
Yazım kurallarına uyulmalı.
Classlara, method ve data fieldlara bilgilendirici isimler verilmeli
Önce data field, sonra constructor en son da methodlar tanımlanmalı
Programlama hatalarını önlemek için her zaman const oluşturuın ve ilk değer ataması yapın.
Clientin erişmesini istemediğimiz alanları private tanımlayın. get set
Classın açıklanması kolay olmalıdır.
Class tekrar kullanılabilir olmalıdır. Kullanıcılar sınıfları farklı kombinasyonla birleştirebilirer.


Static vs Instance
Classın bellir bir method veya data fieldına bağlıyla In

 A variable or method that is dependent on a specific instance of
the class must be an instance variable or method.
-Değişken classın tüm instancelerinde olacaksa static tanımlanmalı.
-static alanları her zaman classAdı.StaticIsmı olarak kullan. okuma ve anlamayı kolaylaştırır. Math.Pı

Constructorın parametresine static değer gönderme. Bunu set get ile hallet.

























 */