package examples;

public class Query {
    private static String someString = "hello";
    private String name;

    public Query(String newName) {
        this.name = newName;
    }

    public static void main(String[] args) {
        Query query = new Query("Gordon");
        changeString(someString);
        changeName(query);
        System.out.println(someString + query.name);
    }

    public static void changeString(String str) {
        str = "Howdy";
    }

    public static void changeName(Query q) {
        q.name = "Lightfoot";
    }
}
