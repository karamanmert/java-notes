package BastanBasla3.INTERFACE;

public class Interface1 {
    public static void main(String[] args) {
        System.out.println(SadiHoca.K);// Interface.Sabit ismi diyerek sabitlere eriştik.
        SadiHoca sh= (SadiHoca) new Object();
        //sh. dediğimiz an  ınterfacein tüm özellikleri gelir.
    }
}

interface SadiHoca
{
    int K=13; //Tüm data fieldslar public static finaldır.
    void Mert();//Interface'de tüm  abstract, default, and static methodlar dolaylı yoldan PUBLICtir.
    default void Sert(){
        System.out.println("Methodda body sadece static ve defaultlarda vardır.");
        //Interface'de tüm  abstract, default, and static methodlar dolaylı yoldan PUBLICtir.
    }
    static void Kert(){
        System.out.println("Methodda body sadece static ve defaultlarda vardır.");
        //Interface'de tüm  abstract, default, and static methodlar dolaylı yoldan PUBLICtir.
    }


}
interface Hoca2 extends SadiHoca
{
    //başka interfaceden extends aldı.
}
class impDeneme implements SadiHoca
{
        //başka classdan impl.

    @Override
    public void Mert() {
        //implement edildiği için
    }
}
/*

 */
interface i1{
    void merT();
}
interface i2 extends i1{

}
interface i3 extends i1,i2{
 //Interfacler 1 den fazla interface i extend edebilirler
}

