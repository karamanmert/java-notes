package section_1.Kalanlar6;

public class Main {
    //Subclass, superclassın bir alt kümesi dğeildir. aksine daha geniştir.
    //superclassdaki private değişkenlere get set ile erilebişiriz. ama public get set
    //1 kere extends yapabiliriz.
    //Canlı->Hayvan->Kedi gibi  multilevel inheritance vardır.
    //* super: super classın constructor ı yada methodunu çağırmak için kullanılır.
    //override: üst sınıfdaki methodu alt sınıfta tekrar yazmak.
    //overload:aynı class veya alt sınıfında olabilir. parametreleri dğeiştirerek yeni bir method yazmaktır.
    //polymorphism:üst ve alt classda ses() methodu var ve 2si içinde isim aynı görevi farklı olacaksa kullanılır.


    public static void main(String[] args) {
        Kedi k=new Kedi();
        k.ses();
        k.mert(1);
        k.denemeM();
    }
}
class Hayvan
{
    public Hayvan()
    {
        System.out.println("hayvan oluştu");
    }
    public void denemeM()
    {
        System.out.println("hayvan methodu");
    }
    public void ses()
    {
        System.out.println("hayvan ses çıkardı.");
    }


}
class Kedi extends Hayvan
{
    public Kedi()
    {
        super(); //ILK SATIRDA OLMAK ZORUNDA
        System.out.println("kedi oluştu.");
    }
    public void mert()
    {
        System.out.println("deneme");
    }
    public void mert(int a)//OVERLOAD
    {
        System.out.println("mert"+a);
    }

    @Override
    public void denemeM() {
        super.denemeM();
    }


    public void ses()
    {
        System.out.println("kedi ses çıkardı."); //polymorphsim: method ısım aynı özellij farklı oldu.
    }
    public void mer1t()
    {
        System.out.println("asd");
    }

}
class Kopek extends Hayvan{
    public Kopek(){
        super();
        System.out.println("kopek olustu.");

    }
}
