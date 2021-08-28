package ornekSorular;

//3 e bölünürse fizz, 5 e buzz, 15 e fizzBuzz yazdır.
public class FizzBuzz {
    public static void main(String[] args) {
        fizzBuzz(20);
    }

    public static void fizzBuzz(int a) {
        String fizz = "fizz";
        String buzz = "buzz";
        String fizzBuzz = "fizzBuzz";
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= a; i++) {
            if (i % 15 == 0)
                result.append(fizzBuzz);
            else if (i % 5 == 0)
                result.append(buzz);
            else if (i % 3 == 0)
                result.append(fizz);
            else
                result.append(i);
        }
        System.out.println(result);
    }
}
