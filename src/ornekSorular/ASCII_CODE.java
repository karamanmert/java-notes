package ornekSorular;
//soru: str"   Joe  Black   " baş son boşkuk sil. ortada sadece bir boşluk kalsın ve J** B**** yazsın.
public class ASCII_CODE {
    public static void main(String[] args) {
        String str = "   Joe      Black  Karaman ";
        joeBlack(str);
    }
    public static void joeBlack(String str){
        StringBuilder result= new StringBuilder();
        String s = str.trim();
        char ascii;
        boolean flag=false;

        for (int i = 0; i < s.length(); i++) {
            ascii = s.charAt(i);
            if (ascii >=65 && ascii<=95){
                if (flag)
                    result.append(" ");
                result.append(ascii);
                flag = true;
            }else if(ascii >=97 && ascii<=122){
                result.append("*");
            }
        }
        System.out.println(result);
    }

}
