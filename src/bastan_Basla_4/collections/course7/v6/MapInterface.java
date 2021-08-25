package bastan_Basla_4.collections.course7.v6;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapInterface {
    public static void main(String[] args) {
        //for key-value pairs
        Map<Integer,String> map = new HashMap<>();
        //Burada normalde ordered çıkacak ama 1-7 arası verdiğim için ordered çıktı. Hashing çalışacak.
        map.put(1,"Pazartesi");
        map.put(2,"Salı");
        map.put(3,"Çarşamba");
        map.put(4,"Perşembe");
        map.put(5,"Cuma");
        map.put(6,"Cumartesi");
        map.put(7,"Pazar");
        System.out.println(map);
        System.out.println(map.get(4)); //get(key)

        //ör: sıralamaya bak
        Map<String,String> map2= new HashMap<>();
        map2.put("myname","mert");
        map2.put("actor","jhon");
        map2.put("ceo","marisa");
        System.out.println(map2);

        //keyleri ezberlemeye gerek yok.

        Set<String> keys= map2.keySet();
        for (String key : keys){
            System.out.println(key+" "+map2.get(key));
        }
    }
}
