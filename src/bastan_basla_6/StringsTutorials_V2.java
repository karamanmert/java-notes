package bastan_basla_6;

public class StringsTutorials_V2 {
    public static void main(String[] args) {

        StringBuffer stringBuffer = new StringBuffer("mert");
        stringBuffer.append("karaman");//now original string is changed
        System.out.println(stringBuffer); //mertkaraman

        StringBuffer stringBuffer2 = new StringBuffer("Hello");
        stringBuffer2.insert(1,"JAVA"); //1. indexe java ekler. Orj string dğeişir.
        System.out.println(stringBuffer2); //HJAVAello

        StringBuffer stringBuffer3 = new StringBuffer("Hello");
        stringBuffer3.replace(1,3,"JAVA"); //h J A V A l o  //Orj string dğeişir.
        System.out.println(stringBuffer3);

        StringBuilder stringBuilder = new StringBuilder("mertkaraman");
        stringBuilder.append("corum"); //orj string değişti
        System.out.println(stringBuilder);


    }
}
