package section_1.EncapsulationVeThis5;
//encapsulation ve this kullanımı
public class Main {
    public static void main(String[] args) {
        Insan mert=new Insan();
        System.out.println(mert.getTc());
    }
}
class Insan
{
    private String tc;
    int a,b,c;
    public String getTc()
    {
        return tc;
    }
    private void setTc(String tc)
    {
        this.tc=tc;//this:classın gizli yerlerine erişim sağlar. private
    }
    public Insan(int a,int b,int c,String tc)
    {
        this.setTc(tc);
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public Insan()
    {
        this(0,0,0,"0");//this: diğer constructor ı çağırır.
    }

}
