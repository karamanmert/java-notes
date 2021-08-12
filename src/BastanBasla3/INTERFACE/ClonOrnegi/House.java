package BastanBasla3.INTERFACE.ClonOrnegi;

public class House implements Cloneable,Comparable{
    @Override
    public int compareTo(Object o) {
        return 0;
    }

    //Object classındaki clone() ı implement etmek zorundayız. Cunku clonable.
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
