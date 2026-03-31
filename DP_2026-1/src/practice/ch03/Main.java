package practice.ch03;

public class Main {
    public static void main(String[] args) {
        //자식 객체를 부모 타입으로 선언 해도 된다
        // CharDisplay d1= new CharDisplay('H'); // 'H' > Char, "H">>문자열
        AbstractDisplay d1 = new CharDisplay('H');
        d1.display();

        //StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world.");
        d2.display();

        //AbstractDisplay d3 = new AbstractDisplay(); // 오류. 추상 클래스는 객체를 생성할 수 없다

        
    }
}
