package practice.ch12;

public class Main {
    public static void main(String[] args) {
        Display d1 = new StringDisplay("Hello, world."); //중심 객체
        d1.show();

        Display d2 = new SideBorder(d1, '*'); // d1을 '*'로 장식
        d2.show();

        Display d3 = new FullBorder(d1); // d1을 완전한 테두리로 장식
        d3.show();

    }
}
