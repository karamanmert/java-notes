package bastan_basla_4.collections.course7.v4;

import java.util.ArrayList;
import java.util.Collections;
//compareTo()
//2 objeyi karşılaştırır. birini parametre olarak gönderirirz. diğeri class içindedir.

public class ComparableT {
    public static void main(String args[]){
        ArrayList<Student> al=new ArrayList<Student>();
        al.add(new Student(101,"Vijay",23));
        al.add(new Student(106,"Ajay",27));
        al.add(new Student(105,"Jai",21));

        Collections.sort(al);
        for(Student st:al){
            System.out.println(st.rollno+" "+st.name+" "+st.age);
        }
    }
}
