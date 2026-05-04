package ch12.Sample;

public class Main {
    public static void main(String[] args) {
        Display b1 = new StringDisplay("Hello, world."); //중심 객체

        Display b2 = new SideBorder(b1, '#'); // 첫번째 장식
        Display b3 = new FullBorder(b2); // 두번째 장식

        b1.show();
        b2.show();
        b3.show();

        Display b4 =
                    new SideBorder(
                        new FullBorder(
                            new FullBorder(
                                new SideBorder(
                                    new FullBorder(
                                        new StringDisplay("Hello, world.") // 중심 객체
                                    ),
                                    '*'
                                )
                            )
                        ),
                        '/'
                    );
        b4.show();
    }
}
