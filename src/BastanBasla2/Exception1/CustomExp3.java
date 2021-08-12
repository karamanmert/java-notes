package BastanBasla2.Exception1;

public class CustomExp3 {
    public static void main(String[] args) throws StudentIdNotFound {
        Student s=new Student(511);
        if(s.id==51)
        {
            System.out.println("bulundu.");
        }
        else
        {
            throw new StudentIdNotFound(); // sig olarak belirtilmeli. buraya yazmak tek yetmez.
        }


    }
}
class Student
{
    public int id;
    public Student(int id)
    {
        this.id=id;
    }
}
class StudentIdNotFound extends Exception
{
    public StudentIdNotFound()
    {
        System.out.println("***Student id bulunamadı.***");
    }
}