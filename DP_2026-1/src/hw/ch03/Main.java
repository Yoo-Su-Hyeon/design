package hw.ch03;

public class Main {
    public static void main(String[] args) {
        AbstractDisplay d1 = new CharDisplay('H');
        AbstractDisplay d2 = new StringDisplay("Hello");
        d1.display();
        d2.display();

        AbstractDisplay d3 = new CharDisplay('X', 3);
        AbstractDisplay d4 = new StringDisplay("Test", 7);
        d3.display();
        d4.display();

        AbstractDisplay num = new NumberDisplay(42, 4);
        num.display();
    }
}