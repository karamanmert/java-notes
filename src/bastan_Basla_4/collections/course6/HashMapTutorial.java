package bastan_Basla_4.collections.course6;

import java.util.HashMap;
import java.util.Map;

public class HashMapTutorial {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<Integer, String>();//Creating HashMap
        map.put(1,"Mango");  //Put elements in Map
        map.put(2,"Apple");
        map.put(3,"Banana");
        map.put(4,"Grapes");
        System.out.println(map);

        for (Map.Entry<Integer, String> integerStringEntry : map.entrySet()) {
            System.out.println(integerStringEntry);
        }

    }
}
