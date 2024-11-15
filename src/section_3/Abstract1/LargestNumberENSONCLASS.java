package section_3.Abstract1;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;

public class LargestNumberENSONCLASS {
    public static void main(String[] args) {
        ArrayList<Number>list=new ArrayList<>();
        list.add(31);
        list.add(412.123);
        list.add(new BigDecimal("0909090989091343433344343"));//string olarak yazılır. içerde çevirilir.
        list.add(new BigInteger("3432323234344343101"));
        System.out.println("The largest number is " +
                getLargestNumber(list));
    }

    private static Number getLargestNumber(ArrayList<Number> list) {
        Number n1=list.get(0);
        for (int i = 1; i <list.size() ; i++) {
            if(n1.doubleValue()<list.get(i).doubleValue())
                n1=list.get(i);
            //Number tipindeki objeleri kıyaslamak için doubleValue methodunu kullandık
            //Bu method Number classında abstract olarak tanımlıdır.
        }
        return n1;
    }
}
