package BastanBasla.ConstuctorKullanimi1;

public class Main {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();
        rectangle.showInfo();
        Rectangle mert = new Rectangle(4, 10);
        mert.showInfo();
    }
}

class Rectangle {
    //this ile constructorı cagırırsın.
    private int x, y, width, height;

    public Rectangle(int x, int y, int width, int height) {
        this.x = x;
        this.y = y;
        this.width = width;
        this.height = height;
    }

    public Rectangle(int width, int height) {
        this(1, 3, 4, 5);
    }

    public Rectangle() {
        this(1, 1, 1, 1);
    }

    public void showInfo() {
        System.out.println(this.x + "-" + this.y + "-" + this.width + "-" + this.height);
    }
}
