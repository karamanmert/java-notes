package BastanBasla.StaticVsInstance3;

public class A {
    int i=5;
    static int k=2;
    public static void main(String[] args) {
        A a=new A();
        int j=a.i;//OK, a.i accesses the object's instance variable
        a.m1();// OK. a.m1() invokes the object's instance method
    }
    public void m1()
    {
        i=i+k+m2(i,k);
    }
    public static int m2(int i,int j)
    {
        return (int)(Math.pow(i,j));
    }
}